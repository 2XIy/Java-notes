package P0205;

class Leader{
    double shangdi,gao;
    static double xiadi;
    void setShangdi(double a){
        shangdi=a;
    }
    void setXiadi(double b){
        xiadi=b;
    }
    double getShangdi(){
        return  shangdi;
    }
    double getXiadi(){
        return xiadi;
    }
}

public class Example4_8 {
    public static void main(String[] args) {
        Leader.xiadi=100;
        Leader leaderone=new Leader();
        Leader leadertwo=new Leader();
        leaderone.setShangdi(28);
        leadertwo.setShangdi(66);
        System.out.println("leaderone的上底:"+leaderone.getShangdi());
        System.out.println("leaderone的下底:"+leaderone.getXiadi());
        System.out.println("leadertwo的上底:"+leadertwo.getShangdi());
        System.out.println("leadertwo的下底:"+leadertwo.getXiadi());
    }
}