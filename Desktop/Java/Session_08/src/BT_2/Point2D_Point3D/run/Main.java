package BT_2.Point2D_Point3D.run;

import BT_2.Point2D_Point3D.entity.Point2D;
import BT_2.Point2D_Point3D.entity.Point3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2,3);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        point3D.setXYZ(2,3,4);
        System.out.println(point3D);
    }
}
