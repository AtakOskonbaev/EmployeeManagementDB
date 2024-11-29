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
