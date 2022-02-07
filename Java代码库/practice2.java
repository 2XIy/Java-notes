package PackageName;
//自定义4个学生对象，添加到集合，并遍历。

import java.util.ArrayList;

public class practice2 {
    public static void main(String[] args) {
        teacher teacher1 = new teacher("迪丽热巴",18);
        teacher teacher2 = new teacher("古力娜扎",19);
        teacher teacher3 = new teacher("马儿扎哈",20);
        teacher teacher4 = new teacher("高圆圆",21);
        ArrayList<teacher> list11= new ArrayList<>();
        list11.add(teacher1);
        list11.add(teacher2);
        list11.add(teacher3);
        list11.add(teacher4);
        for (int i = 0; i < list11.size(); i++) {
            teacher teacher0 = list11.get(i) ;
            System.out.println("姓名:"+teacher0.getName()+",年龄"+teacher0.getAge());
        }
    }
}
