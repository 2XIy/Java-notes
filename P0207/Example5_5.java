package P0207;

class People2{
    public void speak(){
        System.out.println("我是people");
    }
}

class Chinese extends People2{
    public void speak(){
        System.out.println("我是中国人");
    }
}

class CratePeople2{
    public People2 createPeople2(){
        People2 p=new People2();
        return p;
    }
}

class CrateChinese extends CratePeople2{
    public Chinese cteatePeople2(){
        Chinese chinese=new Chinese();
        return chinese;
    }
}

public class Example5_5 {
    public static void main(String[] args) {
        CrateChinese crateChinese=new CrateChinese();
        Chinese zhang=crateChinese.cteatePeople2();
        zhang.speak();
    }
}
