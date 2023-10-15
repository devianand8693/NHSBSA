package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JointUniversalCreditsPage {
    public WebDriver driver;

    public JointUniversalCreditsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosejointuniversalclaimbenefitstatus(String jointUniversalCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+jointUniversalCredits+"']")).click();
    }
}
