public class Teacher {

    private String name;
    private int id;
    private int salary;
    private int salaryEarned;

    public  Teacher (String name , int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salaryEarned= 0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

     public void recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

     }

}
