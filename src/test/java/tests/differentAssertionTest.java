package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class differentAssertionTest {


    @Test
    public void test1(){

        System.out.println("Test1 is running");
    //    assertEquals(2,2);

      //  Assert.assertEquals(2, 3);

        Assert.assertEquals(5,5, "invalid number");


        //Assert.assertEquals("Selenium", "java", "Selenium is not jave");

        Assert.assertNotEquals(2,3);
        Assert.assertTrue(10>5, "incalid");

        Assert.assertFalse(31<21);

        String abc = null;

        Assert.assertNull(abc);


        Assert.assertNull(abc);

        String str2 = "testNg";
        Assert.assertNotNull(str2);






    }




}
