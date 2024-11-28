package Array;


import java.util.Arrays;
import java.util.Scanner;

public class arrays_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // Input another way 
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };




        // Output 1 
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");;
        //     }
        //     System.out.println();
        // }


        // Output 2
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }


        // Output 3
        for(int[] element : arr){
            System.out.println(Arrays.toString(element));
        }



        
        
        
        
        
        sc.close();  
    }
}
