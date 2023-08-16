import java.util.Scanner;

public class BT_bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap vao chuoi thu 1: ");
        String str1 = scanner.nextLine();
        System.out.print("hay nhap vao chuoi thu 2: ");
        String str2 = scanner.nextLine();
        if (str1.length()>str2.length()) {
            String str1Sub = str1.substring(str1.length(), str2.length());
            System.out.println("str1");
            System.out.println(str1Sub);
            System.out.println(str1);

        }
        if (str1.length()<str2.length()) {
            String str2Sub = str2.substring(str2.length(), str1.length());
            System.out.println("str2");
            System.out.println(str2Sub);
            System.out.println(str2);

        }
//        System.out.println(str1Sub.concat(str2Sub));
    }
}
