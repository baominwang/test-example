package com.example;

import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = { "functest", "checkintest" })
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Test(groups = {"functest", "checkintest"} )
    public void testMethod2() {
        System.out.println("testMethod2");
    }

    @Test(groups = { "functest" })
    public void testMethod3() {
        System.out.println("testMethod3");
    }
}

