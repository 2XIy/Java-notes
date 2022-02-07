package P0206;

class Student{
    int number;
    Student(int n){
        number=n;
    }
    void speak(){
        System.out.println("Student类的包名是P0206,我的学号是"+number);
    }
}

public class Example4_11 {
    public static void main(String[] args) {
        Student student=new Student(10201);
        System.out.println("主类的包名也是P0206");
    }
}
