package P0206;

public class Example4_16 {
    private int money;
    private int getMoney(){
        return  money;
    }

    public static void main(String[] args) {
        Example4_16 example4_16=new Example4_16();
        example4_16.money=3000;
        int m=example4_16.getMoney();
        System.out.println("money="+m);
    }//在该类中创建自己的对象时，这个对象就可以调用该类的私有成员变量和私有方法。
}
