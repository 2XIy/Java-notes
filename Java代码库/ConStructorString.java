package PackageName;

import java.util.Arrays;

public class ConStructorString {
    public static void main(String[] args) {
        String chuan1 = new String("ABC");//直接创建字符串
        System.out.println(chuan1);//ABC
        char []chararray = {'A','B','C'};//通过字符数组创建字符串
        String chuan2 = new String(chararray);
        System.out.println(chuan2);//ABC
        byte []bytearray ={65,66,67};//通过字节数组创建字符串。(依据ASCII码表)
        String chuan3 = new String(bytearray);
        System.out.println(chuan3);//ABC
        String chuan4 = new String("abc");//abc
        System.out.println(chuan1.equalsIgnoreCase(chuan4));//true  equalsIgnoreCase方法是忽略英文字母大小写的比较。
        for (int i = 0; i < 10; i++) {
        char ch = "helloworld".charAt(i);//i为字符串的索引位置（从0开始的）。charAt(i)为获取字符串中索引值为i的字符
        System.out.print(ch);//helloworld
        }
        System.out.println();
        String chuan5 = chuan1.concat(chuan4);//concat方法是实现两个字符串的无脑拼接
        System.out.println(chuan5);//ABCabc
        int num = chuan5.indexOf("bc");//indexOf方法是检查字符串中指定串第一次出现的索引位置。
        System.out.println("第一次索引值是："+num);//4
        int num1 = chuan5.indexOf("ca");
        System.out.println("第一次索引值是："+num1);//-1(若没有相同的字符串，则输出-1)
        String chuan6 =chuan5.substring(3);//substring(index)方法是用来从括号中的索引值位置开始截取至末尾来获取子字符串的方法。
        System.out.println(chuan6);//abc
        String chuan7 =chuan5.substring(3,6);//substring(index1,index2)括号中为一个左闭右开区间[3,6),截取源字符串的3-5位置上的字符串作为子字符串
        System.out.println(chuan7);//abc
        String chuan8 ="你妈了个逼,傻逼？";
        String chuan9 = chuan8.replace("你妈了个逼,傻逼","*****,**");//replace方法是用来替换字符串中的字符得到一个新的字符串。
        System.out.println(chuan9);//*****,**？
        String[] array1 = chuan8.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);//  你妈了个逼//傻逼？
        }
        String chuan10 ="xxx.yyy.zzz";
        String[] array2 = chuan10.split("\\.");//如果依据被切割的字符串的英文句点"."来进行切割，则应该spilt("\\.")
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);//xxx//yyy//zzz
        }
        char[] chars="hello".toCharArray();//"字符串".toCharArray方法是将字符串转换为字符数组。如将hello拆分为h,e,l,l,o。
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);//h//e//l//l//o
        }
        byte[] bytes = "abc".getBytes();//"字符串".getBytes方法是将字符串转换为字节数组。如将abc转换为97,98,99
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);//97//98//99
        }
        int []a={1,6,4,3,6,8,2};//定义一个数组
        Arrays.sort(a);//通过Arrays.sort(数组名)方法将数组升序排列
        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 6, 6, 8]//通过Arrays.tostring(数组名)的方法将数组转化为字符串并输出字符串。
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");//1 2 3 4 6 6 8
        }
        System.out.println();
        System.out.println(Math.abs(-1.2));//1.2//取绝对值
        System.out.println(Math.ceil(3.4));//4.0//向上取整
        System.out.println(Math.floor(9.5));//9.0//向下取整
        System.out.println(Math.round(12.5));//13//四舍五入
        System.out.println(Math.pow(2,4));//a的b次方
        System.out.println(Math.PI);//3.141592653589793
        System.out.println(Math.E);//2.718281828459045
         /*四舍五入并保留两位小数
        double a=3.1455926;
        DecimalFormat r = new DecimalFormat("0.0");
        System.out.println(r.format(a));
	*/
	        System.out.println(String.format("%.2f", a));//直接四舍五入保留两位小数
    }
}
