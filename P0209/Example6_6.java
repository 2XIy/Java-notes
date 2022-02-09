package P0209;

class IntegerException extends Exception{
    String message;
    public IntegerException(int m){
        message="年龄"+m+"不合理";
    }
    public String toString(){
        return message;
    }
}

class People{
    private int age=1;
    public void setAge(int age) throws IntegerException{
        if (age>=160||age<1){
            throw new IntegerException(age);
        }
        else {
            this.age=age;
        }
    }

    public int getAge() {
        System.out.println("年龄"+age+"合理");
        return age;
    }
}

public class Example6_6 {
    public static void main(String[] args) {
        People wang=new People();
        People zhang=new People();
        try {
            wang.setAge(180);
            System.out.println(wang.getAge());
        }
        catch (IntegerException e){
            System.out.println(e.toString());
        }try {
            zhang.setAge(10);
            System.out.println(zhang.getAge());
        }
        catch (IntegerException e){
            System.out.println(e.toString());
        }
    }
}
