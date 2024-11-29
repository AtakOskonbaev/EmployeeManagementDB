# Employee Management System with PostgreSQL

## Description

The **Employee Management System** is a Java-based application integrated with a PostgreSQL database. It provides a comprehensive solution for managing employee records, including adding, updating, viewing, and deleting data. This project demonstrates the power of Java's backend capabilities in conjunction with a relational database to handle structured data effectively.

The main purpose of this project is to showcase database management skills and backend programming in Java.

---

## Features

- **Add Employees**: Insert new employee records with details such as name, age, department, and salary.
- **View Employees**: Retrieve and display all employee records.
- **Update Employees**: Modify existing employee information.
- **Delete Employees**: Remove records from the database.
- **Search Functionality**: Search employees by specific criteria such as department, ID, or name.

---

## Technologies Used

- **Programming Language**: Java
- **Database**: PostgreSQL
- **Libraries/Tools**:
  - JDBC (Java Database Connectivity) for database interaction
  - SQL scripts for database initialization and management
  - IDE: IntelliJ IDEA/Eclipse (or any other Java IDE)
  - PostgreSQL Client (e.g., pgAdmin)

---

## Instructions on How to Run the Program

### **1. Set Up the PostgreSQL Database**

1. **Install PostgreSQL**:
   - Download and install PostgreSQL from [official website](https://www.postgresql.org/download/).
   - Start the PostgreSQL server.

2. **Create a Database**:
   ```sql
   CREATE DATABASE employee_management;
   ```

---

### **2. Set Up the Java Application**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AtakOskonbaev/EmployeeManagementDB.git
   cd EmployeeManagementDB
   ```

2. **Configure the Database Connection**:
   Open the configuration file (e.g., `dbConfig.java`) and update the PostgreSQL connection details:
   ```java
   public class dbConfig {
       public static final String URL = "jdbc:postgresql://localhost:5432/employee_management";
       public static final String USER = "your_username";
       public static final String PASSWORD = "your_password";
   }
   ```
   
---
   
## Creating an employee:
![image](https://github.com/user-attachments/assets/50240065-9c1e-48b1-acdf-4cc4bc0d9811)

![image](https://github.com/user-attachments/assets/ccecdc34-c4f2-493b-ae71-5ab016c52e15)


## Deleting an employee:
![image](https://github.com/user-attachments/assets/faf545ec-8062-4e89-9249-6b9a0f64c10b)

![image](https://github.com/user-attachments/assets/2a190a17-d904-46fc-85dc-82d7aea4a137)


