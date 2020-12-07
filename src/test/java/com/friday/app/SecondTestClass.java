package com.friday.app;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class SecondTestClass {



    private Logger log = Logger.getLogger(SecondTestClass.class.getName());


    @Before
    public void setUp() throws Exception {
        log.info("setUp Test");
    }

    @After
    public void tearDown() throws Exception {
        log.info("tearDown Test");
    }

    @Test
    public void secondClassMainTest() {
        log.info("Running second class main Test");
        Assert.assertEquals("this test is success : ", 1, 1);
    }

    @Test
    public void secondClassSecondTest() {
        log.info("Running second class second Test");
        Assert.assertEquals("this second test is success : ", 1, 1);
    }


}
