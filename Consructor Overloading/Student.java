public class Student {
    private String rollno;
    private String name;
    private String dept;
    private String Subjects;
    Student(String rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    Student(String rollno,String name,String dept)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
    }
    Student(String rollno,String name,String dept,String Subjects)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.Subjects=Subjects;
    }

    //getters

    public String getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getSubjects() {
        return Subjects;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setSubjects(String subjects) {
        Subjects = subjects;
    }
}
