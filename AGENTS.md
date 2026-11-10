# 🤖 Instructions for AI Agents (Globalest Project)

Welcome, AI Assistant! You are collaborating on **Globalest**, a high-performance travel experience platform and social network built by Sebastián Tovar. 

Before proposing any code, refactoring, or architectural additions, you **must** read and adhere to the guidelines outlined in this document.

---

## 🏗️ 1. Core Architecture: Hexagonal & Package by Feature

Globalest strictly enforces **Hexagonal Architecture (Ports and Adapters)** organized by business capabilities (*Package by Feature*). 

- **Domain Layer (`domain/model`, `domain/port`)**: 
  - Must be **pure Java**. It must **never** depend on Spring Framework, JPA/Hibernate annotations, or external infrastructure details.
  - Value Objects and business rules live here.
- **Application Layer (`application/service`)**: 
  - Contains use case implementations that orchestrate domain models using ports.
- **Infrastructure Layer (`infrastructure/adapter`)**: 
  - Contains all framework-specific code, web controllers, DTOs, security filters, and persistence adapters (Spring Data JPA entities, repositories, PostGIS mappings, Redis clients).

---

## 🛠️ 2. Technology Stack Constraints

When suggesting code or libraries, strictly adhere to Sebastián's defined stack:
* **Backend:** Java 25 + Spring Boot 4.1.2
* **Database & GIS:** PostgreSQL with **PostGIS** extension for spatial data (use JTS Topology Suite / Hibernate Spatial where applicable).
* **Cache / Concurrency:** Redis.
* **Security:** JWT (JSON Web Tokens) for authentication.
* **Communication:** WebSockets with STOMP protocol for real-time messaging.
* **Frontend:** React Native (supporting React Native Web).
* **API Documentation:** OpenAPI / Swagger UI.
* **Tooling:** Maven, Docker & Docker Compose, Git.

---

## 📝 3. Rules for Code Generation & Suggestions

1. **Preserve Domain Purity:** Never suggest putting `@Entity`, `@RestController`, or Spring annotations inside the `domain` package.
2. **DTOs over Entities:** Never expose internal JPA entities directly through REST controllers. Always map them to Request/Response DTOs.
3. **Clean Code & Idiomatic Java:** Leverage modern Java 25 features (records, pattern matching, text blocks) where appropriate.
4. **No Direct Code Dumping:** Explain *why* behind architectural decisions. Use concise snippets that fit cleanly into the hexagonal structure we've established.
5. **Respect the MVP Scope:** Keep implementations focused on the core MVP (Traveler/Company roles, geolocalized posts, PostGIS queries) and avoid prematurely adding features like full AI integration or complex chat modules unless explicitly requested.

---
*Maintained by Sebastián Tovar for Globalest.*