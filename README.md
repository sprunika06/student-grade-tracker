
# Student Grade Tracker

A console-based Student Grade Tracker application developed using **Core Java** as part of the CodeAlpha Java Programming Internship.

The application allows users to manage student records, enter subject-wise marks, calculate average scores, identify the highest and lowest marks, and generate student grade reports.

## Project Overview

The Student Grade Tracker is designed to simplify student performance management through a menu-driven console application.

It uses Object-Oriented Programming (OOP) concepts and Java Collections to store and manage student information efficiently.

## Features

- **Add Student:** Add student details, including ID, name, and subject-wise marks.
- **View Students:** Display all registered students and their average marks.
- **Search Student:** Find a student using their unique ID.
- **Grade Calculation:** Automatically calculate grades based on average marks.
- **Average Marks:** Calculate the average score across all subjects.
- **Highest Marks:** Identify the highest subject score.
- **Lowest Marks:** Identify the lowest subject score.
- **Input Validation:** Validate student details and marks.
- **Exception Handling:** Handle invalid user inputs.
- **Menu-Driven Interface:** Simple and interactive console-based interface.

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- ArrayList
- Arrays
- Exception Handling
- Scanner Class

## Project Structure

```text
StudentGradeTracker/
│
├── Main.java
├── Student.java
├── GradeManager.java
└── README.md
```

## File Description

| File | Description |
|---|---|
| `Main.java` | Main application containing the menu and user interaction logic. |
| `Student.java` | Represents student details and handles grade calculations. |
| `GradeManager.java` | Manages student records, searching, displaying, and generating reports. |
| `README.md` | Project documentation and setup instructions. |

## Grade Calculation System

The application calculates grades based on the student's average marks.

| Average Marks | Grade |
|---|---|
| 90–100 | A+ |
| 80–89 | A |
| 70–79 | B |
| 60–69 | C |
| 40–59 | D |
| Below 40 | Fail |

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 8 or above)
- Any Java-compatible IDE (VS Code, IntelliJ IDEA, or Eclipse)
- Command Prompt or Terminal

### Step 1: Clone the Repository

```bash
git clone https://github.com/sprunika06/student-grade-tracker.git
```

### Step 2: Navigate to the Project Directory

```bash
cd student-grade-tracker
```

### Step 3: Compile the Java Files

```bash
javac Main.java Student.java GradeManager.java
```

### Step 4: Run the Application

```bash
java Main
```

## Sample Output

### Main Menu

```text
================================
       STUDENT GRADE TRACKER
================================

1. Add Student
2. View All Students
3. Search Student
4. Generate Grade Report
5. Exit

Enter your choice:
```

### Adding a Student

```text
Enter Student ID: 101
Enter Student Name: Rahul

Enter Java Marks: 90
Enter DBMS Marks: 85
Enter Mathematics Marks: 95

Student added successfully!
```

### Student Grade Report

```text
========== GRADE REPORT ==========

Student ID: 101
Name: Rahul
Average Marks: 90.00
Highest Marks: 95
Lowest Marks: 85
Grade: A+

--------------------------------
```

## Concepts Demonstrated

This project demonstrates practical implementation of the following Java concepts:

1. **Classes and Objects:** Organizing the application using separate classes.
2. **Encapsulation:** Protecting student data using private variables.
3. **Constructors:** Initializing student objects.
4. **Arrays:** Storing subject-wise marks.
5. **ArrayList:** Managing multiple student records dynamically.
6. **Methods:** Implementing reusable operations.
7. **Loops:** Iterating through student records.
8. **Conditional Statements:** Implementing grade calculation.
9. **Exception Handling:** Handling invalid inputs using try-catch.

## Future Enhancements

- Implement permanent data storage using file handling.
- Add student record update and delete functionality.
- Generate subject-wise performance reports.
- Implement a graphical user interface (GUI).
- Integrate a database for student record management.

## Internship Details

- **Organization:** CodeAlpha
- **Domain:** Java Programming
- **Project:** Student Grade Tracker
- **Task:** Task 1

## Author

Developed as part of the CodeAlpha Java Programming Internship.

---
