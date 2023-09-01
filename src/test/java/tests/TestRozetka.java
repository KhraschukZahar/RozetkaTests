package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RozetkaHomePage;

public class TestRozetka extends TestInit{

    @Test
    public void checkHeaderCart(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.setiPhoneSearch();
        Assert.assertTrue(rozetkaHomePage.getGoods().contains("iPhone 13"));
        Assert.assertFalse(rozetkaHomePage.getGoods().contains("iPhone 11"));
        Assert.assertFalse(rozetkaHomePage.getGoods().contains("Nokia"));
        driver.close();
    }
    
}
