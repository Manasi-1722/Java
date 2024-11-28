/* Problem Statement 

You are required to input the size of the matrix
then the elements of matrix, then you have to divide 
the main matrix in two sub matrices (even and odd) 
in such a way that element at 0 index will be 
considered as even and element at 1st index will 
be considered as odd and so on. then you have sort 
the even and odd matrices in ascending order then print 
the sum of second largest number from both the matrices

Example

enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7 
*/


package Barclays;

import java.util.*;


public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sizeof array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i % 2 == 0 || i == 0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }

        // how to sort array in java using function inbuilt    
        // Remember - For normal Array = java.util.Arrays.sort(...);
        // For ArrayList = Collections.sort()
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array : ");
        for(int i=0; i<even.size(); i++){
            System.out.print(even.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Sorted odd array : ");
        for(int i=0; i<odd.size(); i++){
            System.out.print(odd.get(i) + " ");
        }
        System.out.println("");

        System.out.println("A - " + even.get(even.size() - 2));
        System.out.println("B - " + odd.get(odd.size() - 2));

        
        
        int sum = even.get(even.size() - 2) + odd.get(odd.size() - 2);
        System.out.println("Sum = " + sum);
        sc.close();
        
    }
}
