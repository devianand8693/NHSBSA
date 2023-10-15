package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UniversalCreditsPage {
    public WebDriver driver;

    public UniversalCreditsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseuniversalcreditdiffrenetbenefitoption(String selfuniversalcreditsstatus){
        driver.findElement(By.xpath("//label[text() [normalize-space()='"+selfuniversalcreditsstatus+"']]")).click();
    }
}
