#  Globalest

> **Globalest** es una plataforma orientada a experiencias de viaje y geolocalización, diseñada como red social para compartir vivencias entre usuarios y descubrir tours patrocinados por empresas locales.
>
>

---

##  Stack Tecnológico

Este proyecto aplica los estándares de la Arquitectura Hexagonal y tecnologías modernas de desarrollo:

* **Backend:** Java 25 + Spring Boot 4.1.2
* 
* **Base de Datos:** PostgreSQL con extensión **PostGIS** para consultas geoespaciales avanzadas


* **Caché y Concurrencia:** Servidor Redis


* **Frontend (Móvil y Web):** React Native (con soporte para React Native Web)


* **Seguridad:** Autenticación y control de accesos mediante **JWT** (JSON Web Tokens)


* **Documentación de API:** OpenAPI / Swagger UI


* **Despliegue y Entorno:** Docker & Docker Compose junto a Git para control de versiones



---

##  Arquitectura del Backend

El backend sigue estrictamente el patrón de **Arquitectura Hexagonal (Ports & Adapters)** organizado por dominios (*Package by Feature*), aislando la lógica de negocio de los detalles de infraestructura:

```text
com.sebas.globalest/
├── shared/                 <-- Configuración transversal (Seguridad JWT, Excepciones, Swagger)
├── tour/                   <-- Módulo de Tours y Geolocalización (Domain, Application, Infrastructure)
├── user/                   <-- Módulo de Usuarios y Roles (Viajeros y Empresas)
├── booking/                <-- Módulo de Reservas
└── chat/                   <-- Módulo de comunicación en tiempo real (WebSockets / STOMP)

```

---

## Puesta en Marcha (Entorno Local)

### 1. Clonar el repositorio

```bash
git clone https://github.com/booleanSoX/Globalest.git
cd Globalest

```

### 2. Levantar servicios de infraestructura (PostgreSQL/PostGIS y Redis)

Asegúrate de tener Docker instalado en tu equipo y ejecuta en la raíz del proyecto:

```bash
docker-compose up -d

```

### 3. Ejecutar el Backend (Spring Boot)

Utiliza Maven para arrancar la aplicación de Spring Boot:

```bash
./mvnw spring-boot:run

```

*(La API estará disponible por defecto en `http://localhost:8080` y la documentación interactiva en Swagger UI).*

---

## ️ MVP (Versión 1.0)

* **Rol Viajero:** Registro de destinos visitados sobre mapa interactivo, subida de experiencias y consulta del feed de amigos.
* **Rol Empresa:** Perfiles verificados con publicación de tours y experiencias geolocalizadas.

---

