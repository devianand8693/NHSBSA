package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EligibleCountryPage {
    public WebDriver driver;
    public EligibleCountryPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseCountry(String country){
        driver.findElement(By.xpath("//label[normalize-space()='"+country+"']")).click();
    }
}
