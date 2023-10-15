package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NhsFreeOffOptionsPage {
    public WebDriver driver;

    public NhsFreeOffOptionsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void assertFreeOptions(List<List<String>> freeOptions)
    {
        for(int i=0; i<freeOptions.size();i++) {
            WebElement expectedFreeOption =  driver.findElement(By.xpath("//li[text() [normalize-space()='" + freeOptions.get(0).get(i) + "']]"));
            Assert.assertTrue(expectedFreeOption.isDisplayed());
        }

    }
}
