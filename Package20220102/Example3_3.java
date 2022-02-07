package Package20220102;

import java.util.Scanner;

public class Example3_3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int math=reader.nextInt();
        double english=reader.nextDouble();
        if (math>=60){
            System.out.println("数学"+math+"分,及格啦。");
        }
        else
            System.out.println("数学"+math+"分,不及格哦。");
        if (english>=60){
            System.out.println("英语"+english+"分,及格啦。");
        }
        else
            System.out.println("英语"+english+"分,不及格哦。");
        System.out.println("我在学习if-else语句");
        reader.close();
    }
}
