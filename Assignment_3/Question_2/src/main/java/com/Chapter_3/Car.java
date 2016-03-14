package com.Chapter_3;

/**
 * Created by mgijima on 2016/03/13.
 */
public interface Car {

    public void setGear(int newGear);
    public int getGear();
    public void gearUp(int increment);

    void setSpeed(int newSpeed);
    int  GetSpeed();
    void speedDown(int decrement );
}
