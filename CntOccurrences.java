// Count the occurrences of a substring

import java.util.Scanner;

public class CntOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring: ");
        String sub = sc.nextLine();
        int count = countOccurrences(str, sub);
        System.out.println("The substring '" + sub + "' occurs " + count + " times in " + str );

        sc.close();
    }

    public static int countOccurrences(String str, String sub){
        int count = 0;
        int index = str.indexOf(sub);
        System.out.println(index);
        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + 1);
            System.out.println(index);
        }
        return count;
    }
}
