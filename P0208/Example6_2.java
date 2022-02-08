package P0208;

abstract class Speak{
    public abstract void speakHello();
}

class Student {
    void f(Speak sp){
        sp.speakHello();
    }
}

public class Example6_2 {
    public static void main(String[] args) {
        Speak speak=new Speak() {
            @Override
            public void speakHello() {
                System.out.println("大家好,祝工作顺利！");
            }
        };
        speak.speakHello();
        Student student=new Student();
        student.f(new Speak() {
            @Override
            public void speakHello() {
                System.out.println("i am a student ,how are you ?");
            }
        });
    }
}
