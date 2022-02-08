package Package20220102;

public class Example3_7 {
    public static void main(String[] args) {
        int i,j,sum=0;
        for (i=1;i<=10;i++){
            if (i%2==0){
                continue;
            }
            sum=sum+i;
        }
        System.out.println("1-10内单数和为"+sum);
        for ( i = 2; i <= 50; i++) {
            for ( j = 2; j <=i ; j++) {
                if (i%j==0){
                    break;
                }
            }
            if (j>=i){
                System.out.println(i);
            }
        }
    }
}