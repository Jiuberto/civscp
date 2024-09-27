// src/main/java/com/example/monitoramentoambiental/services/DisasterAlertService.java
package java.mode;
package com.example.monitoramentoambiental.models;
package com.example.monitoramentoambiental.controllers;
package com.example.monitoramentoambiental.services;


import com.example.monitoramentoambiental.models.DisasterAlert;
import com.example.monitoramentoambiental.repositories.DisasterAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisasterAlertService {
    @Autowired
    private DisasterAlertRepository repository;

    public List<DisasterAlert> findAll() {
        return repository.findAll();
    }

    public Optional<DisasterAlert> findById(Long id) {
        return repository.findById(id);
    }

    public DisasterAlert save(DisasterAlert alert) {
        return repository.save(alert);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

// src/main/java/com/example/monitoramentoambiental/services/AirQualityService.java
package com.example.monitoramentoambiental.services;

import com.example.monitoramentoambiental.models.AirQuality;
import com.example.monitoramentoambiental.repositories.AirQualityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirQualityService {
    @Autowired
    private AirQualityRepository repository;

    public List<AirQuality> findAll() {
        return repository.findAll();
    }

    public Optional<AirQuality> findById(Long id) {
        return repository.findById(id);
    }

    public AirQuality save(AirQuality airQuality) {
        return repository.save(airQuality);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

// src/main/java/com/example/monitoramentoambiental/services/WaterQualityService.java
package com.example.monitoramentoambiental.services;

import com.example.monitoramentoambiental.models.WaterQuality;
import com.example.monitoramentoambiental.repositories.WaterQualityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaterQualityService {
    @Autowired
    private WaterQualityRepository repository;

    public List<WaterQuality> findAll() {
        return repository.findAll();
    }

    public Optional<WaterQuality> findById(Long id) {
        return repository.findById(id);
    }

    public WaterQuality save(WaterQuality waterQuality) {
        return repository.save(waterQuality);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

// src/main/java/com/example/monitoramentoambiental/services/IrrigationControlService.java
package com.example.monitoramentoambiental.services;

import com.example.monitoramentoambiental.models.IrrigationControl;
import com.example.monitoramentoambiental.repositories.IrrigationControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IrrigationControlService {
    @Autowired
    private IrrigationControlRepository

    @Entity
public class DisasterAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; 
    private String location;
    private LocalDateTime alertTime;
    private String severity;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(LocalDateTime alertTime) {
        this.alertTime = alertTime;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}

