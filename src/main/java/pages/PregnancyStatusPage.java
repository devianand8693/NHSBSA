package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PregnancyStatusPage {
    public WebDriver driver;

    public PregnancyStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosepregnancystatus(String pregnancyStatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+pregnancyStatus+"']")).click();
    }
}
