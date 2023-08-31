package tests;

import org.testng.annotations.Test;
import pageObjects.RozetkaHomePage;

public class TestRozetka extends TestInit{

    @Test
    public void checkHeaderCart(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.setLaptopSearch();
    }
    
}
