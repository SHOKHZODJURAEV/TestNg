package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DependsOnTest {


    @Test
    public void test1(){

        System.out.println("Test1 is running");
        assertEquals(2,3);
    }
    @Test(dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test2(){

        System.out.println("Test2 is running");
    }
    @Test
    public void test3(){

        System.out.println("Test3 is running");
        assertEquals(3,5);
    }
    @Test(dependsOnMethods = {"test3", "test1"})
    public void test4(){

        System.out.println("Test4 is running");
    }

}
