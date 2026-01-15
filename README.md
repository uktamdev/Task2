# Task 2 - Spring Boot REST API (Products)

This project is a REST API application built with Spring Boot.

## ✅ Technologies
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Swagger UI (Springdoc OpenAPI)

## ✅ Endpoints
- POST `/api/v1/products`
- GET `/api/v1/products`
- GET `/api/v1/products/{id}`
- PUT `/api/v1/products/{id}`
- DELETE `/api/v1/products/{id}`

## ✅ Swagger UI
Open in browser:
http://localhost:8080/swagger-ui/index.html

## ✅ H2 Console
Open in browser:
http://localhost:8080/console

Login settings:
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (empty)

## ✅ Notes
- The database is in-memory, so data will be cleared after application restart.

## ✅ Screenshots

### ✅ Swagger POST
![Swagger POST](task2.1.png)

### ✅ Swagger GET ALL
![Swagger GET ALL](task2.2.png)

### ✅ Swagger GET BY ID
![Swagger GET BY ID](task2.3.png)

### ✅ Swagger PUT Update
![Swagger PUT](task2.4.png)

### ✅ Swagger DELETE
![Swagger DELETE](task2.5.png)

### ✅ ERROR
![ERROR](task2.6.png)

### ✅ H2 Console
![H2 Console](task2.7.png)
