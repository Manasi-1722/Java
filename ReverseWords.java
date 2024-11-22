import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");   // important

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != " "){
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
