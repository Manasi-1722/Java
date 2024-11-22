import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String largestString = "";
        String[] strArray = str.split(" ");
        for(int i=0; i<strArray.length; i++){
            if(strArray[i].length() > largestString.length()){
                largestString = strArray[i];
            }

        }
        System.out.println(largestString);

        sc.close();
    }
}
