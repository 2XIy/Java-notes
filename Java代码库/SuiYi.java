package PackageName;

public class SuiYi {
    public static void main(String[] args) {
        phone wodeshouji =new phone();
        String chuan="用我价值"+(wodeshouji.price=8848.0F)+"美元的"+(wodeshouji.brand="iphone 12 pro max 256G");
        //System.out.print("用我价值");
        //System.out.print(wodeshouji.price=8848);
        //System.out.print("的");
        //System.out.println(wodeshouji.brand="iphone 12 pro max 256G");
        System.out.println(chuan);
        wodeshouji.call("喜炎宝贝");
        wodeshouji.sendpassage("喜炎大宝贝");
        wodeshouji.homework("贾舒淋");
    }
                   }
class phone{
    String brand;
    float price;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendpassage(String who){
        System.out.println("给"+who+"发短信");
    }
    public void homework(String who){
        System.out.println("给"+who+"布置一吨作业");
    }
           }
