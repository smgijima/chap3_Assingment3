package com.Chapter_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mgijima on 2016/03/13.
 */
public class CarSpeedTest {

    Car cr;

    @Before
    public void setUp() throws Exception {
        cr = new CarImp();
    }

    @Test
    public void testBicycle() throws Exception {

        cr.setSpeed(10);
        int CarSpd1 = cr.GetSpeed();
        cr.speedDown(1);
        int CarSpd2 = cr.GetSpeed();

        Assert.assertEquals(CarSpd1,CarSpd2+1);

    }
}
