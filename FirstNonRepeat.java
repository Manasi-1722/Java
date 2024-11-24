// Find the first non-repeating character

public class FirstNonRepeat {
    public static void main(String[] args){
        String str = "aabbcdef";
        char result = findFirstNonRepeat(str);
        System.out.println("First non-repeating character is: " + result);
    }
    public static char findFirstNonRepeat(String str) {
        int[] charCount = new int[256]; // assuming ASCII character set
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // return null if no non-repeating character found
    }
}
