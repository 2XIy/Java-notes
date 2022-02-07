package PackageName;

import java.util.Scanner;

public class NumMagic {
    public static void main(String[] args) {
        System.out.println("请输入数字魔方阶数：");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int i = 0, j = 0, k = 1;
        int hang = 0, lie = n / 2;
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                a[i][j] = 0;
        for (k = 1; k <= n * n; k++) {
            a[hang][lie] = k;
            hang -= 1;
            lie += 1;
            if (hang < 0 && lie >= n) {
                hang += 2;
                lie -= 1;
            }
            if (hang < 0)
                hang = n - 1;
            if (lie >= n)
                lie = 0;
            if (a[hang][lie] != 0) {
                hang += 2;
                lie -= 1;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.printf("%-5d", a[i][j]);
            System.out.println();
        }
    }
}
