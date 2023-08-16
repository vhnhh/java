package BT_3.Point_MoveablePoint.entity;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arrSpeed = new float[2];
        arrSpeed[0] = xSpeed;
        arrSpeed[1] = ySpeed;
        return arrSpeed;
    }

    public String toString() {
        return Arrays.toString(getXY()) + ", speed = " + Arrays.toString(getSpeed());
    }


    public MovablePoint move() {
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }
}
