package com.friday.app;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class AppTest {

    private Logger log = Logger.getLogger(AppTest.class.getName());


    @Before
    public void setUp() throws Exception {
        log.info("setUp Test");
    }

    @After
    public void tearDown() throws Exception {
        log.info("tearDown Test");
    }

    @Test
    public void mainTest() {
        log.info("Running main Test");
        Assert.assertEquals("this test is success : ", 1, 1);
    }
}