package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationservice;

    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationservice.createlocation(le);
    }

    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationservice.getallLocation();
    }
}
