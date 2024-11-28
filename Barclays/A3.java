package Barclays;

import java.util.*;

public class A3 {


    public static void possibilities(int n){
        int c = 0;
        String b = "";
        for(int i=1; n != c; i++) {
            String s = Integer.toString(i, 2);
            if(!s.contains("11")){
                c++;
                b = s;
            }
        }

        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            possibilities(arr[i]);
        }

        sc.close();
    }
}