import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao chuoi str1: ");
        String str1 = scanner.nextLine();
        System.out.println("do dai chuoi str1 la: " + str1.length());

        System.out.print("nhap vao chuoi str2: ");
        String str2 = new String(scanner.nextLine());
        System.out.println("do dai chuoi str2 la: " + str2.length());

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.startsWith("Rikkei"));
        System.out.println(str1.startsWith("Academy"));

        System.out.println(str1.concat(" " + str2));

    }
}
