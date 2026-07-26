package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class AppTest {

    private App app;

    @Before
    public void setup(){
        System.out.println("Setup executed");
        this.app=new App();
    }
    @After
    public void setdown(){
        System.out.println("end of excution");
        this.app=null;
    }

    @Test
    public void testAdd() {
        App app = new App();
        int a = 5;
        int b =0;
        int result = app.add(a,b);
        assertEquals(5, result);
        // assertNotEquals(5, 3);
        // assertTrue(5>3);
        // assertFalse(5<3);
        //  assertNull(null); 
        // assertNotNull(new Object()); 
    }
}