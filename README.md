# MySQL Spring Boot REST API

A Student Management REST API built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Project Overview

This project is a backend REST API for managing student records. It provides CRUD (Create, Read, Update, Delete) operations through RESTful endpoints.

The application uses Spring Boot to create the REST API, Spring Data JPA and Hibernate for database interaction, and MySQL for storing student information.

## Technologies Used

- Java 17
- Spring Boot 3.1.4
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Postman

## Features

- Add a new student
- View all students
- View a specific student by ID
- Update student details
- Delete student details
- Store student data in a MySQL database
- Automatic database table management using Hibernate

## Project Structure

```text
MySQL-SpringBoot-REST-API/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cs/MySQLRestApi/
│       │       ├── MySqlRestApiApplication.java
│       │       ├── Student.java
│       │       ├── StudentController.java
│       │       └── StudentRepository.java
│       │
│       └── resources/
│           └── application.properties
│
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
````

## Database Configuration

The application uses MySQL with a database named:

```text
StudentDatabase
```

Create the database in MySQL:

```sql
CREATE DATABASE StudentDatabase;
```

The Student entity is mapped to the following table:

```text
studenttable
```

Hibernate is configured to automatically create or update the table using:

```properties
spring.jpa.hibernate.ddl-auto=update
```

## Configuration

Update the database configuration in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/StudentDatabase
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

server.port=8000

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

Note: Do not commit your actual MySQL password to GitHub. Replace `YOUR_PASSWORD` with your local database password.

## How to Run

### Prerequisites

Make sure the following are installed:

* Java 17
* MySQL Server
* Eclipse IDE or another Java IDE
* Maven
* Postman for API testing

### Steps

1. Clone the repository:

```bash
git clone https://github.com/manish0505/MySQL-SpringBoot-REST-API.git
```

2. Open the project in Eclipse as a Maven project.

3. Configure your MySQL database in:

```text
src/main/resources/application.properties
```

4. Make sure the `StudentDatabase` database exists.

5. Run:

```text
MySqlRestApiApplication.java
```

6. The application runs on:

```text
http://localhost:8000
```

## REST API Endpoints

| Operation         | HTTP Method | Endpoint                    |
| ----------------- | ----------- | --------------------------- |
| Add Student       | POST        | `/studenttable/add`         |
| View All Students | GET         | `/studenttable/view/all`    |
| View Student      | GET         | `/studenttable/view/{id}`   |
| Update Student    | PUT         | `/studenttable/edit/{id}`   |
| Delete Student    | DELETE      | `/studenttable/delete/{id}` |

## API Testing with Postman

### 1. Add Student

Method: POST

```text
http://localhost:8000/studenttable/add
```

Request Body:

```json
{
    "student_id": 1,
    "student_name": "Manish"
}
```

### 2. View All Students

Method: GET

```text
http://localhost:8000/studenttable/view/all
```

### 3. View Student by ID

Method: GET

```text
http://localhost:8000/studenttable/view/1
```

### 4. Update Student

Method: PUT

```text
http://localhost:8000/studenttable/edit/1
```

Request Body:

```json
{
    "student_name": "Manish R"
}
```

### 5. Delete Student

Method: DELETE

```text
http://localhost:8000/studenttable/delete/1
```

## Architecture

The project follows a simple layered structure:

```text
Client / Postman
       |
       v
StudentController
       |
       v
StudentRepository
       |
       v
Spring Data JPA / Hibernate
       |
       v
MySQL Database
```

### StudentController

Handles HTTP requests and provides the REST API endpoints.

### Student

JPA entity representing a student record in the database.

### StudentRepository

Uses Spring Data JPA's `JpaRepository` to perform database operations.

### MySqlRestApiApplication

The main Spring Boot application class used to start the application.

## Learning Outcomes

Through this project, I worked with:

* Java backend development
* Spring Boot application development
* REST API development
* CRUD operations
* Spring Data JPA
* Hibernate ORM
* MySQL database integration
* Maven dependency management
* API testing using Postman

## Author

Manish R

GitHub: [https://github.com/manish0505](https://github.com/manish0505)

````
