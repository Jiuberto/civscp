// src/main/java/com/example/monitoramentoambiental/models/DisasterAlert.java
package java.mode;
package com.example.monitoramentoambiental.controllers;

import javax.persistence.*;
import java.time.LocalDateTime;
import com.example.monitoramentoambiental.models.AirQuality;
import com.example.monitoramentoambiental.services.AirQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
package com.example.monitoramentoambiental.controllers;

import com.example.monitoramentoambiental.models.AirQuality;
import com.example.monitoramentoambiental.services.AirQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;


@Entity
public class DisasterAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // flood, wildfire, earthquake
    private String location;
    private LocalDateTime alertTime;
    private String severity;

    // getters and setters
}

// src/main/java/com/example/monitoramentoambiental/models/AirQuality.java
package com.example.monitoramentoambiental.models;

import javax.persistence.*;
        import java.time.LocalDateTime;

@Entity
public class AirQuality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private LocalDateTime timestamp;
    private double pm25;
    private double pm10;
    private double ozone;

    // getters and setters
}

// src/main/java/com/example/monitoramentoambiental/models/WaterQuality.java
package com.example.monitoramentoambiental.models;

import javax.persistence.*;
        import java.time.LocalDateTime;

@Entity
public class WaterQuality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private LocalDateTime timestamp;
    private double ph;
    private double turbidity;
    private double contaminants;

    // getters and setters
}

// src/main/java/com/example/monitoramentoambiental/models/IrrigationControl.java
package com.example.monitoramentoambiental.models;

import javax.persistence.*;
        import java.time.LocalDateTime;

@Entity
public class IrrigationControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String area;
    private boolean status; // on/off
    private LocalDateTime lastUpdated;

    // getters and setters
}
