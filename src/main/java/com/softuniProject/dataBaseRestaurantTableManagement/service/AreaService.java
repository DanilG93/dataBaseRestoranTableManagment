package com.softuniProject.dataBaseRestaurantTableManagement.service;

import com.softuniProject.dataBaseRestaurantTableManagement.model.Area;
import com.softuniProject.dataBaseRestaurantTableManagement.repository.AreaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AreaService {

    private AreaRepository areaRepository;

    public List<Area> findAll() {
        return areaRepository.findAll();
    }

    public Area saveArea(Area area) {
        return areaRepository.save(area);
    }

    public Area findById(Long id) {
        return areaRepository.findById(id).orElse(null);
    }
}
