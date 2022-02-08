package P0208;

abstract class MotorVehicles{
   abstract void brake();
}

interface MoneyFare{
    void charge();
}

interface ControlTemperature{
    void contralTemperature();
}

class Bus extends MotorVehicles implements MoneyFare{
    public void brake(){
        System.out.println("公交车刹车");
    }
    public void charge(){
        System.out.println("公交车票价一元一张");
    }
}

class Taxi extends MotorVehicles implements MoneyFare,ControlTemperature{
    public void brake(){
        System.out.println("出租车刹车");
    }
    public void charge(){
        System.out.println("出租车起步价五块,按公里计价");
    }
    public void contralTemperature(){
        System.out.println("出租车安装了海尔空调");
    }
}

class Cinema implements MoneyFare,ControlTemperature{
    public void charge(){
        System.out.println("电影票十元一张");
    }
    public void contralTemperature(){
        System.out.println("电影院安装了中央空调");
    }
}

public class Example5_16 {
    public static void main(String[] args) {
        Bus bus=new Bus();
        Taxi taxi=new Taxi();
        Cinema cinema=new Cinema();
        MoneyFare moneyFare;
        ControlTemperature controlTemperature;
        moneyFare=bus;
        bus.brake();
        moneyFare.charge();
        moneyFare=taxi;
        controlTemperature =taxi;
        taxi.brake();
        moneyFare.charge();
        controlTemperature.contralTemperature();
        moneyFare=cinema;
        controlTemperature=cinema;
        moneyFare.charge();
        controlTemperature.contralTemperature();
    }
}
