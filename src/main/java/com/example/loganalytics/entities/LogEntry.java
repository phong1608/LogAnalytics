package com.example.loganalytics.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "log_entries", indexes = {
        @Index(columnList = "serviceName"),
        @Index(columnList = "level"),
        @Index(columnList = "endpoint"),
        @Index(columnList = "timestamp")
})
@Getter
@Setter
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant timestamp;

    private String level;       // ERROR, WARN, INFO...
    private String message;
    private String serviceName;
    private String endpoint;
    private Long userId;

    @Column(columnDefinition = "TEXT")
    private String rawJson;     // lưu raw log để debug

    // Getters/Setters
}
