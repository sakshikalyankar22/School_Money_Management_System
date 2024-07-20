package school_money_management_system;

/**
 * This class is responsible for keeping the track of the teacher's id,name and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param id: id for the Teacher
     * @param name:name of the Teacher
     * @param salary: Salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    //set the salary
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     *Adds to salary
     * removes from total money earned by the school
     * @param salary
     */
    public void receivedSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+ name+ "Total salary earned so far $"
                +salaryEarned;
    }
}
