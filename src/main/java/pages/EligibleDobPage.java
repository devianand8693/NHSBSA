package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EligibleDobPage {
    public WebDriver driver;

    public EligibleDobPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(xpath = "//*[@name='dateOfBirth.day']")
    public WebElement datetxtfld;
    @FindBy(xpath = "//*[@name='dateOfBirth.month']")
    public WebElement monthtxtfld;
    @FindBy(xpath = "//*[@name='dateOfBirth.year']")
    public WebElement yeartxtfld;

    public void typeDate(String date) {
        datetxtfld.sendKeys(date);
    }

    public void typeMonth(String month) {
        monthtxtfld.sendKeys(month);
    }

    public void typeYear(String year) {
        yeartxtfld.sendKeys(year);

    }
}
