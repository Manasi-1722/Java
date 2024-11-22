import java.util.Scanner;

public class JuneIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = "CHN";

        if(str.contains(st)){
            for(int i=str.length() - 1; i>=3; i--){
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("No");
        }

        sc.close();
    }

}
