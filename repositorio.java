// src/main/java/com/example/monitoramentoambiental/repositories/DisasterAlertRepository.java
package com.example.monitoramentoambiental.repositories;

import com.example.monitoramentoambiental.models.DisasterAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisasterAlertRepository extends JpaRepository<DisasterAlert, Long> {}

// src/main/java/com/example/monitoramentoambiental/repositories/AirQualityRepository.java
package com.example.monitoramentoambiental.repositories;

import com.example.monitoramentoambiental.models.AirQuality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirQualityRepository extends JpaRepository<AirQuality, Long> {}

// src/main/java/com/example/monitoramentoambiental/repositories/WaterQualityRepository.java
package com.example.monitoramentoambiental.repositories;

import com.example.monitoramentoambiental.models.WaterQuality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterQualityRepository extends JpaRepository<WaterQuality, Long> {}

// src/main/java/com/example/monitoramentoambiental/repositories/IrrigationControlRepository.java
package com.example.monitoramentoambiental.repositories;

import com.example.monitoramentoambiental.models.IrrigationControl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrrigationControlRepository extends JpaRepository<IrrigationControl, Long> {}
