package school_money_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 * Many teachers , many Students
 * Implements teachers and students using and arraylist
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return teachers
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }

    /**
     *
     * @param teacher add teacher
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @return students
     */
    public List<Student> getStudents(){
        return students;
    }

    /**
     *
     * @param student add students
     */
    public void addStudents(Student student){
        students.add(student);
    }

    /**
     *
     * @return get total money earned
     */
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned update total money earned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned+=MoneyEarned;
    }

    /**
     *
     * @return total money spent
     */
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which is the salary given by the
     * school to the teachers
     * @param moneySpent money spent by school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent;
    }


}
