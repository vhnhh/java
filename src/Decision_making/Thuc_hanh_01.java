package Decision_making;

import java.util.Scanner;

public class Thuc_hanh_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình có dạng 'ax + b = c'");
        System.out.print("Hãy nhập vào a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập vào b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập vào c: ");
        double c = Integer.parseInt(scanner.nextLine());
        if (a!=0) {
            double x = (c - b)/a;
            System.out.println("PT có 1 nghiệm duy nhất x = (c - b)/a = " + x);
        } else {
            if (b==c) {
                System.out.println("PT có vô số nghiệm");
            } else {
                System.out.println("PT vô nghiệm");
            }
        }

    }
}
