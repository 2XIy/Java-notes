package P0207;

class Student2{
    int number;
    String name;

    public Student2() {
    }

    public Student2(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

class UniverStudent extends Student2{
    boolean isMarriage;

    public UniverStudent(int number, String name, boolean isMarriage) {
        super(number, name);
    }
    public boolean getismarriage(){
        return isMarriage;
    }
}

public class Example5_6 {
    public static void main(String[] args) {
        UniverStudent zhang=new UniverStudent(20111,"张三",false);
        int number=zhang.getNumber();
        String name=zhang.getName();
        boolean marriage=zhang.getismarriage();
        System.out.printf(name+"的学号是:"+number);
        if (marriage){
            System.out.println(",已婚");
        }
        else
            System.out.println(",未婚");
    }
}
