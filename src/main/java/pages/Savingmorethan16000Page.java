package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Savingmorethan16000Page {
    public WebDriver driver;

    public Savingmorethan16000Page(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void choosesaving16000status(String saving16000status){
        driver.findElement(By.xpath("//label[normalize-space()='"+saving16000status+"']")).click();
    }
}
