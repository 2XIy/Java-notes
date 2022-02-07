package PackageName;
//定义一个用来模拟学生的类；
class Student {
    // 属性（名字身高体重年龄）
    //成员变量
    String name;
    int age;
     //行为（可以做的事情）
    //成员方法
    public void eat(){
        System.out.println("吃饭饭！");
    }
    public void sleep(){
        System.out.println("睡觉觉！");
    }
    public void learn(){
        System.out.println("学习习！");
    }
}
public class Student1 {
    public static void main(String[] args) {
        Student learner = new Student();
        learner.name="贾喜炎";
        learner.age=18;
        System.out.print(learner.age+"岁的");
        System.out.print(learner.name);
        System.out.println("擅长的事：");
        learner.eat();
        learner.sleep();
        learner.learn();
    }

}

