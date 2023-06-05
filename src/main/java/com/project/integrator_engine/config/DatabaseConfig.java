package com.project.integrator_engine.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com/project/integrator_engine/mysqlrepositories")
@EnableMongoRepositories(basePackages = "com/project/integrator_engine/mongorepositories")
public class DatabaseConfig {
    //additional configuration using beans if needed
//
//    DataSource Bean:
//    Spring Boot provides a default DataSource bean configured with connection details based on the properties
//    defined in the application's configuration file (application.properties or application.yml). \
//    The DataSource bean represents the connection pool to the database.
//
//    Database Driver:
//    Spring Boot automatically detects the MySQL driver dependency on the classpath and loads it.\
//    The driver handles the communication between the application and the MySQL database.
//
//    Connection Pool:
//    By default, Spring Boot uses HikariCP as the connection pooling library.
//    It creates and manages a pool of database connections for efficient connection handling.
//    HikariCP is the default connection pool implementation starting from Spring Boot 2.x.
//
//    JdbcTemplate or Spring Data JPA:
//    To interact with the MySQL database, you can choose to use either Spring's JdbcTemplate or Spring Data JPA.
//
//    JdbcTemplate: If you choose to use JdbcTemplate, you can create an instance of JdbcTemplate and inject it into your application components.
//    It provides methods for executing SQL queries and updates against the database.
//
//    Spring Data JPA: If you prefer to use an ORM (Object-Relational Mapping) approach with JPA (Java Persistence API),
//    you can define entity classes, repositories, and use Spring Data JPA.
//    Spring Data JPA provides convenient abstractions and auto-generated implementations for performing common database operations.
//
//    Configuration Properties:
//    The database connection details, such as the URL, username, password, and other settings,
//    are typically defined in the application's configuration file (application.properties or application.yml).
//    Spring Boot reads these properties and configures the DataSource bean accordingly.
//
//    Transaction Management:
//    Spring Boot enables transaction management for the MySQL connection by default.
//    It uses the @Transactional annotation or declarative transaction management to handle transactions in a seamless manner.
//    This allows you to define transactional boundaries and ensures data consistency and integrity.
//
//    These are some of the key components and configurations involved when connecting to a MySQL database through Spring Boot.
//    The combination of these components simplifies the database connection setup,
//    provides connection pooling for efficient resource utilization, and offers convenient abstractions for database operations.
//






}
