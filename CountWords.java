//The split() method splits a string into an array where each word is an array item.
        
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int total = 1;

        for(int i=0; i<msg.length(); i++){
            if(msg.charAt(i) == ' ' && msg.charAt(i + 1) != ' ') 
            {
                total++;
            }
        }

        System.out.println(total);
        sc.close();
    }

}


// another way 
        // int countWords = msg.split("\\s").length;
        // System.out.println("Split output = " + countWords);

        // another way
        // String str = "Hello World";
        // String[] words = str.split("\\s"); // Split on one or more whitespace characters
        // int length = words.length; 

        // System.out.println(length); // Output: 2
