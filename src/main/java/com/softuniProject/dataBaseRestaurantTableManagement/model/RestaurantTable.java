package com.softuniProject.dataBaseRestaurantTableManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int tableNumber;

    private int capacity;

    @Column(nullable = false)
    private Boolean occupied = false;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;
}
