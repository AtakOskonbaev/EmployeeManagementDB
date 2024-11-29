# Employee Management System (Java + PostgreSQL)

This Java-based application manages employee data using a PostgreSQL database. The system implements **CRUD** (Create, Read, Update, Delete) operations on an `employee` table and interacts with the database using **JDBC**.

## Key Features:
- **Create**: Add a new employee to the database.
- **Read**: Retrieve employee details by their ID or fetch all employees.
- **Update**: Modify an employee's information (e.g., position, salary).
- **Delete**: Remove an employee from the database by their ID.

## Project Structure:
- **Employee Entity** (`Employee.java`): Represents an employee with attributes like `id`, `name`, `position`, `salary`, and `hire_date`.
- **EmployeeData** (`EmployeeData.java`): Handles database interactions (CRUD operations) using JDBC.
- **Main Class** (`Main.java`): Demonstrates how to use the CRUD operations to manage employee data.

## Database Setup:

1. **Install PostgreSQL**: If you don't have PostgreSQL installed, download it from the [official website](https://www.postgresql.org/download/).
2. **Create the Database**:
   ```sql
   CREATE DATABASE employee_db;
## Creating an employee:
![image](https://github.com/user-attachments/assets/50240065-9c1e-48b1-acdf-4cc4bc0d9811)

![image](https://github.com/user-attachments/assets/ccecdc34-c4f2-493b-ae71-5ab016c52e15)


## Deleting an employee:
![image](https://github.com/user-attachments/assets/faf545ec-8062-4e89-9249-6b9a0f64c10b)

![image](https://github.com/user-attachments/assets/2a190a17-d904-46fc-85dc-82d7aea4a137)


