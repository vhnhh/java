import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.Pattern;

public class BT_bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap vao 1 chuoi ki tu: ");
        String str = scanner.nextLine();


//        C1
        String gerex = ".*[0-9].*";
        if (Pattern.matches(gerex, str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


//        C2
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
