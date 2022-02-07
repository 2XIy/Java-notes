package PackageName;

import java.util.ArrayList;
import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num= r.nextInt(100)+1;
            list.add(num);
        }
        smallArrayList(list);
    }
    public static ArrayList smallArrayList(ArrayList<Integer> list12){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < list12.size(); i++) {
            if (list12.get(i)%2!=0)
                smalllist.add(list12.get(i));
        }
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.println(smalllist.get(i));
        }
        return smalllist;
    }
}
