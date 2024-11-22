import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String s = "";
        s = s + string.charAt(0);
        for(int i=1; i<string.length(); i++){
            if(string.charAt(i) == ' '){
                s += string.charAt(i + 1);
            }
        }

        System.out.print(s);

        sc.close();
    }
}
