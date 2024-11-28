package Array;

import java.util.ArrayList;
import java.util.Scanner;

// add, contains, set, remove, replace - inbuilt functions 

public class Array_List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Creating an array list
        // ArrayList<Integer> list = new ArrayList<>();

        // // input 
        // for(int i=0; i<5; i++){
        //     list.add(sc.nextInt());
        // }

        // // output 
        // for(int i=0; i<5; i++){
        //     System.out.println(list.get(i));
        // }



        // Multi-dimentional ArrayList

        // Arraylist of ArrayList - {{1,2,3}, {4,5,6}, {7,8,9}}
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        // initialisation
        for(int i=0; i<3; i++){
            list2.add(new ArrayList<>());
        }

        // input - add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list2.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list2);

        


        
        sc.close();
        

    }
}
