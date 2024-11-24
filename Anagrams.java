// Check if two strings are anagrams

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        sc.close();
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }


    }

    public static boolean isAnagram(String str1, String str2){
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }


        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // sort both strings
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        
        // compare sorted strings
        return java.util.Arrays.equals(charArray1, charArray2);

    }
}
