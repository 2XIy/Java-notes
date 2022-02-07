package P0207;

 class Father{
    public int money;
    protected int height;
    int weight;
}

class  Son extends Father{
     public String hand;
     public String getHand(){
         return hand;
     }
}

class Grandson extends Son{
     public String foot;
}

public class Example5_1 {
    public static void main(String[] args) {
        Son son=new Son();
        Grandson grandson=new Grandson();
        son.hand="一双大手";
        son.height=180;
        grandson.hand="一双小手";
        grandson.foot="一双小脚";
        grandson.height=155;
        String str=son.getHand();
        System.out.printf("儿子：%s，%d\n",str,son.height);
        str=grandson.getHand();
        System.out.printf("孙子：%s，%s，%d\n",str,grandson.foot,grandson.height);
    }
}
