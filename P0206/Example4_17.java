package P0206;

class  Student2{
    private int age;
    public void setAge(int age){
        if (age>=7&&age<=28){
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
}

public class Example4_17 {
    public static void main(String[] args) {
        Student2 zhang=new Student2();
        Student2 geng=new Student2();
        zhang.setAge(23);
        System.out.println("zhang的年龄是"+zhang.getAge());
        geng.setAge(27);
        System.out.println("geng的年龄是"+geng.getAge());
    }
}
