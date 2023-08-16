package BT_4.thiet_ke_va_trien_khai_lop_triangle.entity;

import java.util.Scanner;

public class Shape {
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhap mau sac cua tam giac: ");
        this.color = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

}
