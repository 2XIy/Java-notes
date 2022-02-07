package P0207;

class A{
    private int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}

class B extends A{
    double y=12;
    public void setY(int y){
        //this.y=y+x;   非法，因为x是private的
    }
    public double getY(){
        return y;
    }
}

public class Example5_2 {
    public static void main(String[] args) {
        B b=new B();
        b.setX(888);
        System.out.println("子类对象未继承的x的值是:"+b.getX());
        b.y=12.34;
        System.out.println("子类对象的实例变量y的值是:"+b.getY());
    }
}