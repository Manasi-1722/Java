package Array;

// Arrays are mutable in Java
// Strings are immutable in Java

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        
        // input 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Output 1 
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }


        // Output 2
        // for(int num : arr){
        //     System.out.println(num + " ");
        // }


        // Output 3
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
