import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        int operations = 0;

        while (true) {
            boolean canSubtract = true;
            for (int i = 0; i < n; i++) {
                if (A[i] < B[i]) {
                    canSubtract = false;
                    break;
                }
            }

            if (!canSubtract) {
                break;
            }
            for (int i = 0; i < n; i++) {
                A[i] -= B[i];
            }
            operations++;
            
        }
        System.out.println(operations);

        scanner.close();
    }
}
