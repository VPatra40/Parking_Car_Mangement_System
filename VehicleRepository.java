
package com.example.parkingbackend.repository;

import com.example.parkingbackend.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
