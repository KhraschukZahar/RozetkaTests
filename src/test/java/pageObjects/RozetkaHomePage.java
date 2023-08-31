package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name='search']"));
    }

    public RozetkaHomePage setLaptopSearch() {
        getSearchField().sendKeys("айфон 13\n");
        return this;
    }
}