package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniversalClaimcreditsPage {
    public WebDriver driver;

    public UniversalClaimcreditsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseuniversalclaimbenefitstatus(String universalCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+universalCredits+"']")).click();
    }
}
