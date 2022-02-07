package Package20220102;

public class Example3_6 {
    public static void main(String[] args) {
        int i=1;
        double a=1, sum=0;
        while (i<=20){
            sum=sum+a;
            i=i+1;
            a=a*(1.0/i);
        }
        System.out.println("sum="+sum);
    }
}
