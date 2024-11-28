package Barclays;

import java.util.Scanner;
/*
 * n = 4
 * m = 20
 * 
 * 1 - 20 --- 4, 8 12 16 20 = x
 * 1- 20 --- 1 2 3 5 6 7 ...19 = y 
 */
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if(i % n == 0){
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }

        System.out.println(Math.abs(sum1 - sum2));

        sc.close();
    }
}
