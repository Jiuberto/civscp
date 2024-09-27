package java.mode;

// src/main/java/com/example/monitoramentoambiental/controllers/DisasterAlertController.java


import com.example.monitoramentoambiental.models.DisasterAlert;
import com.example.monitoramentoambiental.services.DisasterAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disaster-alerts")
public class DisasterAlertController {
    @Autowired
    private DisasterAlertService service;

    @GetMapping
    public List<DisasterAlert> getAllAlerts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisasterAlert> getAlertById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DisasterAlert createAlert(@RequestBody DisasterAlert alert) {
        return service.save(alert);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisasterAlert> updateAlert(@PathVariable Long id, @RequestBody DisasterAlert alert) {
        return service.findById(id)
                .map(existingAlert -> {
                    alert.setId(existingAlert.getId());
                    return ResponseEntity.ok(service.save(alert));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlert(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

// src/main/java/com/example/monitoramentoambiental/controllers/AirQualityController.java
package com.example.monitoramentoambiental.controllers;

import com.example.monitoramentoambiental.models.AirQuality;
import com.example.monitoramentoambiental.services.AirQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/air-quality")
public class AirQualityController {
    @Autowired
    private AirQualityService service;

    @GetMapping
    public List<AirQuality> getAllAirQualityReadings() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirQuality> getAirQualityById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AirQuality createAirQualityReading(@RequestBody AirQuality airQuality) {
        return service.save(airQuality);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AirQuality> updateAirQualityReading(@PathVariable Long id, @RequestBody AirQuality airQuality) {
        return service.findById(id)
                .map(existingAirQuality -> {
                    airQuality.setId(existingAirQuality.getId());
                    return ResponseEntity.ok(service.save(airQuality));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirQualityReading(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

// src/main/java/com/example/monitoramentoambiental/controllers/WaterQualityController.java
package com.example.monitoramentoambiental.controllers;

import com.example.monitoramentoambiental.models.WaterQuality;
import com.example.monitoramentoambiental.services.WaterQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/water-quality")
public class WaterQualityController {
    @Autowired
    private WaterQualityService service;

    @GetMapping
    public List<WaterQuality> getAllWaterQualityReadings() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WaterQuality> getWaterQualityById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WaterQuality createWaterQualityReading(@RequestBody WaterQuality waterQuality) {
        return service.save(waterQuality);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WaterQuality> updateWaterQualityReading(@PathVariable Long id, @RequestBody WaterQuality waterQuality) {
        return service.findById(id)
                .map(existingWaterQuality -> {
                    waterQuality.setId(existingWaterQuality.getId());
                    return ResponseEntity.ok(service.save(waterQuality));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWaterQualityReading(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

// src/main/java/com/example/monitoramentoambiental/controllers/IrrigationControlController.java
package com.example.monitoramentoambiental.controllers;

import com.example.monitoramentoambiental.models.IrrigationControl;
import com.example.monitoramentoambiental.services.IrrigationControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/irrigation-control")
public class IrrigationControlController {
    @Autowired
    private IrrigationControlService service;

    @GetMapping
    public List<IrrigationControl> getAllIrrigationControls() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IrrigationControl> getIrrigationControlById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public IrrigationControl createIrrigationControl(@RequestBody IrrigationControl control) {
        return service.save(control);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IrrigationControl> updateIrrigationControl(@PathVariable Long id, @RequestBody IrrigationControl control) {
        return service.findById(id)
                .map(existingControl -> {
                    control.setId(existingControl.getId());
                    return ResponseEntity.ok(service.save(control));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIrrigationControl(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

