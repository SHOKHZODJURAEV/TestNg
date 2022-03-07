package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider {



    @DataProvider(name = "A")
    public Object[][] provide(){
        return new Object[][]{
                {"Adam"},
                {"John"},
                {"Mary"},
                {"Alice"}
        };
    }
    @Test(dataProvider = "A")
    public void A(String name){
        System.out.println(name);
    }

    @DataProvider(name = "B")
    public Object[][] dataWorld(){

        return new Object[][]{
                {"Lupa", 20},
                {"Like", 30},
                {"Gusha", 40},
                {"Kick", 50}

        };



    }

    @Test(dataProvider = "B")
    public void B(String name, int what){


        System.out.println(name+" something wrong here "+what);



    }

}
