package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FulltimeEducationDetailsPage {
    public WebDriver driver;

    public FulltimeEducationDetailsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosefulltimeeducationstatus(String educationStatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+educationStatus+"']")).click();
    }
}
