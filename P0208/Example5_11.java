package P0208;

abstract class GirlFriend {
    abstract void  speak();
    abstract void  cooking();
}

class ChineseGirlFriend extends GirlFriend{
    void speak(){
        System.out.println("你好");
    }
    void cooking(){
        System.out.println("水煮鱼");
    }
}

class AmericanGirlFriend extends GirlFriend{
    void speak(){
        System.out.println("hello");
    }
    void cooking(){
        System.out.println("roast beef");
    }
}

class Boy{
    GirlFriend girlFriend;
    void setGirlFriend(GirlFriend f){
        girlFriend=f;
    }
    void showGirlFriend(){
        girlFriend.speak();
        girlFriend.cooking();
    }
}

public class Example5_11 {
    public static void main(String[] args) {
        GirlFriend girlFriend=new ChineseGirlFriend();
        Boy boy=new Boy();
        boy.setGirlFriend(girlFriend);
        boy.showGirlFriend();
        girlFriend=new AmericanGirlFriend();
        boy.setGirlFriend(girlFriend);
        boy.showGirlFriend();
    }
}
