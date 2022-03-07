package tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals; // control+space

public class CalculatorTest {

    @BeforeClass
    public void init(){
        System.out.println("Run once before class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Run once before each test");
    }

    @Test
    public void A() {
        // 1 + 5 = 6
        assertEquals(1 + 5, 6);
        System.out.println("Test 1 is running");
    }

    @Test
    public void B(){

        assertEquals(10-4,6);
        System.out.println("Test 2 is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Run once after each test");
    }
    @AfterClass
    public void cleanUp(){

        System.out.println("Run once after class");


    }

}
