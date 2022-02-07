package P0205;

class Computer {
    double getResult(double a,int ...x){
    double result=0;
    int sum=0;
    for(int n:x) {
        sum += n;
    }
    result=a*sum;
    return result;
    }
}

public class Example4_6 {
    public static void main(String[] args) {
        Computer computer=new Computer();
        double m=computer.getResult(1/5.0,1,2,3,4,5);
        System.out.println("1,2,3,4,5的平均数为"+m);
    }
}
