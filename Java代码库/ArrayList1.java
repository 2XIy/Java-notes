package PackageName;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//创建一个名为list的String类型的集合
        System.out.println(list);//[]
        list.add("贾喜炎");//向集合中增加元素
        list.add("王谦");//向集合中增加元素
        list.add("贾舒淋");//向集合中增加元素
        System.out.println(list);//[贾喜炎, 王谦, 贾舒淋]
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));//贾喜炎王谦贾舒淋
        }
    }
}
