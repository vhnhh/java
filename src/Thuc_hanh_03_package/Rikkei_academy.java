package Thuc_hanh_03_package;

import java.util.Scanner;

public class Rikkei_academy {
    public static void main(String[] args) {
        float width;
        float height;
//        float heightEx;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
//        heightEx = Float.parseFloat(scanner.nextLine());
        float area = width*height;
        System.out.println("Area is: " + area);
    }
}
