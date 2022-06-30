package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    @DataProvider(name = "dp1")
    public Object[][] dp1() {
        return new Object[][] {
                {"Benjamin", "Wang"},
                {"Haitao", "Cao"},
                {"Huaiyu", "Wang"}
        };
    }

    @Test(groups = { "functest", "checkintest", "broken" })
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Parameters({"firstname", "lastname"})
    @Test(groups = {"functest", "checkintest"} )
    public void testMethod2(String firstname, String lastname) {
        System.out.println("testMethod2: Hello " + firstname + ", " + lastname);
    }

    @Test(groups = { "functest" }, dataProvider = "dp1")
    public void testMethod3(String firstname, String lastname) {
        System.out.println("testMethod3: Hello " + firstname + ", " + lastname);
    }
}

