package com.rePlikant.fraud_detection.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_analysis")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FraudAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long transactionId;
    private BigDecimal amount;
    private String status; // APPROVED ou REJECTED
    private LocalDateTime analyzedAt;
}