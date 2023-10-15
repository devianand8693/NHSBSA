package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareHomeStatusPage {
    public WebDriver driver;

    public CareHomeStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosecarehomestatus(String carehomelivestatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+carehomelivestatus+"']")).click();
    }
}
