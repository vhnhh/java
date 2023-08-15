package Decision_making;

import java.util.Scanner;

public class Thuc_hanh_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " không là năm nhuận");
        }

    }
}
