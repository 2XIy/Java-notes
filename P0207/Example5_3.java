package P0207;

class People{
    public  double x;
    public void setX(double x){
        this.x=x;
    }
    public double getDoubleX(){
        return  x;
    }
}

class Student extends People{
    int x;
    public int getX(){
        //x=12.34; 非法,因为此时x已经被覆盖重写为int型。
        return x;
    }
}

public class Example5_3 {
    public static void main(String[] args) {
    Student student=new Student();
    student.x=98;
        System.out.println("对象student的x值是："+student.getX());
        //student.x=98.98; 非法，因为x已经是int型
        student.setX(98.98);
        double m=student.getDoubleX();
        System.out.println("对象student隐藏的x值是:"+m);
    }
}
