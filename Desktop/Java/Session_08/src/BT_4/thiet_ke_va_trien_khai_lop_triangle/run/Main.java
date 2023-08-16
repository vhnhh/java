package BT_4.thiet_ke_va_trien_khai_lop_triangle.run;

import BT_4.thiet_ke_va_trien_khai_lop_triangle.entity.Shape;
import BT_4.thiet_ke_va_trien_khai_lop_triangle.entity.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do dai (cm) canh 1: ");
        double side1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Do dai (cm) canh 2: ");
        double side2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Do dai (cm) canh 3: ");
        double side3 = Integer.parseInt(scanner.nextLine());
        Shape shape = new Shape();
        shape.inputData(scanner);
        System.out.println(shape);
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println(triangle);


    }
}
