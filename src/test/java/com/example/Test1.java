package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = { "functest", "checkintest", "broken" })
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Parameters({"firstname", "lastname"})
    @Test(groups = {"functest", "checkintest"} )
    public void testMethod2(String firstname, String lastname) {
        System.out.println("testMethod2: Hello " + firstname + ", " + lastname);
    }

    @Test(groups = { "functest" })
    public void testMethod3() {
        System.out.println("testMethod3");
    }
}

