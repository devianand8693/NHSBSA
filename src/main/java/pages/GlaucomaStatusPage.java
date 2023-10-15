package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaStatusPage {
    public WebDriver driver;
    public GlaucomaStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseglaucomastatus(String glaucomastatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+glaucomastatus+"']")).click();
    }
}
