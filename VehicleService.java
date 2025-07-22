
package com.example.parkingbackend.service;

import com.example.parkingbackend.model.Vehicle;
import com.example.parkingbackend.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return repository.findAll();
    }
}
