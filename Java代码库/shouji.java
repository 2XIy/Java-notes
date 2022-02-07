package PackageName;

public class shouji {
    public static void main(String[] args) {
        tuzhi shouji = new tuzhi();
        System.out.println(shouji.brand="iphone12 pro max 512G");
        System.out.println(shouji.color="pink");
        System.out.println(shouji.price=8848);
        shouji.call("马化腾");
        shouji.sendPassage();
        shouji.play();
    }
}
class tuzhi {
    String brand,color;
    int price;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendPassage(){
        System.out.println("发短信");
    }
    public void play(){
        System.out.println("刷抖音");
    }
}
