package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DiabetesStatusPage {
    public WebDriver driver;

    public DiabetesStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosedaibetesstatus(String diabetesstatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+diabetesstatus+"']")).click();
    }
}
