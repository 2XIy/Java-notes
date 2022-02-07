package P0207;

class Anth{
    double m=12.58;
    void  crySpeak(String s){
        System.out.println(s);
    }
}

class People3 extends Anth{
    char m='A';
    int n=60;
    void  computer(int a,int b){
        int c=a+b;
        System.out.println(a+"加"+b+"等于"+c);
    }
    void crySpeak(String s){
        System.out.println(m+"**"+s+"**"+m);
    }
}

public class Example5_9 {
    public static void main(String[] args) {
        People3 people3=new People3();
        Anth anth=people3;
        anth.crySpeak("i love this game");
        System.out.println(anth.m);
        System.out.println(people3.m);
        People3 zhang=(People3) anth;
        zhang.computer(33,55);
        zhang.m='T';
        System.out.println(zhang.m);
    }
}
