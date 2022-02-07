package PackageName;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(RandomString.getStringRandom(5));
        System.out.println(RandomString.getStringRandom(10));
        System.out.println(RandomString.getStringRandom(15));
//        System.out.println(Math.E);
//        System.out.println(Math.PI);
//        java.text.DecimalFormat df = new java.text.DecimalFormat("0.0000");
//        int x=4/3;
//        System.out.println(df.format(x));//1.0000
//        String name="喜炎";
//        System.out.println( "喜炎".equals(name));
//        fun();
//        System.out.println(fun()+100);
//        fun1();fun1
    }
//    public static int  fun(){
//        final int a=100;
//        return a;

   public static String getStringRandom(int length){
        Random random=new Random();
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i <length ; i++) {
            int number= random.nextInt(3);
            long result =0;
            switch (number) {
                case 0:
                    result=Math.round(Math.random()*25+65);
                    sb.append(String.valueOf((char)(result)));
                    break;
                case 1:
                    result=Math.round(Math.random()*25+97);
                    sb.append(String.valueOf((char) result));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }
}
//    public static void fun(){
//        int a[]={1,2,3,4,5,6,7,8,9};
//        int b[]=new int[]{5,4,3,2,1};
//        String shuzu1=String.valueOf(a);
//        String shuzu2=String.valueOf(b);
//        System.out.println(shuzu1.equals(shuzu2));
//    }
//   public static void fun1(){
//        int b[]=new int[5];
//        System.arraycopy(a,1,b,0,3);//原数组，原数组起始位置，新数组，新数组起始位置，复制长度。
//        System.out.println(Arrays.toString(b));//[2, 3, 4, 0, 0]
//    }
