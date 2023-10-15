package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EligibilityCheckerPage {

    public WebDriver driver;
    public EligibilityCheckerPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(id="next-button")
    public WebElement startbtn;
    @FindBy(xpath ="//*[@id='nhsuk-cookie-banner__link_accept_analytics']")
    public WebElement cookiebtn;

    @FindBy(xpath="//*[@id='next-button']")
    public WebElement nextbtn;
    @FindBy(id="label-yes")
    public WebElement selctgpyes;
    @FindBy(id="radio-england")
    public WebElement selctdentalcunty;
    @FindBy(xpath="//*[@name='dateOfBirth.day']")
    public WebElement datetxtfld;
    @FindBy(xpath="//*[@name='dateOfBirth.month']")
    public WebElement monthtxtfld;
    @FindBy(xpath="//*[@name='dateOfBirth.year']")
    public WebElement yeartxtfld;
    @FindBy(xpath="//*[@id='radio-yes']")
    public WebElement partnerstsys;
    @FindBy(xpath="//*[@id='radio-yes']")
    public WebElement partnerclaimcreditsys;

    @FindBy(xpath="//*[@id='yes-universal']")
    public WebElement universlcreditsgetpaidys;
    @FindBy(xpath="//*[@id='radio-yes']")
    public WebElement jntuniversalcreditys;
    @FindBy(xpath="//*[@id='radio-yes']")
    public WebElement partnertakehmeys;
    @FindBy(id="label-no")
    public WebElement selctgpno;
    @FindBy(id="label-scotland")
    public WebElement selctdentalcunty1;
    @FindBy(xpath="//label[@id='label-no']")
    public WebElement partnerstsno;
    @FindBy(xpath ="//label[@id='label-no']")
    public WebElement ownclaimno;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nopregnant;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement noinjury;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nodiabetes;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nootherinjury;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement noglaucoma;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nolivecarehome;
    @FindBy(xpath = "//label[@id='label-no']")
    public WebElement nosavingstats;

    @FindBy(xpath="//li[text() [normalize-space()='NHS prescriptions']]")
    public WebElement freePrescriptionTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='NHS dental check-ups and treatment']]")
    public WebElement freedentalcheckupTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='sight tests']]")
    public WebElement freesighttestsTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='NHS wigs and fabric supports']]")
    public WebElement freeNHSwigsandfabricsupportsTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='new glasses or contact lenses']]")
    public WebElement moneyOffnewglassesTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='repairing or replacing your glasses or contact lenses']]")
    public WebElement moneyOffrepairingglassesTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='travel for NHS treatment']]")
    public WebElement moneyOffTravelTreatmentTextElement;
    @FindBy(xpath="//li[text() [normalize-space()='NHS eye examinations']]")
    public WebElement freeEyeExaminationTextElement;





    public void clickstartbtn(){
startbtn.click();
    }
    public void clickcookiebtn(){
        cookiebtn.click();
    }
    public void chooseCountry(String country){
        driver.findElement(By.xpath("//label[normalize-space()='"+country+"']")).click();
    }
    public void clicknextbutn(){
        nextbtn.click();

    }
    public void chooseGpcategory(String gplocationstatus){
        driver.findElement(By.xpath("//input[@value='"+gplocationstatus+"']")).click();
    }
    public void chooseDentalPractice(String dentalpracticelocation){
        driver.findElement(By.xpath("//label[text()='"+dentalpracticelocation+"']")).click();
    }
     public void typeDate(String date){
        datetxtfld.sendKeys(date);
     }
    public void typeMonth(String month){
        monthtxtfld.sendKeys(month);
    }
    public void typeYear(String year){
        yeartxtfld.sendKeys(year);
    }
    public void choosePartnerStatus(String partnerStatus){
        driver.findElement(By.xpath("//label[text()='"+partnerStatus+"']")).click();
    }
    public void choosePartnerclaimbenefitstatus(String partnerClaimBenefitsStatus){
        driver.findElement(By.xpath("//label[text()='"+partnerClaimBenefitsStatus+"']")).click();
    }
    public void chooseuniversalclaimbenefitstatus(String universalCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+universalCredits+"']")).click();
    }
    public void choosejointuniversalclaimbenefitstatus(String jointUniversalCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+jointUniversalCredits+"']")).click();
    }
    public void choosecombineduniversalclaimbenefitstatus(String combinedCredits){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedCredits+"']")).click();
    }
    public void choosescotlandlocation(String scotLocation){
        driver.findElement(By.xpath("//label[normalize-space()='"+scotLocation+"']")).click();
    }
    public void chooseownclaimbenefits(String ownClaimOption){
        driver.findElement(By.xpath("//label[normalize-space()='"+ownClaimOption+"']")).click();
    }
    public void choosepregnancystatus(String pregnancyStatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+pregnancyStatus+"']")).click();
    }
    public void chooseinjuryillnessstatus(String injuryorillnessstatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+injuryorillnessstatus+"']")).click();
    }
    public void choosecarehomestatus(String carehomelivestatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+carehomelivestatus+"']")).click();
    }
    public void chooselocalcouncilpaystatus(String localcouncilpaystatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+localcouncilpaystatus+"']")).click();
    }
    public void choosefulltimeeducationstatus(String educationStatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+educationStatus+"']")).click();
    }
    public void choosecombineduniversalclaimbenefit435status(String combinedCredits435){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedCredits435+"']")).click();
    }
    public void choosedaibetesstatus(String diabetesstatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+diabetesstatus+"']")).click();
    }
    public void chooseglaucomastatus(String glaucomastatus){
        driver.findElement(By.xpath("//label[normalize-space()='"+glaucomastatus+"']")).click();
    }
    public void choosesaving16000status(String saving16000status){
        driver.findElement(By.xpath("//label[normalize-space()='"+saving16000status+"']")).click();
    }
    public void choosebloodlevelstatus(String bloodsugarlevel){
        driver.findElement(By.xpath("//label[normalize-space()='"+bloodsugarlevel+"']")).click();
    }

    public void chooseCombinedsaving23250status(String combinedsaving23250status){
        driver.findElement(By.xpath("//label[normalize-space()='"+combinedsaving23250status+"']")).click();
    }
    public void chooseuniversalcreditdiffrenetbenefitoption(String selfuniversalcreditsstatus){
        driver.findElement(By.xpath("//label[text() [normalize-space()='No, I get a different benefit']]")).click();
    }
    public void chooseothertypebenefitstatus(String othertypebenefitcheck){
        driver.findElement(By.xpath("//label[normalize-space()='"+othertypebenefitcheck+"']")).click();
    }
    public void chooseotherpensionbenefitstatus(String pensiontypecheck){
        driver.findElement(By.xpath("//label[normalize-space()='"+pensiontypecheck+"']")).click();
    }










   // public void chooseselfuniversalcreditstatus(String selfuniversalcreditStatus){
       // driver.findElement(By.xpath("//*[@value='"+ selfuniversalcreditStatus+"']")).click();
    //}

    public void assertFreeOptions(List<List<String>> freeOptions)
    {
        for(int i=0; i<freeOptions.size();i++) {
           WebElement expectedFreeOption =  driver.findElement(By.xpath("//li[text() [normalize-space()='" + freeOptions.get(0).get(i) + "']]"));
           Assert.assertTrue(expectedFreeOption.isDisplayed());
        }

    }
    public void assertmoneyoffOptions(String expectedMoneyOffNewGlassText, String expectedMoneyOffRepairingGlassText, String expectedMoneyOffTravelTreatmentText)
    {
        Assert.assertEquals(expectedMoneyOffNewGlassText, moneyOffnewglassesTextElement.getText());
        Assert.assertEquals(expectedMoneyOffRepairingGlassText, moneyOffrepairingglassesTextElement.getText());
        Assert.assertEquals(expectedMoneyOffTravelTreatmentText, moneyOffTravelTreatmentTextElement.getText());

    }



}
