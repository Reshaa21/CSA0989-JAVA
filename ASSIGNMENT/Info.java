class Student 
{
    int regNo;
    String name;
    double marks;

    Student(int a, String b, double c)
 {
        regNo = a;
        name = b;
        marks = c;
    }

    void info()
    {
        System.out.println("Register number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentInfo
 {
    public static void main(String[] args)
 {
        Student stu = new Student(192311434, "Shalini", 99);
        stu.info();
    }
}
