package BT_1.Lop_Circle_va_lop_Cylinder.entity;

import java.util.Scanner;

public class Circle {
    private String color;
    private float r;
    private double S;
    private double P;


    public Circle() {

    }


    public Circle(String color, float r, double S, double P) {
        this.color = color;
        this.r = r;
        this.S = S;
        this.P = P;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Màu sắc: ");
        this.color = scanner.nextLine();
        System.out.print("Có bán kính (cm) là: ");
        this.r = Integer.parseInt(scanner.nextLine());
    }


    public void acreageCircle() {
        this.S = (double) Math.round((Math.pow(this.r, 2) * Math.PI) * 100) / 100;
    }

    public void peripheralCircle() {
        this.P = (double) Math.round((this.r * 2 * Math.PI) * 100) / 100;

    }

    @Override
    public String toString() {
        return "Hình tròn này có màu " + this.color + ", bán kính " + this.r + "(cm), diện tích " + this.S + "(cm2), chu vi " + this.P + "(cm)";
    }

}


