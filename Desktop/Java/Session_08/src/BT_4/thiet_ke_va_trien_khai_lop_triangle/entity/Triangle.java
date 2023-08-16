package BT_4.thiet_ke_va_trien_khai_lop_triangle.entity;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        if ((this.side1 + this.side2 > this.side3) && (this.side1 + this.side3>this.side2) && (this.side2 + this.side3 > this.side2)) {
            double p = (side1 + side2 + side3) / 2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        } else {
            return -1;
        }
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        if (getArea() != -1) {
            return "tam giac lan luot do dai 3 canh la: " + side1 + "(cm), " + side2 + "(cm), " +side3+ "(cm)\nDien tich la " + getArea() + "(cm)\nChu vi la " + getPerimeter() + "(cm)";

        } else {
            return "tam giac lan luot do dai 3 canh la: " + side1 + "(cm), " + side2 + "(cm), " +side3+ "(cm). Day khong phai la 1 tam giac";
        }
    }

}
