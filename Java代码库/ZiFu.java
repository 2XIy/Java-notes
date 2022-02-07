package PackageName;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.getType;
import static java.lang.Character.valueOf;

public class ZiFu {

    public static void main(String[] args) {
        /*Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = scan_input.nextInt();
        System.out.println("输入的数字为："+number);
        System.out.println("这个数字的类型为："+getType(number));
        System.out.println("========================================================");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个名字来判断这个人是啥：");
        String chuan = in.nextLine();
        System.out.println(chuan + "是大宝贝");
        for (int j = 0; j < 2; j++) {
            System.out.println("请再输入一个名字：");
            String chuan2 = in.nextLine();
            {
                if (chuan.equals(chuan2))
                    System.out.println("都说了" + chuan2 + "是大宝贝了怎么还问？");
                else
                    System.out.println(chuan2 + "也是大宝贝哈哈哈");
            }
        }
        System.out.println("这下没啥好问的了吧！！！");
        String chuan3 = in.nextLine();
        System.out.println("========================================================");
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double number1 = scan_input.nextDouble();
        System.out.println("输入的小数为："+number1);
        System.out.println("========================================================");
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        float number3 =scan_input.nextFloat();
        System.out.println("输入的小数为："+number3);
        System.out.println("========================================================");
        Scanner zifuduixiang =new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String jieshou=zifuduixiang.nextLine();
        char zifu1 = jieshou.charAt(0);
        System.out.println(jieshou.charAt(9));
        System.out.println("========================================================");
        Scanner scan_input =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String chuan4 =scan_input.nextLine();
        System.out.println(chuan4);
        System.out.println("========================================================");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Math.random());
        }
        System.out.println("========================================================");
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(20));
        }
        System.out.println("========================================================");*/
        for (int i = 0; i <5 ; i++) {
        System.out.println((int) (10+Math.random()*10));

        }
    }
}

