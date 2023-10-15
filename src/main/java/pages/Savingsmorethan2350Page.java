package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Savingsmorethan2350Page {
    public WebDriver driver;

    public Savingsmorethan2350Page(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooseCombinedsaving23250status(String combinedsaving23250status){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedsaving23250status+"']")).click();
    }


}
