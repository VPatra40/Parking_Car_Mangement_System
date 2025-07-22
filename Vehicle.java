package com.example.parkingbackend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String vehicleName;
    private String vehicleNumber;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;

    // Default constructor (required by JPA)
    public Vehicle() {
    }

    // All-args constructor (optional but helpful)
    public Vehicle(Long id, String name, String vehicleName, String vehicleNumber, LocalDateTime entryDate, LocalDateTime exitDate) {
        this.id = id;
        this.name = name;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDateTime exitDate) {
        this.exitDate = exitDate;
    }
}
