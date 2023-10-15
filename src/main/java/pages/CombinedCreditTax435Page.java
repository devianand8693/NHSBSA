package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CombinedCreditTax435Page {
    public WebDriver driver;

    public CombinedCreditTax435Page(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosecombineduniversalclaimbenefit435status(String combinedCredits435){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedCredits435+"']")).click();
    }
}
