package P0209;

class DangerException extends Exception{
    final String message="超重";
    public String warnMess(){
        return message;
    }
}

class CargoBoat{
    int realContent=0;
    int maxContent;
    public void setMaxContent(int maxContent){
        this.maxContent=maxContent;
    }
    public void loading(int m) throws DangerException{
        realContent+=m;
        if (realContent>maxContent){
            throw new DangerException();
        }
        System.out.println("目前装载了"+realContent+"吨货物");
    }
}

public class Example6_7 {
    public static void main(String[] args) {
        CargoBoat cargoBoat=new CargoBoat();
        cargoBoat.setMaxContent(1000);
        int m=600;
        try {
            cargoBoat.loading(m);
            m=400;
            cargoBoat.loading(m);
            m=456;
            cargoBoat.loading(m);
            m=560;
            cargoBoat.loading(m);
        }
        catch (DangerException e){
            System.out.println(e.warnMess());
            System.out.println("无法再装载重量是"+m+"吨的集装箱");
        }
        finally {
            System.out.println("货船将正点启航");
        }
    }
}
