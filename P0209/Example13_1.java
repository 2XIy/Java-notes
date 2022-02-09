package P0209;

class Cone<E>{
    double height;
    E bottom;
    public Cone(E bottom) {
        this.bottom = bottom;
    }
    public  void  setHeight(double h){
        height=h;
    }
    public double computerVolume(){
        String s=bottom.toString();
        double area=Double.parseDouble(s);
        return  1.0/3.0*area*height;
    }
}

interface Computer{
     String toString();
}

class Rect implements Computer{
    double sideA,sideB,area;
    public Rect(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public String toString(){
        area=sideA*sideB;
        return ""+area;
    }
}

class Circle implements Computer{
    double radius,area;
    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString(){
        area=Math.PI*radius*radius;
        return ""+area;
    }
}

public class Example13_1 {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        Cone<?extends Computer> cone=new Cone<Circle>(circle);
        cone.setHeight(16);
        System.out.println(cone.computerVolume());
        Rect rect=new Rect(12,14);
        cone=new Cone<Rect>(rect);
        cone.setHeight(98);
        System.out.println(cone.computerVolume());
        Cone<Rect> rectCone=new Cone<Rect>(rect);
        rectCone.setHeight(98);
        System.out.println(rectCone.computerVolume());
        Cone<?> circlecone=new Cone<Circle>(circle);
        circlecone.setHeight(16);
        System.out.println(circlecone.computerVolume());
    }
}
