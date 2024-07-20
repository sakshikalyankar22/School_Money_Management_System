package school_money_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        School sggs = new School(teacherList, studentList);

        boolean running = true;

        while (running) {
            System.out.println("\nSchool Money Management System");
            System.out.println("1. Add Teacher");
            System.out.println("2. Add Student");
            System.out.println("3. Pay Fees");
            System.out.println("4. Pay Salary");
            System.out.println("5. Show Total Money Earned");
            System.out.println("6. Show Total Money Spent");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    int teacherId;
                    while (true) {
                        System.out.print("Enter teacher ID: ");
                        teacherId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        if (isTeacherIdUnique(teacherId, teacherList)) {
                            break;
                        } else {
                            System.out.println("ID already exists. Please enter a unique ID.");
                        }
                    }
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher salary: ");
                    int teacherSalary = scanner.nextInt();
                    Teacher newTeacher = new Teacher(teacherId, teacherName, teacherSalary);
                    sggs.addTeacher(newTeacher);
                    System.out.println("Teacher added successfully!");
                    break;
                case 2:
                    int studentId;
                    while (true) {
                        System.out.print("Enter student ID: ");
                        studentId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        if (isStudentIdUnique(studentId, studentList)) {
                            break;
                        } else {
                            System.out.println("ID already exists. Please enter a unique ID.");
                        }
                    }
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int studentGrade = scanner.nextInt();
                    Student newStudent = new Student(studentId, studentName, studentGrade);
                    sggs.addStudents(newStudent);
                    System.out.println("Student added successfully!");
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    int payStudentId = scanner.nextInt();
                    System.out.print("Enter fees amount: ");
                    int fees = scanner.nextInt();
                    boolean studentFound = false;
                    for (Student student : sggs.getStudents()) {
                        if (student.getId() == payStudentId) {
                            student.payFees(fees);
                            System.out.println("Fees paid successfully!");
                            studentFound = true;
                            break;
                        }
                    }
                    if (!studentFound) {
                        System.out.println("Student not found with ID: " + payStudentId);
                    }
                    break;
                case 4:
                    System.out.print("Enter teacher ID: ");
                    int payTeacherId = scanner.nextInt();
                    boolean teacherFound = false;
                    for (Teacher teacher : sggs.getTeachers()) {
                        if (teacher.getId() == payTeacherId) {
                            teacher.receivedSalary(teacher.getSalary());
                            System.out.println("Salary paid successfully!");
                            teacherFound = true;
                            break;
                        }
                    }
                    if (!teacherFound) {
                        System.out.println("Teacher not found with ID: " + payTeacherId);
                    }
                    break;
                case 5:
                    System.out.println("Total Money Earned: $" + sggs.getTotalMoneyEarned());
                    break;
                case 6:
                    System.out.println("Total Money Spent: $" + sggs.getTotalMoneySpent());
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean isTeacherIdUnique(int id, List<Teacher> teacherList) {
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStudentIdUnique(int id, List<Student> studentList) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return false;
            }
        }
        return true;
    }
}
