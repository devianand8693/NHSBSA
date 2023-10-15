package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelfclaimbenefitsStatusPage {
    public WebDriver driver;

    public SelfclaimbenefitsStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseownclaimbenefits(String ownClaimOption){
        driver.findElement(By.xpath("//label[normalize-space()='"+ownClaimOption+"']")).click();
    }
}
