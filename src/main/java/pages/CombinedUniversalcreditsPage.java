package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CombinedUniversalcreditsPage {
    public WebDriver driver;

    public CombinedUniversalcreditsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosecombineduniversalclaimbenefitstatus(String combinedCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedCredits+"']")).click();
    }
}
