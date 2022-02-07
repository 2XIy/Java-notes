package p;

public class Triangle {
    int sideA,sideB,sideC;
    boolean isTriangle;
    public Triangle(int a,int b,int c){
        sideA=a;
        sideB=b;
        sideC=c;
        if(a+b>c&&a+c>b&&b+c>a)
            isTriangle=true;
        else
            isTriangle=false;

    }
    public void jisuanmianji(){
        double p;
        if (isTriangle){
            p=(sideA+sideB+sideC)/2.0;
            double mianji=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
            System.out.println("是三角形,面积为："+mianji);
        }else {
            System.out.println("不是三角形，不能计算面积");
        }
    }
    public void xiugaisanbian(int a,int b,int c){
        sideA=a;
        sideB=b;
        sideC=c;
        if (a+b>c&&a+c>b&&b+c>a){
            isTriangle=true;
        }
        else {
            isTriangle=false;
        }
    }
}
