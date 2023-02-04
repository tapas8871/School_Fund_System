
// keeping the record the
public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    public Student(int id, String name , int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.fees_paid = 0;
        this.fees_total = 110000;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getId(){
        return id;
    }



    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

     public void payFees(int fees){
        fees_paid+=fees;
        School.update_Total_Money_earned(fees_paid);
     }





}
