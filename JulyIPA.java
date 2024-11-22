import java.util.Scanner;

public class JulyIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0 , cnt = 0;
        for(int i=a; i<=b; i++){
            if(i % 3 == 0){
                if(i % 2 == 0){
                    // System.out.println(i);
                    sum += i;
                    cnt++;
                }
            }
        }

        System.out.println(sum + " " + cnt);
        sc.close();
    }
}
