# School_Money_Management_System

Overview
The School Money Management System is a Java-based application designed to manage the financial transactions related to school operations. This system allows administrators to handle payments for teacher salaries and student fees efficiently. The system tracks the total money earned from student fees and the total money spent on teacher salaries, providing a clear view of the school's financial status.

# Features
1. Add Teachers and Students:
Teachers: Each teacher has a unique ID, name, and salary. The system ensures that no two teachers share the same ID.
Students: Each student has a unique ID, name, and grade. The system ensures that no two students share the same ID.

2. Manage Transactions:
Pay Fees: The system allows students to pay their fees, which adds to the total money earned by the school.
Pay Salaries: The system allows the school to pay teacher salaries, which deducts from the total money earned, updating the total money spent.

3. Financial Tracking:
The system keeps track of the total money earned from student fees.
The system keeps track of the total money spent on teacher salaries.

# Classes and Their Responsibilities

1. Teacher:
Attributes: ID, name, salary, salary earned.
Methods: Getters for attributes, method to set salary, method to receive salary which updates the school's total money spent, and toString method for display purposes.

2. Student:
Attributes: ID, name, grade, fees paid, total fees.
Methods: Getters for attributes, method to set grade, method to pay fees which updates the school's total money earned, method to get remaining fees, and toString method for display purposes.

3. School:
Attributes: List of teachers, list of students, total money earned, total money spent.
Methods: Getters for attributes, methods to add teachers and students, static methods to update total money earned and spent.

4. Main:
The main class that runs the application.
Provides a text-based user interface to interact with the system.
Ensures unique IDs for teachers and students before adding them to the system.
Manages the main menu and user inputs for various operations.

# Future Enhancements
1. Graphical User Interface (GUI): Developing a GUI using JavaFX or Swing for a more user-friendly experience.
2. Database Integration: Integrating with a database like MySQL or PostgreSQL for persistent storage of data.
3. Advanced Reporting: Adding features for generating detailed financial reports and analytics.
4. User Authentication: Implementing user authentication and role-based access control for added security.
