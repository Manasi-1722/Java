import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        while(n != 0){
            int i = n % 10;
            if(i % 2 == 0){
                count++;
            }
            n = n / 10;
        }

        if(count > 2) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        sc.close();
    }
}
