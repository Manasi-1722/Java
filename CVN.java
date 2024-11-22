import java.util.Scanner;

public class CVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        int numbers = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowels++;
                }
                else{
                    consonents++;
                }
            }
            else if(Character.isDigit(ch)){
                numbers++;
            }
        }

        System.out.println(vowels + " " + consonents + " " + numbers);
        sc.close();
    }
}
