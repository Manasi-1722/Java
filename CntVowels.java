import java.util.Scanner;


public class CntVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(" ");
        
        for(int i=0; i<temp.length; i++){
            String word = temp[i];
            char ch = word.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.print(ch);
            }
        }

        sc.close();
    }
}
