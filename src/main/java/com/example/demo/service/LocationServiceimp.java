package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationServiceimp implements LocationService {

    @Autowired
    private LocationRepository locationRepo;

    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationRepo.save(le);
    }

    @Override
    public List<LocationEntity> getallLocation() {
        return locationRepo.findAll();
    }
}
