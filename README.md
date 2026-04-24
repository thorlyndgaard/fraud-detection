# Fraud Detection Service (rePlikant) 🛡️

## 🚀 Overview

The **Fraud Detection Service** is a core component of the rePlikant ecosystem. It acts as an intelligent consumer in an event-driven architecture, designed to monitor transaction streams and identify potentially fraudulent activities in real-time.

By consuming events published by the **Transaction Service**, it applies business rules to evaluate risk, persists the analysis results, and ensures the integrity of the financial flow.

---

## 🧱 Responsibilities

* **Consume** transaction events from Apache Kafka in real-time.
* **Analyze** incoming data based on predefined fraud patterns (e.g., high-value thresholds).
* **Persist** analysis results (status, timestamp, and transaction metadata) in PostgreSQL.
* **Monitor** and log suspicious activities for auditing purposes.

---

## 🧰 Technologies

* **Java 21**
* **Spring Boot 3.3.5**
* **Spring Data JPA**
* **Apache Kafka** (Consumer API)
* **PostgreSQL**
* **Docker / Docker Compose**
* **Lombok**

---

## 📦 Infrastructure

The service is fully containerized and integrated into the Replikant Docker network:

* **PostgreSQL**: Dedicated database (`frauddb`) for storing analysis history.
* **Apache Kafka**: Connected to the `transactions-topic` to receive upstream data.
* **Kafka UI**: Used for debugging message consumption and offset management.

---

## 🔄 Data Flow

```text
Kafka (Transaction Event)
      ↓
Fraud Detection Service (Consumer)
      ↓
Fraud Analysis Logic (Rules/Validation)
      ↓
PostgreSQL (Analysis Persistence)