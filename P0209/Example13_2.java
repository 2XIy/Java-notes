package P0209;

interface Computer1<E,F>{
    void makeChorus(E x,F y);
}

class Chorus<E,F> implements Computer1{
    @Override
    public void makeChorus(Object x, Object y) {
        x.toString();
        y.toString();
    }
}

class yueqi{
    public String toString(){
        System.out.println("12345656");
        return "";
    }
}

class geshou{
    public String toString(){
        System.out.println("你和我，我和你");
        return "";
    }
}

public class Example13_2 {
    public static void main(String[] args) {
        geshou pengliyuan =new geshou();
        yueqi piano =new yueqi();
        Chorus<geshou,yueqi> model=new Chorus<>();
        model.makeChorus(pengliyuan,piano);
    }
}
