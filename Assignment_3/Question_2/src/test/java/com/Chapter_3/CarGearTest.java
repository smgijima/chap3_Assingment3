package com.Chapter_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mgijma on 2016/03/13.
 */
public class CarGearTest {

    Car cr;

    @Before
    public void setUp() throws Exception {
        cr = new CarImp();
    }

    @Test
    public void testBicycle() throws Exception {

        cr.setGear(5);
        int CGr1 = cr.getGear();
        cr.gearUp(1);
        int CGr2 = cr.getGear();

        Assert.assertEquals(CGr1+1 , CGr2 );
    }

}
