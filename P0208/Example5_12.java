package P0208;

abstract class jidongche{
    abstract void qidong();
    abstract void jiasu();
    abstract void shache();
}

class shoudongdang extends jidongche{
    void qidong(){
        System.out.println("塌下离合器，换到一档");
    }
    void jiasu(){
        System.out.println("踩油门");
    }
    void shache(){
        System.out.println("踩离合器刹车板，挂一档");
    }
}

class zidongdang extends jidongche{
    void qidong(){
        System.out.println("使用前进档，踩油门");
    }
    void jiasu(){
        System.out.println("踩油门");
    }
    void shache(){
        System.out.println("踩刹车");
    }
}

public class Example5_12 {
    public static void main(String[] args) {
    jidongche car=new shoudongdang();
        System.out.println("手动挡的操作：");
        car.qidong();
        car.jiasu();
        car.shache();
        car=new zidongdang();
        System.out.println("自动挡的操作：");
        car.qidong();
        car.jiasu();
        car.shache();
    }
}
