package P0205;

 class Circle {
    double radius;
    Circle(double r){
        radius=r;
    }//有参构造
    void setRadius(double r){
        radius=r;
    }//重置半径
    double getArea(){
        return 3.14*radius*radius;
    }//获取圆面积
    double getRadius(){
        return  radius;
    }//获取半径
}

class Circular{
     Circle bottom;//声明一个对象，但是不赋初值
     double height;
     Circular(Circle c,double h){
         bottom=c;
         height=h;
     }//构造方法 同时为声明好的对象分配实体(内存)
     double getVolme(){
         return bottom.getArea()*height/3.0;
     }//求体积
     double getBottomRadius(){
         return  bottom.radius;
     }//获取圆半径
     public void setBottomRadius(double r){
         bottom.setRadius(r);
     }//重置圆半径
}

public  class Example4_5 {
    public static void main(String[] args) {
        Circle circle=new Circle(10);//创建对象并且初始化半径r
        System.out.println("main方法中circle的引用:"+circle);
        System.out.println("main方法中circle的半径:"+circle.getRadius());
        Circular circular=new Circular(circle,20);
        //创建circular对象并且将创建好的circle对象的引用传递给bottom 同时初始化高度h
        System.out.println("circular圆锥的bottom的引用:"+circular.bottom);
        System.out.println("圆锥的bottom的半径:"+circular.getBottomRadius());
        System.out.println("圆锥的体积:"+circular.getVolme());
        double r=8888;
        System.out.println("圆锥更改底圆bottom的半径为:"+r);
        circular.setBottomRadius(r);
        System.out.println("圆锥的bottom的半径:"+circular.getBottomRadius());
        System.out.println("圆锥的体积:"+circular.getVolme());
        System.out.println("main方法中circle的半径:"+circle.getRadius());
        System.out.println("main方法中circle的引用将发生变化");
        circle=new Circle(1000);
        System.out.println("现在的main方法中circle的引用:"+circle);
        System.out.println("main方法中circle的半径:"+circle.getRadius());
        System.out.println("但是不影响circular圆锥的bottom的引用");
        System.out.println("circular圆锥的bottom的引用:"+circular.bottom);
        System.out.println("圆锥的bottom的半径:"+circular.getBottomRadius());
    }
}