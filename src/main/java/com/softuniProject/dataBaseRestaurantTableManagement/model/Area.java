package com.softuniProject.dataBaseRestaurantTableManagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Naziv prostorije

    private String description; // Opis prostorije (opciono)

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<RestaurantTable> tables = new ArrayList<>();
}