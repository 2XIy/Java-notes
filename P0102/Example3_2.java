package Package20220102;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt(),b=reader.nextInt(),c=reader.nextInt();
        int t=0;
        if (a>b){
            t=a;
            a=b;
            b=t;
        }
        if (a>c){
            t=a;
            a=c;
            c=t;
        }
        if (b>c){
            t=b;
            b=c;
            c=t;
        }
        System.out.println(a+"<"+b+"<"+c);
        reader.close();
    }
}
