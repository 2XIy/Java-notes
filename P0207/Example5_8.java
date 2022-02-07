package P0207;

class AAA{
    //final double PI; 非法，因为没有给PI赋值。
    final double PI=3.1415926;
    public double getArea(final double r){
        return PI*r*r;
    }
    public final void speak(){
        System.out.println("您好,hello");
    }
}

class BBB extends AAA{
    /*非法，不能重写speak方法
    public void speak(){
        System.out.println("您好");
    }
    * */
}

public class Example5_8 {
    public static void main(String[] args) {
        BBB bbb=new BBB();
        System.out.println("面积:"+bbb.getArea(100));
        bbb.speak();
    }
}
