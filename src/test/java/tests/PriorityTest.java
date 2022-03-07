package tests;

import org.testng.annotations.Test;

public class PriorityTest {


    @Test(priority = 3)
    public void test1(){
        System.out.println("Test1 is running ");
    }
    @Test(priority = 4)
    public void test2(){
        System.out.println("Test2 is running ");
    }
    @Test(priority = 2)
    public void test3(){
        System.out.println("Test3 is running ");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("Test4 is running ");
    }
    @Test(priority = 5)
    public void test5(){
        System.out.println("Test5 is running ");
    }
}
