# 🎓 Student Management System - Spring Boot + MySQL

This is a simple **CRUD RESTful API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL** to manage students. It follows a clean **MVC architecture** and is ideal for beginners learning backend development with Spring Boot.

---

## 🚀 Features

- ✅ Add/Register a Student
- ✅ View a Single Student by ID
- ✅ View All Students
- ✅ Update Student Details
- ✅ Delete a Student
- ✅ MySQL integration
- ✅ MVC Structure (Model-View-Controller)

---

## 🧰 Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Postman (for API testing)

---

## 🏗️ Project Structure

student-management/
├── controller/
│ └── StudentController.java
├── model/
│ └── Student.java
├── repository/
│ └── StudentRepository.java
├── service/
│ ├── StudentService.java
│ └── StudentServiceImpl.java
├── StudentManagementApplication.java
└── application.properties



Update application.properties
properties

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=6771

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


🧪 Run the Application

./mvnw spring-boot:run


📫 API Endpoints (Base URL: http://localhost:8080/api/students)
Method	Endpoint	  Description
POST	    /	        Create/Register student
GET	      /	        Get all students
GET	    /{id}	      Get student by ID
PUT	    /{id}	      Update student
DELETE	  /{id}	     Delete student

