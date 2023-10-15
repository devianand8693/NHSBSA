package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PartnerClaimBenefitsPage {
    public WebDriver driver;

    public PartnerClaimBenefitsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosePartnerclaimbenefitstatus(String partnerClaimBenefitsStatus){
        driver.findElement(By.xpath("//label[text()='"+partnerClaimBenefitsStatus+"']")).click();
    }
}
