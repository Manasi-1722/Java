import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                output++;
            }
        }

        System.out.println(output);
        sc.close();
    }
}
