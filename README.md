This repository contains a microservices-based application implemented using Spring Boot, showcasing essential components of a microservices architecture. It includes:

1) API Gateway
2) Service Registry and Discovery (Eureka)
3) Load Balancing
4) Inter-service Communication (OpenFeign)
   
The application is divided into multiple microservices, each responsible for specific functionality.

Project Structure
1. Trips : Manages data related to trips offered by the company.
2. Users : Manages user-related data, including registered users of the system.
3. Quiz : Handles Quiz
4. Questions : Contains questions in all the quizzes
5. ApiGateway : A single-entry point for accessing all microservices. Configured with dynamic routing and load balancing.
6. Service Registry : Eureka Server for registering all microservices and enabling dynamic discovery and load balancing.

Technologies Used
1. Spring Boot
2. Eureka Server (Netflix OSS)
3. Spring Cloud Gateway
4. OpenFeign
5. Databases: MySQL for some services and PostgreSQL for others
6. Postman: For API testing

Features Implemented
1. Service Registry: All microservices are registered with the Eureka server for dynamic discovery.
2. Load Balancing: Eureka and API Gateway work together to automatically route requests to available instances of microservices.
3. Inter-service Communication: OpenFeign is used for seamless synchronous communication between microservices.
4. Dynamic Routing: API Gateway dynamically routes requests to the appropriate microservice based on configured routes.

Getting Started
PREREQUISITES
1. Java 17+
2. Maven
3. MySQL and PostgresSQL Databases
4. Postman (for testing)

Installation Steps
1. Clone the respository
2. Setup MySQL and PostgresSQL Database for the projects
3. Run Eureka Server
4. Run the microservices
5. Run Api Gateway
6. Hit the endpoints on postman and see the data
