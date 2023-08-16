package BT_1.Lop_Circle_va_lop_Cylinder.run;

import BT_1.Lop_Circle_va_lop_Cylinder.entity.Circle;
import BT_1.Lop_Circle_va_lop_Cylinder.entity.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Circle circle = new Circle();
        circle.inputData(scanner);
        circle.acreageCircle();
        circle.peripheralCircle();
        System.out.println(circle);


        Cylinder cylinder= new Cylinder();
        cylinder.inputData(scanner);
        cylinder.inputDataCylinder(scanner);
        cylinder.volumeCylinder();
        System.out.println(cylinder);



    }
}
