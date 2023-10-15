package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EligibleDentalPracticePage {
    public WebDriver driver;
    public EligibleDentalPracticePage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseDentalPractice(String dentalpracticelocation){
        driver.findElement(By.xpath("//label[text()='"+dentalpracticelocation+"']")).click();
    }
}
