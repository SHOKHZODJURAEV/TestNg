package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class IgnoringTest {
 //   @Ignore
    @Test(enabled = false)
    public void test1(){
        System.out.println("Test1 is running");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("Test2 is running");
    }
    @Test
    public void test3(){
        System.out.println("Test3 is running");
    }

}
