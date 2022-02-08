package Pcakage20220101;

import java.util.Arrays;

public class Example2_7 {
    public static void main(String[] args) {
        int a[]={12,28,6,45,8,15,150,47,30,70,16};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number=150;
        int index=Arrays.binarySearch(a,number);
        if (index>=0){
            System.out.println(number+"和数组中索引值为"+index+"的元素值相同");
        }
        else {
            System.out.println(number+"不与数组中任何元素值相同");
        }
    }
}
