package PackageName;

public class Arry {
    public static void main(String[] args) {
        int[] arry1 = new int[2];
        arry1 = calculate(3, 4, 5);
        System.out.println("总和:" + arry1[0]);
        System.out.println("平均值为：" + arry1[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int sum1= sum / 3;
        int[] arry={sum,sum1};
        return arry;
    }
}
