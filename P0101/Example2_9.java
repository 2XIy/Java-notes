package Pcakage20220101;

import java.util.Scanner;

public class Example2_9 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        Weekday x=null;
        int a=reader.nextInt();
        if (a==1){
            x=Weekday.星期一;
        }
        else if (a==2){
            x=Weekday.星期二;
        }
        else if (a==3){
            x=Weekday.星期三;
        }
        else if (a==4){
            x=Weekday.星期四;
        }
        else if (a==5){
            x=Weekday.星期五;
        }
        else if (a==6){
            x=Weekday.星期六;
        }
        else if (a==7){
            x=Weekday.星期日;
        }
        if (a<=5)
        System.out.println("今天"+x+",我工作");
        else if (a>5&&a<8)
        System.out.println("今天"+x+",我休息");
        else
            System.out.println("没有这一天的存在");
            reader.close();
    }
}
