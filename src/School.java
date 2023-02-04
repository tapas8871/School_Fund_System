import java.util.List;

public class School {


    private List<Teacher> teacher;
    private List<Student> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Teacher>teacher , List<Student>student){
        this.teacher = teacher;
        this.student = student;
        totalMoneySpent=0;
        totalMoneyEarned =0;
    }

    public List<Teacher> getTeacher(){
        return teacher;
    }

    public List<Student> getStudent(){
        return student;
    }
     public void  addStudent(Student student1){
        student.add(student1);

     }

      public void addTeacher(Teacher teacher1){
        teacher.add(teacher1);
      }

      public int  getTotalMoneyEarned(){
        return totalMoneyEarned;
      }
      public static  void update_Total_Money_earned(int MoneyEarned){
         totalMoneyEarned +=MoneyEarned;
      }

       public int getTotalMoneySpent(){
        return totalMoneySpent;
       }

        public static void updateTotalMoneySpent(int moneySpent){
          totalMoneyEarned-= moneySpent;
        }

}
