import java.util.*;

public class ps_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (nstr.indexOf(ch) == -1) {
                nstr = nstr + ch;
            } else {
                break;
            }
        }
        System.out.print(nstr);

        sc.close();
    }
}