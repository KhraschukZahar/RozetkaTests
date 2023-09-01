package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name='search']"));
    }

    public RozetkaHomePage setiPhoneSearch() {
        getSearchField().sendKeys("айфон 13\n");
        return this;
    }

    public String getGoods(){
        List<String> goods = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='goods-tile__inner']"));
        for (WebElement element : elements) {
            String text = element.getText();
            goods.add(text);
        }
        return String.valueOf(goods);
    }
}