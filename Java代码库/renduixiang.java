package PackageName;

import java.util.ArrayList;
//题目：创建一个用来存放4个对象的数组或集合
public class renduixiang {
    public static void main(String[] args) {
        //创建数组的方法：
        person[] array = new person[3];//根据类，创建一个“类”型数组用来存放根据类所创建的对象。
        person duixiang1 = new person("贾喜炎", 18);//创建对象1
        person duixiang2 = new person("王谦", 18);//创建对象2
        person duixiang3 = new person("贾舒淋", 8);//创建对象3
        array[0] = duixiang1;//将对象1（的地址值）放入数组的第0号元素
        array[1] = duixiang2;//将对象2（的地址值）放入数组的第1号元素
        array[2] = duixiang3;//将对象3（的地址值）放入数组的第2号元素
        for (int i = 0; i < 3; i++) {
            System.out.println("姓名：" + array[i].getName() + ",年龄：" + array[i].getAge());
        }//遍历数组打印出数组元素。
        System.out.println("=================================================================");
        //创建集合的方法：
        ArrayList<person> list = new ArrayList<>();
        person duixiang4 = new person("贾喜炎1号", 18);//创建对象4
        person duixiang5 = new person("王谦1号", 18);//创建对象5
        person duixiang6 = new person("贾舒淋1号", 8);//创建对象6
        list.add(duixiang1);//将对象4（的地址值）放入数组的第0号元素
        list.add(duixiang2);//将对象5（的地址值）放入数组的第1号元素
        list.add(duixiang3);//将对象6（的地址值）放入数组的第2号元素
        for (int i = 0; i < list.size(); i++) {
            person duixiangjihe = list.get(i);//根据 类 创建一个用来收纳对象456的空壳对象;
            System.out.println("姓名：" + duixiangjihe.getName() + ",年龄" + duixiangjihe.getAge());
        }//遍历对象，通过空壳对象,调用类,输出收纳到的对象456的信息。
        ArrayList<String> list11 = new ArrayList<>();//创建一个名为list的String类型的集合
        list11.add("贾喜炎");//向集合中增加元素
        list11.add("王谦");//向集合中增加元素
        list11.add("贾舒淋");//向集合中增加元素
        printfArrayList(list11);
    }
    public static void  printfArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size())
                System.out.print("}");
            else
                System.out.print("@"+list.get(i));
        }
        System.out.println("}");
    }
}
