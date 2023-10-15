package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EligibilityCheckerHomePage {
    public WebDriver driver;
    public EligibilityCheckerHomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(id="next-button")
    public WebElement startbtn;
    @FindBy(xpath ="//*[@id='nhsuk-cookie-banner__link_accept_analytics']")
    public WebElement cookiebtn;

    @FindBy(xpath="//*[@id='next-button']")
    public WebElement nextbtn;
    public void clickstartbtn(){
        startbtn.click();
    }
    public void clickcookiebtn(){
        cookiebtn.click();
    }

    public void clicknextbutn(){
        nextbtn.click();

    }
}




