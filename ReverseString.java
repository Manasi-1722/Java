import java.util.Scanner;


//  Input - Mansi
// Output - isnaM
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = "";
        // String str = "";
        for(int i=0; i<input.length(); i++){
            // str = str + input.charAt(i);
            reversed = input.charAt(i) + reversed;    // imp
        }

        // System.out.println(str);
        System.out.println(reversed);
        sc.close();
    }
}
