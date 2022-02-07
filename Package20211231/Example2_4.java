package Package20211231;

public class Example2_4 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int b[] ={100,200,300};
        System.out.println("数组a的元素个数="+a.length);
        System.out.println("数组b的元素个数="+b.length);
        System.out.println("数组a的引用="+a);
        System.out.println("数组b的引用="+b);
        System.out.println("a==b的结果是"+(a==b));
        a=b;
        System.out.println("数组a的元素个数="+a.length);
        System.out.println("数组b的元素个数="+b.length);
        System.out.println("a==b的结果是"+(a==b));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
