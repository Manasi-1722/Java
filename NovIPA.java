import java.util.Scanner;

public class NovIPA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += (ch - '0');
            }
        }

        if(sum < 15){
            System.out.println(sum);
        }
        else{
            System.out.println("No digits");
        }

        sc.close();
    }
}