package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PartnerStatusPage {
    public WebDriver driver;

    public PartnerStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosePartnerStatus(String partnerStatus){
        driver.findElement(By.xpath("//label[text()='"+partnerStatus+"']")).click();
    }
}
