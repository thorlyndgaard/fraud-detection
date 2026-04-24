package com.rePlikant.fraud_detection.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionDTO {
    private Long transactionId;
    private Long userId;
    private BigDecimal amount;
    private String country;
}