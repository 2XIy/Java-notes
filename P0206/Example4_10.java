package P0206;

public class Example4_10 {
    int leg,hand;
    String name;
    Example4_10(String s){
        name=s;
        this.init();
    }
    void  init(){
        leg=2;
        hand=2;
        System.out.println(name+"有"+hand+"只手,"+leg+"条腿");
    }

    public static void main(String[] args) {
        Example4_10 boshi=new Example4_10("布什");
    }
}
