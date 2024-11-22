// This code counts all the small characters in a string and returns the count.

import java.util.Scanner;

public class CntSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
