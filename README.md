# University Management System (UMS)

Welcome to the **University Management System (UMS)** project! This system aims to streamline the management of student and teacher data, leaves, marks, and other essential university functions.

The University Management System (UMS) is designed to be a complete solution for managing student and teacher records, marks, fee structures, leave applications, and more.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [System Requirements](#system-requirements)
- [Directory Structure](#directory-structure)
- [Files Overview](#files-overview)
- [Setup Instructions](#setup-instructions)
- [How to Use](#how-to-use)
- [License](#license)

---

## Project Overview

The **University Management System (UMS)** is an integrated software solution designed to manage various administrative tasks in universities such as:

- **User Management**: Students and teachers can register, login, and manage their accounts.
- **Student Management**: Add, update, and view student details.
- **Faculty Management**: Add, update, and view teacher details.
- **Marks and Fee Management**: Manage student marks, fee structures, and fee form submissions.
- **Leave Management**: Allows students and teachers to request leave and view leave details.
- **Examination Management**: Manages and displays student examination details.

This project is built using Java, and it integrates with a MySQL database for storing data.

---

## Features

- **Login System**: Secure login for both students and teachers with their respective credentials.
- **User Registration**: Ability to register new students and teachers.
- **Dashboard**: A central hub to manage student and teacher details, marks, and leave.
- **Marks Entry**: Teachers can enter student marks.
- **Leave Application**: Students and teachers can request leave, which is tracked and managed.
- **Fee Management**: Tracks student fees and allows fee submissions.
- **Examination Details**: Displays student examination results.
- **Teacher/Student Leave Details**: Shows leave details for both students and teachers.
- **Student/Teacher Details**: Detailed profiles for both students and teachers.

---

## System Requirements

- **Java**: JDK 8 or higher
- **MySQL**: For database management
- **IDE**: IntelliJ IDEA
- **Operating System**: Cross-platform (Windows)

---

## Framework

#### 1. **Java Swing**

- **Introduction**: Swing is a more advanced GUI toolkit introduced in Java 1.2 as an extension to AWT. It provides more flexible and sophisticated GUI components.
- **Components**: Swing includes components such as `JButton`, `JLabel`, `JTextField`, `JPanel`, and many others with greater customization options and a more modern look and feel.

#### 2. **AWT (Abstract Window Toolkit)**

- **Introduction**: AWT is the original set of GUI components in Java, introduced in JDK 1.0. It provides components such as buttons, scroll bars, and text fields to build user interfaces.
- **Components**: Some common AWT components include `Button`, `TextField`, `Label`, and `Panel`.

---


## Directory Structure

The project follows a well-organized directory structure that helps in maintaining the codebase efficiently:


### Key Folders and Files:

- **`src/`**: Contains all the Java source code for the system’s functionality.
    - **`Conn.java`**: Manages the database connection.
    - **`Login.java`**: Implements the login page for both students and teachers.
    - **`Register.java`**: Handles new user registration functionality.
    - **`main_class.java`**: The main UI that loads after successful login.
    - **`Marks.java`**, **`AddStudent.java`**, **`AddFaculty.java`**, **`StudentLeave.java`**, etc., handle the various aspects of managing students, teachers, marks, and leave.
    - **`Splash.java`**: A welcome screen that appears when the application starts.
  
- **`icons/`**: Contains the icons used in the UI for buttons and menus.

---

## Files Overview

- **`Conn.java`**: This file handles the database connection using JDBC. It initializes the connection to the MySQL database with the provided credentials and URL.
  
- **`Login.java`**: The login page allows both students and teachers to access the system by entering their credentials. It validates the username, password, and role (student/teacher) against the database.

- **`Register.java`**: Allows users (students and teachers) to register by providing their username, password, and role. This information is stored in the database for future logins.

- **`main_class.java`**: The main UI for the system. This screen is shown after a successful login and serves as the primary control panel for managing all aspects of the university system.

- **`AddStudent.java`**: This file provides the functionality to add new students to the system.

- **`Marks.java`**: This file allows the teachers to enter and manage marks for students.

- **`TeacherLeave.java`** and **`StudentLeave.java`**: These files allow teachers and students to apply for leave and track leave records.

- **`ExaminationDetails.java`**: Displays examination-related details for the students.

- **`FeeStructure.java`**: Displays the current fee structure for the university.

- **`About.java`**: Provides information about the system.

---

## Setup Instructions

1. **Install MySQL Database**: Make sure you have MySQL installed and running.
2. **Create the Database**: Create a database in MySQL called `universitymanagement`.
3. **Database Schema**: Run the SQL script provided below to create the necessary tables:
    ```sql
    CREATE DATABASE universitymanagement;
    USE universitymanagement;

    CREATE TABLE users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL,
        password VARCHAR(50) NOT NULL,
        role VARCHAR(20) NOT NULL
    );

    CREATE TABLE students (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        roll_number VARCHAR(20) NOT NULL,
        department VARCHAR(50),
        fee_paid BOOLEAN DEFAULT FALSE
    );

    CREATE TABLE teachers (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        teacher_id VARCHAR(20) NOT NULL,
        department VARCHAR(50)
    );
    ```

4. **Configure Database Credentials**: Update the `Conn.java` file with your MySQL username, password, and database details.
    ```java
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "your_password");
    ```

5. **Compile and Run**: Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) and run the `Login.java` file to start the application.

---

## How to Use

1. **Login**: Open the login screen, and use the predefined username and password to log in as either a student or a teacher. 
    - Example login credentials:
        - Username: `student`, Password: `1234`, Role: `Student`
        - Username: `teacher`, Password: `1234`, Role: `Teacher`

2. **Register**: If you are a new user, use the **Register** page to create a new account.

3. **Navigate the System**: Once logged in, navigate through the main menu to manage students, teachers, marks, leaves, and more.

4. **Admin Features**: Admins or authorized personnel can update or delete records, manage student and teacher data, and modify the system's fee structure.

---

## Contact

For further questions or contributions, feel free to reach out or submit a pull request. We appreciate your feedback!
E-Mail -- akuladurgaprasad5@gmail.com
Mobile -- +91-8143600826
