//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Student s=new Student("101","Prakash","CSBS","CS"); //Constructor overloading
        System.out.println("Student Roll No:"+s.getRollno());
        System.out.println("Student Name:"+s.getName());
        System.out.println("Student Dept:"+s.getDept());
        System.out.println("Student's Subject:"+s.getSubjects());
        Subjects su=new Subjects("1001","CS",100,90);
        System.out.println("Subject ID:"+su.getSubID());
        System.out.println("Subject Name:"+su.getName());
        System.out.println("Subject Max Marks:"+su.getMaxmarks());
        System.out.println("Subject Marks Obtained:"+su.getMarksObtain());
    }
}