package P0209;

public class Example6_5 {
    public static void main(String[] args) {
        int n=0,m=0,t=6666;
        try{
            m=Integer.parseInt("8888");
            n=Integer.parseInt("an98");
            t=9999;
        }
        catch (Exception e){
            System.out.println("发生异常:"+e.getMessage());
            n=123;
        }
        System.out.println("m="+m+",n="+n+",t="+t);
    }
}
