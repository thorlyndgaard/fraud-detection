package com.rePlikant.fraud_detection.repository;

import com.rePlikant.fraud_detection.entity.FraudAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudAnalysisRepository extends JpaRepository<FraudAnalysis, Long> {
}