import java.util.Scanner;


// temp.indexOf(str.charAt(i)) checks whether
// the character at index i of the string str
// is already present in the string temp.


// If the result is -1, it means that the character 
// is not present in temp, indicating that it is unique so far.
public class RemoveDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";

        for(int i=0; i<str.length(); i++){
            if(temp.indexOf(str.charAt(i)) == -1){
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
