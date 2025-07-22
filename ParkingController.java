
package com.example.parkingbackend.controller;

import com.example.parkingbackend.model.Vehicle;
import com.example.parkingbackend.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class ParkingController {

    private final VehicleService service;

    public ParkingController(VehicleService service) {
        this.service = service;
    }

    @PostMapping
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle) {
        return service.save(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return service.getAllVehicles();
    }
}
