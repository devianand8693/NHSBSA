package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PensionCreditPage {
    public WebDriver driver;

    public PensionCreditPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void choosepensioncreditcheck(){
        driver.findElement(By.cssSelector("label[for='guaranteecreditonly']")).click();
    }
}
