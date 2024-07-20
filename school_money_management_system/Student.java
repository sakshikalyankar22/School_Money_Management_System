package school_money_management_system;

//This class is responsible for keeping the track of student fees, name, grade and fees
//paid
public class Student {
    private int id;  //protecting from somebody from accessing id outside student class
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    //these all are fields we declared
    /**
     *
     * Fees for every student is $30,000.
     * Fees paid initially is 0
     * @param id:unique for student
     * @param name:name of student
     * @param grade:grade of student
     */
    //Constructor: to create a new Student object by initializing
    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id; //first id from Student class/fields and 2nd id from constructor(id from the argument method)
        this.name=name;
        this.grade=grade;
        //here we have initialized all the fields of class
    }

    //not going to alter student's name, student's id

    /**
     * here below setId and setName is not going to use because we are not changing it
     * @param grade: new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     *Keep adding the fees to FeesPaid field
     *
     * @param fees: the fees that student pays
     */
    public void payFees(int fees){
        feesPaid=feesPaid+fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of student
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of student
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return grade of student
     */
    public int getGrade(){
         return grade;
    }

    /**
     *
     * @return fees paid by student
     */
    public int getFeesPaid(){
        return feesPaid;
    }

    /**
     *
     * @return total fees of student
     */
    public int getFeesTotal(){
         return feesTotal;
    }

    /**
     * 
     * @return remaining fees
     */
    public int getRemainingFees(){
       return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return  "Student's name :"+name+ "Total fees paid so far $ "+feesPaid;
    }
}
