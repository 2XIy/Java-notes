package P0208;

interface ShowMessage{
    void xianshishangbiao(String s);
    default void f(){
        System.out.println("default方法");
    }
}

class TV implements ShowMessage{
    public void xianshishangbiao(String s){
        System.out.println(s);
    }
    public void f(){
        System.out.println("重写了default方法");
    }
}

class PC implements ShowMessage{
    public void xianshishangbiao(String s){
        System.out.println(s);
    }
}

public class Example5_15 {
    public static void main(String[] args) {
        ShowMessage showMessage=new TV();
        showMessage.xianshishangbiao("长城电视机");
        showMessage.f();
        showMessage=new PC();
        showMessage.xianshishangbiao("联想电脑");
        showMessage.f();
    }
}
