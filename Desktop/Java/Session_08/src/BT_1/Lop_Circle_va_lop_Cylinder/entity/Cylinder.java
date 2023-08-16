package BT_1.Lop_Circle_va_lop_Cylinder.entity;

import java.util.Scanner;

public class Cylinder extends Circle {
    private float h;
    private double V;

    public Cylinder() {

    }

    public Cylinder(float h, double V) {
        this.h = h;
        this.V = V;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public double getV() {
        return V;
    }

    public void inputDataCylinder(Scanner scanner) {

        System.out.print("Chiều cao (cm): ");
        this.h = Integer.parseInt(scanner.nextLine());
    }

    public void volumeCylinder() {
        this.V = (double) Math.round(this.h * Math.pow(this.getR(), 2) * Math.PI * 100) / 100;
    }



    @Override
    public String toString() {
        return "Hình trụ này có màu " + this.getColor() + ", bán kính " + this.getR() + "(cm), chiều cao " + this.h + "(cm), thể tích " + this.V + "(cm3)";
    }


}
