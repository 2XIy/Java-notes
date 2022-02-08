package Package20220102;

public class Example3_8 {
    public static void main(String[] args) {
        int  a[]={1,2,3,4};
        char b[]={'a','b','c','d'};
        System.out.println("传统方式：");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
        System.out.println("改进方式：");
        for(int c:a){
            System.out.println(c);
        }
        for (char d:b){
            System.out.println(d);
        }
    }
}