// Finds average , given an array and 2 limits 

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(a[i] > limit1 && a[i] < limit2){
                sum += a[i];
                cnt++;
            }
        }

        int avg = sum / cnt;
        System.out.println(avg);
        
        sc.close();
    }
}
