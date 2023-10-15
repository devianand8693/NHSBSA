package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OtherBenfitsPage {
    public WebDriver driver;

    public OtherBenfitsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseotherbenefitcheck(){
        driver.findElement(By.xpath("//label[@for='jsa']")).click();
    }
    public void chooseotherbenefitpensioncheck(){
        driver.findElement(By.cssSelector("label[for='penCredit']")).click();
    }
}
