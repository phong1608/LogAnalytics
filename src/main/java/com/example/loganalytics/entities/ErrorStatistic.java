package com.example.loganalytics.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "error_statistics", indexes = {
        @Index(columnList = "serviceName"),
        @Index(columnList = "errorType"),
        @Index(columnList = "timeBucket")
})
@Getter
@Setter
public class ErrorStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName; // user-service
    private String errorType;   // 500, 404, ValidationError...

    private Long count;         // số lỗi trong time window

    private Instant timeBucket; // gộp theo phút/giờ

}
