package Package20220102;

  enum Season{
    春季,夏季,秋季,冬季;
}
public class Example3_4 {
    public static void main(String[] args) {
        Season season=Season.春季;
        int x=96,y=1;
        String string=new String("java语言");
        switch (x+y){
            case 1:
                System.out.println(x+y);
                break;
            case 'a':
                System.out.println(x+y);
            case 10:
                System.out.println(x+y);
                break;
                default:
                    System.out.println("没有匹配的x+y的值"+(x+y));
        }
        switch (season){
            case 冬季:
                System.out.println("寒冬腊月");
            case 春季:
                System.out.println("春天种下种子");
            case 秋季:
                System.out.println("秋天收获果实");
                break;
            case 夏季:
                System.out.println("暑假真好");
        }
        switch (string){
            case "java语言":
                System.out.println("学习Java语言");
            case "c语言":
                System.out.println("最好学过C语言");
                break;
        }
    }
}
