package BT_3.Point_MoveablePoint.run;

import BT_3.Point_MoveablePoint.entity.MovablePoint;
import BT_3.Point_MoveablePoint.entity.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0,0);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(0,0,1,1);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}
