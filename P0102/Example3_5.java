package Package20220102;

public class Example3_5 {
    public static void main(String[] args) {
        long a=8,sum=0;
        for (int i = 0; i < 12; i++) {
            sum=sum+a;
            a=a*10+8;
        }
        System.out.println(sum);
    }
}