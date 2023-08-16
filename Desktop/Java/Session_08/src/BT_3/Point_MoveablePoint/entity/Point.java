package BT_3.Point_MoveablePoint.entity;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arrXY = new float[2];
        arrXY[0] = this.x;
        arrXY[1] = this.y;
        return arrXY;
    }

    public String toString() {
        return Arrays.toString(this.getXY());
    }
}
