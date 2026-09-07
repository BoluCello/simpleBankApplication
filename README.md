# Simple Bank Application

A backend banking application built with **Java and Spring Boot**, designed to model core banking operations through a clean RESTful API.

This project is being developed as a practical backend engineering project, with an emphasis on understanding how production-style Java and Spring Boot applications are structured, rather than simply implementing CRUD operations.

## Overview

`simpleBankApplication` is a REST API for managing basic banking operations and domain objects.

The project currently focuses on establishing a solid backend foundation using:

* Java
* Spring Boot
* Spring Web
* Object-Oriented Programming
* Dependency Injection
* RESTful API design
* Layered application architecture

The application is intentionally being developed incrementally, with additional persistence, validation, testing, security, and infrastructure capabilities planned as the project evolves.

## Architecture

The application follows a layered architecture that separates responsibilities between different parts of the system:

```text
Client
  │
  ▼
Controller
  │
  ▼
Service
  │
  ▼
Repository / Data Access
  │
  ▼
Database
```

### Controller Layer

Responsible for:

* Receiving HTTP requests
* Mapping requests to application operations
* Returning appropriate HTTP responses

### Service Layer

Contains the application's business logic.

Services are responsible for coordinating operations and keeping business rules separate from HTTP concerns.

### Repository / Data Access Layer

Responsible for communicating with the persistence layer.

> The architecture will evolve as persistence and additional backend capabilities are introduced.

## Current Functionality

The current version establishes the core Spring Boot application structure and banking domain.

Implemented concepts include:

* Spring Boot application configuration
* Dependency Injection
* Component scanning
* Service-layer architecture
* REST controllers
* HTTP request mapping
* Response handling
* Basic banking/payment operations
* Java object-oriented design

## Technology Stack

| Technology    | Purpose                         |
| ------------- | ------------------------------- |
| Java          | Primary programming language    |
| Spring Boot   | Backend application framework   |
| Spring Web    | REST API development            |
| Maven         | Build and dependency management |
| IntelliJ IDEA | Development environment         |
| Git / GitHub  | Version control                 |

## Project Structure

```text
simpleBankApplication/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── learning/
│   │               └──  simpleBank/
│   │                   ├── ...
│   │
│   └── test/
│
├── pom.xml
├── .gitignore
└── README.md
```

The package structure follows standard Java/Spring conventions and is organized around the application's domain and responsibilities.

## Running the Application

### Prerequisites

Make sure you have the following installed:

* Java 17+
* Maven
* IntelliJ IDEA (or another Java IDE)

### Clone the repository

```bash
git clone <repository-url>
cd simpleBankApplication
```

### Run with Maven

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Alternatively, run the main Spring Boot application class directly from IntelliJ IDEA.

## API

The application exposes REST endpoints for interacting with the banking domain.

Example request:

```http
DELETE /{id}
```

Additional endpoints will be documented here as the API develops.

## Engineering Goals

This project is being built incrementally to demonstrate progression from a basic Spring Boot application toward a more production-oriented backend system.

Planned improvements include:

* PostgreSQL persistence
* Spring Data JPA / Hibernate
* Request validation
* Global exception handling
* Unit and integration testing
* Authentication and authorization
* Transaction management
* Database migrations
* Redis caching
* Concurrency considerations
* Docker
* CI/CD
* Cloud deployment
* API documentation

## What I'm Learning

The project serves as a practical implementation of backend engineering concepts including:

* Java object-oriented programming
* Dependency injection and inversion of control
* Spring Boot application architecture
* REST API design
* Separation of concerns
* Service-oriented application design
* Database-backed application development
* Testing and maintainability
* Production-oriented backend engineering

## Development Status

🚧 **In active development**

The application is intentionally being built in stages. Features and architecture will continue to evolve as additional backend engineering concepts are introduced.

## Author

**Boluwatife Akintunde**

Backend software engineering project focused on Java, Spring Boot, REST APIs, databases, and scalable backend systems.
