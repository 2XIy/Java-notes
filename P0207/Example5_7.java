package P0207;

class Sum{
    int n;
    public  double f(){
        double sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+i;
        }
        return  sum;
    }
}

class Average extends Sum{
    double n;
    public double f(){
        double c;
        super.n=(int)n;
        c=super.f();
        return c+n;
    }
    public  double g(){
        double c;
        c=super.f();
        return c-n;
    }
}

public class Example5_7 {
    public static void main(String[] args) {
        Average average=new Average();
        average.n=100.5678;
        double result1=average.f();
        double result2=average.g();
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
    }
}
