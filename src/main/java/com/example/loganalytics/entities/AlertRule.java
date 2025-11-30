package com.example.loganalytics.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alert_rules")
@Getter
@Setter
public class AlertRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private String level;            // ERROR/WARN
    private String conditionType;    // COUNT, RATE, SPIKE...
    private Long threshold;          // ví dụ > 50 lỗi/phút

    private Integer timeWindowSec;   // ví dụ 60s

    private Boolean active;

    private String notificationChannel;

}

