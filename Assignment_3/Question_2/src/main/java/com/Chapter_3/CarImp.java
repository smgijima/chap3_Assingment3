package com.Chapter_3;

/**
 * Created by mgijma on 2016/03/13.
 */
public class CarImp implements Car{

    int speed;
    int gear;

    public void setGear(int newGear) {
        gear = newGear;
    }


    public int getGear() {
        return gear;
    }


    public void gearUp(int increment) {
        gear += increment;
    }


    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public int GetSpeed() {
        return speed;
    }


    public void speedDown(int decrement) {
        speed -=decrement;
    }
}
