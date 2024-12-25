package com.softuniProject.dataBaseRestaurantTableManagement.repository;

import com.softuniProject.dataBaseRestaurantTableManagement.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area,Long> {
}
