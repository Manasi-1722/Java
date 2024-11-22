import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String s = "";
        
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == ' ' ){
                s = s + string.charAt(i - 1);
            }
        }
        s = s + string.charAt(string.length() - 1);
        System.out.println(s);


        // Added modifications 
        // Check if last letter is number or not if yes than ignore it.
        // Ex - Hey3 Java Learners      Output - as


        // String[] newstr = string.split(" ");
        // for(int i=0; i<string.length(); i++){
        //     String word = newstr[i];
        //     char ch = word.charAt(word.length() - 1);
        //     if(Character.isDigit(ch)) {
        //         continue;
        //     }

        //     System.out.println(ch);
        // }
        
        sc.close();
    }
}
