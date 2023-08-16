import java.util.Scanner;

public class BT_bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao chuoi chu 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Hay nhap vao chuoi chu 2: ");
        String str2 = scanner.nextLine();
        StringBuilder str2Reverse = new StringBuilder(str2);
        if (str1.equalsIgnoreCase(String.valueOf(str2Reverse.reverse()))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
