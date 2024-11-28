package Search_Algo;

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        String str = "Mansi";
        char target = 'i';
        System.out.println(search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // for loop
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)) {
                return true;
            }
        }


        // for each loop
        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }

        return false;
    }
}
