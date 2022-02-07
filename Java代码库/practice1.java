package PackageName;
//生成6个1-33之间的随机整数，添加到集合，并遍历集合。

import java.util.ArrayList;
import java.util.Random;

public class practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> list10 =new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(32)+1;
         list10.add(num);
        }
            System.out.println(list10);

    }
}
