package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeAfterSuiteClass {

    @BeforeSuite
    public void setupSuite(){

        System.out.println("@Before suite Run once before ");

    }

    @BeforeTest
    public void setupTestSet(){
        System.out.println("@Before Test Run Once Before Each test");
    }


    @AfterSuite
    public void teardownSuite(){

        System.out.println("@After suite Run once after");

    }




}
