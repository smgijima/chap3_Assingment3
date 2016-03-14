package com.Chapter_3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mgijima on 2016/03/13.
 */
public class TestQuestion1 {

    Question1 Animr;

    @Before
    public void setUp() throws Exception {
        Animr = new Question1Imp();
    }

    @Test
    public void testStdDetails() throws Exception {
        Collection coll2 = new HashSet();
        coll2.add("cat");

        Assert.assertEquals(Animr.animalDetails(), coll2);
    }




    Question1 stud;

    @Before
    public void setUp2() throws Exception {
        stud = new Question1Imp();

    }

    @Test
    public void testNames() throws Exception {

        Assert.assertEquals(stud.names().get(0),stud.names().get(0));
    }

    @After
    public void tearDown() throws Exception {

    }



    Question1 studLvl;

    @Before
    public void setUp3() throws Exception {
        studLvl = new Question1Imp();
    }

    @Test
    public void testLevelOfStudy() throws Exception {

        Assert.assertEquals(studLvl.levelOfStudy().get("213033402"),studLvl.levelOfStudy().get("213033402"));
    }

    @After
    public void tearDown3() throws Exception {


    }




    Question1 stdNum;

    @Before
    public void setUp4() throws Exception {
        stdNum = new Question1Imp();

    }

    @Test
    public void testStdNumber() throws Exception {
        Set<String> set2 = new HashSet<String>();
        set2.add("0001");
        set2.add("0002");
        set2.add("0003");

        Assert.assertEquals(stdNum.stuffNumber(),set2);

    }

    @After
    public void tearDown4() throws Exception {


    }

}