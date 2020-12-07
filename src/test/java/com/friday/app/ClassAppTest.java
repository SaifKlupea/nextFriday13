package com.friday.app;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class ClassAppTest {

    private Logger log = Logger.getLogger(ClassAppTest.class.getName());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fakeTest(){
        log.info("Running failure test");
        Assert.assertEquals("this test fails : ", 1 , 2);
    }

}