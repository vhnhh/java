package BT_2.Point2D_Point3D.entity;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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
