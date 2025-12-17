package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LocationRepository;
import com.example.demo.entity.LocationEntity;
@Service
public class LocationServiceimp implements LocationService{
    @Autowired
    LocationRepository LocationRepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return LocationRepo.save(le);
    }
    public List<LocationEntity> getLL(){
        return LocationRepo.findAll();
    }
    @Override
    public List<LocationEntity> getallLocation() {
        throw new UnsupportedOperationException("Unimplemented method 'getallLocation'");
    }

}
