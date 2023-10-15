package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LocalCouncilPayPage {
    public WebDriver driver;

    public LocalCouncilPayPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public void chooselocalcouncilpaystatus(String localcouncilpaystatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+localcouncilpaystatus+"']")).click();
    }
}
