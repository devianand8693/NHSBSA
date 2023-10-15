package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NhsMoneyOffOptionsPage {
    public WebDriver driver;

    public NhsMoneyOffOptionsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void assertMoneyoffOptions(List<List<String>> moneyoffOptions)
    {
        for(int i=0; i<moneyoffOptions.size();i++) {
            WebElement expectedMoneyoffOption =  driver.findElement(By.xpath("//li[text() [normalize-space()='" + moneyoffOptions.get(0).get(i) + "']]"));
            Assert.assertTrue(expectedMoneyoffOption.isDisplayed());
        }

    }
}
