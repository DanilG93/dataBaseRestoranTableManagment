package com.softuniProject.dataBaseRestaurantTableManagement.repository;

import com.softuniProject.dataBaseRestaurantTableManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<User,Long> {

}
