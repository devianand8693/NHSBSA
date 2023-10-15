package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InjuryorIllnessStatusPage {
    public WebDriver driver;

    public InjuryorIllnessStatusPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseinjuryillnessstatus(String injuryorillnessstatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+injuryorillnessstatus+"']")).click();
    }
}
