package P0207;

class AA{
    double f(float x,float y){
        return x+y;
    }
    public int g(int x,int y){
        return x+y;
    }
}

class BB extends AA{
    double f(float x,float y){
        return  x*y;
    }
}

public class Example5_4 {
    public static void main(String[] args) {
        BB b=new BB();
        System.out.println("调用重写方法得到的结果:"+b.f(5,6));
        System.out.println("调用继承方法得到的结果:"+b.g(3,5));
    }
}
