package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class GoogleHomePageTest {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testHomePage() throws InterruptedException {

        driver.get("https://google.com");
        Thread.sleep(3000);
        // assert the title is Google
        assertEquals(driver.getTitle(), "Google");
        Thread.sleep(3000);

    }

    @Test
    public void testSearch() throws InterruptedException {

        driver.get("https://google.com");
        Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        Thread.sleep(1000);

        assertEquals(driver.getTitle(), "Selenium - Google Search");
        Thread.sleep(1000);
    }

    // create a data provider method for google search multiple items
    // verify the expected title according to what we search

    @DataProvider(name = "searchData")
    public Object[][]provedeSearchData(){

        return new Object[][]{
                {"Selenium", "Selenium - Google Search"},
                {"java", "java - Google Search"},
                {"job", "job - Google Search"}


        };
    }

    @Test(dataProvider = "searchData")

        public void searchDataDriven(String keyWoord, String expectedTitle) throws InterruptedException {

        System.out.println("Search "+keyWoord+" expected title is "+ expectedTitle);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);

        // search for keyword

        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        Thread.sleep(1000);

        assertEquals(driver.getTitle(),expectedTitle);

        Thread.sleep(2000);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
