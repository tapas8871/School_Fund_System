import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
       Teacher samantha = new Teacher("samantha", 4, 5000);
       Teacher astha = new Teacher("astha", 4, 7000);
       Teacher mala = new Teacher("mala", 4, 9000);


       List<Teacher> teacherList = new ArrayList<>();
       teacherList.add(samantha);
       teacherList.add(astha);
       teacherList.add(mala);




       Student tamanna = new Student(13,"tamanna" ,40 );
       Student Aarohi = new Student(14,"Aarohi" ,70 );
       Student sakshi = new Student(18,"sakshi" ,80 );

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamanna);
        studentList.add(Aarohi);
        studentList.add(sakshi);

        School abc = new School(teacherList,studentList);
        tamanna.payFees(60000);
        sakshi.payFees(70000);
        Teacher mina = new Teacher("Ankita", 4, 5000);
        abc.addTeacher(mina);

        System.out.println("school has earned Rs" + abc.getTotalMoneyEarned());
        System.out.println("School  pays salary");
        samantha.recieveSalary(samantha.getSalary());
        System.out.println("abc School spent for salary to " + samantha.getName()+" "+ "and now has"+" " + abc.getTotalMoneyEarned());


    }

}
