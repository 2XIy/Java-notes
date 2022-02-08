package Package20211231;

import java.util.Arrays;

public class Example2_5 {
    public static void main(String[] args) {
        char a[]={'a','b','c','d','e','f'}, b[]={'1','2','3','4','5','6'};
        int  c[]={1,2,3,4,5,6}, d[]={10,20,30,40,50,60};
        System.arraycopy(a,0,b,0,a.length);
        System.arraycopy(c,2,d,2,c.length-3);
        System.out.println("数组a中的各个元素的值："+ Arrays.toString(a));
        System.out.println("数组b中的各个元素的值："+ Arrays.toString(b));
        System.out.println("数组c中的各个元素的值："+ Arrays.toString(c));
        System.out.println("数组d中的各个元素的值："+ Arrays.toString(d));
    }
}
