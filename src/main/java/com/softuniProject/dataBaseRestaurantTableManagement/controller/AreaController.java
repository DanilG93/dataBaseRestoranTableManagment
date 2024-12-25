//package com.softuniProject.dataBaseRestoranTableManagment.controller;
//
//import com.softuniProject.dataBaseRestoranTableManagment.model.DTO.AreaUpdateDTO;
//import com.softuniProject.dataBaseRestoranTableManagment.model.Area;
//import com.softuniProject.dataBaseRestoranTableManagment.model.DTO.AreaDTO;
//import com.softuniProject.dataBaseRestoranTableManagment.service.AreaService;
//import lombok.AllArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/areas")
//@AllArgsConstructor
//public class AreaController {
//
//    private AreaService areaService;
//    private ModelMapper modelMapper;
//
//    @GetMapping
//    public List<Area> getAllAreas() {
//        System.out.println("aaxax");
//        return areaService.findAll();
//    }
//
//    @PostMapping
//    public Area createArea(@RequestBody AreaDTO areaDTO) {
//        Area area = new Area();
//        area.setName(areaDTO.getName());
//        System.out.println(area);
//
//
//        Area area1 = modelMapper.map(areaDTO, Area.class);
//        return areaService.saveArea(area);
//    }
//
//
//    @PutMapping("/update")
//    public ResponseEntity<Area> updateArea(@RequestBody AreaUpdateDTO areaUpdateDTO) {
//        Area area = areaService.findById(areaUpdateDTO.getId());
//        if (area == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        area.setName(areaUpdateDTO.getName());
//
//        areaService.saveArea(area);
//        return ResponseEntity.ok(area);
//    }
//
//
//}
