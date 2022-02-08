package P0208;

 abstract class Animal{
    public abstract void cry();
    public abstract String getAnimalName();
}

class Simulator{
     public void playSound(Animal animal){
         System.out.println("现在播放"+animal.getAnimalName()+"类的声音");
         animal.cry();
     }
}

class Dog extends Animal{
     public  void cry(){
         System.out.println("汪汪");
     }
     public String getAnimalName(){
         return "Dog";
     }
}

class Cat extends Animal{
     public void cry(){
         System.out.println("喵喵");
     }
     public String getAnimalName(){
         return "Cat";
     }
}

public class Example5_13 {
    public static void main(String[] args) {
        Simulator simulator=new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
