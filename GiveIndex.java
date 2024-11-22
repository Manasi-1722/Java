import java.util.Scanner;

public class GiveIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        
        // int index = str.indexOf(ch);
        // System.out.println("Index - " + index);

        // another way
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                System.out.println(i);
                break;
            }
        }

        sc.close();

    }
}
