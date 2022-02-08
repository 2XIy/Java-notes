package P0208;

interface Cubic{
    double getCubic(double x);
}

class A{
    void f(Cubic cubic){
        double result=cubic.getCubic(3);
        System.out.println("result="+result);
    }
}

public class Example6_3 {
    public static void main(String[] args) {
        Cubic cubic=new Cubic() {
            @Override
            public double getCubic(double x) {
                return x*x*x;
            }
        };
        double m=cubic.getCubic(5);
        System.out.println("m="+m);
        A a=new A();
        a.f(new Cubic() {
            @Override
            public double getCubic(double x) {
                return x*x*x;
            }
        });
    }
}