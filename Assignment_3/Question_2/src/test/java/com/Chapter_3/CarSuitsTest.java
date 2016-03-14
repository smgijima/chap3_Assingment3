package com.Chapter_3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by mgijima on 2016/03/13.
 */

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            CarGearTest.class ,
            CarSpeedTest.class
    })
    public class CarSuitsTest {
}


