package P0208;

interface Printable{
    public static final int max=100;
    public abstract void on();
    public abstract float sum(float x,float y);
    default int max(int a,int b){
        return a>b?a:b;
    }
    public static void f(){
        System.out.println("从Java SE 8开始的");
    }
}

class AAA implements Printable{
    public void on(){
        System.out.println("打开电视");
    }
    public float sum(float x,float y){
        return x+y;
    }
}

public class Example5_14 {
    public static void main(String[] args) {
        AAA aaa=new AAA();
        System.out.println("接口中的常量:"+AAA.max);
        System.out.println("调用on方法(重写的):");
        aaa.on();
        System.out.println("调用sum方法(重写的):"+aaa.sum(123,45));
        System.out.println("调用接口提供的default方法"+aaa.max(12,78));
        Printable.f();
    }
}
