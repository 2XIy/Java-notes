package P0207;

class dongwu{
    void cry(){}
}

class gou extends dongwu{
    void cry(){
        System.out.println(" 汪汪");
    }
}

class mao extends dongwu{
    void cry(){
        System.out.println(" 喵喵");
    }
}

public class Example5_10 {
    public static void main(String[] args) {
        dongwu dongwu0=new gou();
        dongwu0.cry();
        dongwu0=new mao();
        dongwu0.cry();
    }
}
