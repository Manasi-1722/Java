import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // int actual = n;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                // System.out.println(i);
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}
