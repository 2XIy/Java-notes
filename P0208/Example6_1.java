package P0208;

class RedCowFarm{
    static String farmName;
    class RedCow{
        String cowName="红牛";
        int height,weight,price;
        RedCow(int h,int w,int p){
            height=h;
            weight=w;
            price=p;
        }
        void speak(){
            System.out.println("我是"+cowName+",身高:"+height+"cm,体重:"+weight+"kg,生活在"+farmName);
        }
    }
    RedCow cow;
    RedCowFarm(){}
    RedCowFarm(String s){
        cow=new RedCow(150,112,5000);
        farmName=s;
    }
    public void showCowMess(){
        cow.speak();
    }
}

public class Example6_1 {
    public static void main(String[] args) {
        RedCowFarm redCowFarm=new RedCowFarm("红牛农场");
        redCowFarm.showCowMess();
        redCowFarm.cow.speak();
    }
}
