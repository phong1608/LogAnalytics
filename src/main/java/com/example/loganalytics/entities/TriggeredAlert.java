package com.example.loganalytics.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "triggered_alerts", indexes = {
        @Index(columnList = "timestamp")
})
@Getter
@Setter
public class TriggeredAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant timestamp;

    private String serviceName;
    private String level;
    private String message;

    @ManyToOne
    @JoinColumn(name = "alert_rule_id")
    private AlertRule rule;

    // Getters/Setters
}
