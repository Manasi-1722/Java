/*
Print this pattern
 * 
 * * 
 * * *
 * * * *
 * * * * *
 
 */
package Patterns;
public class HalfPyramid {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}


// package Patterns;

// public class A1 {
//     public static void main(String[] args) {
//         int rows = 5; // Number of rows for the pattern

//         // Outer loop for each row
//         for (int i = 1; i <= rows; i++) {
//             // Inner loop for printing stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* "); // Print star followed by a space
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }
