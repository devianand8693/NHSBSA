package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareHomepatrnerPage {
    public WebDriver driver;

    public CareHomepatrnerPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosecarehomepartnerstatus(String carehomepartnerlivestatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+carehomepartnerlivestatus+"']")).click();
    }
}
