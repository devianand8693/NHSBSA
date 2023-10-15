package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.*;


import java.util.List;

public class EligibilityCheckerSteps extends CommonFunctions {
    EligibilityCheckerHomePage eligibilityCheckerHomePage = new EligibilityCheckerHomePage(driver);
    EligibleCountryPage eligibleCountryPage = new EligibleCountryPage(driver);
    EligibleGpPracticePage eligibleGpPracticePage = new EligibleGpPracticePage(driver);
    EligibleDentalPracticePage eligibleDentalPracticePage = new EligibleDentalPracticePage(driver);
    EligibleDobPage eligibleDobPage = new EligibleDobPage(driver);
    PartnerStatusPage partnerStatusPage = new PartnerStatusPage((driver));
    PartnerClaimBenefitsPage partnerClaimBenefitsPage = new PartnerClaimBenefitsPage(driver);
    UniversalClaimcreditsPage universalcreditsPage = new UniversalClaimcreditsPage(driver);
    JointUniversalCreditsPage jointUniversalCreditsPage = new JointUniversalCreditsPage(driver);
    CombinedUniversalcreditsPage combinedUniversalcreditsPage = new CombinedUniversalcreditsPage(driver);
    NhsFreeOffOptionsPage nhsFreeOffOptionsPage = new NhsFreeOffOptionsPage(driver);
    NhsMoneyOffOptionsPage nhsMoneyOffOptionsPage = new NhsMoneyOffOptionsPage(driver);
    ScotlandlocationPage scotlandlocationPage = new ScotlandlocationPage(driver);
    SelfclaimbenefitsStatusPage selfclaimbenefitsStatusPage = new SelfclaimbenefitsStatusPage(driver);
    PregnancyStatusPage pregnancyStatusPage = new PregnancyStatusPage(driver);
    InjuryorIllnessStatusPage injuryorIllnessStatusPage = new InjuryorIllnessStatusPage(driver);
    CareHomeStatusPage careHomeStatusPage = new CareHomeStatusPage(driver);
    LocalCouncilPayPage localCouncilPayPage = new LocalCouncilPayPage(driver);
    FulltimeEducationDetailsPage fulltimeEducationDetailsPage = new FulltimeEducationDetailsPage(driver);
    UniversalCreditsPage universalCreditsPage = new UniversalCreditsPage(driver);
    OtherBenfitsPage otherBenfitsPage = new OtherBenfitsPage(driver);
    JobSeekersAllowancePage jobSeekersAllowancePage = new JobSeekersAllowancePage(driver);
    CombinedCreditTax435Page combinedCreditTax435Page = new CombinedCreditTax435Page(driver);
    DiabetesStatusPage diabetesStatusPage = new DiabetesStatusPage(driver);
    GlaucomaStatusPage glaucomaStatusPage = new GlaucomaStatusPage(driver);
    Savingmorethan16000Page savingmorethan16000Page = new Savingmorethan16000Page(driver);
    Savingsmorethan2350Page savingsmorethan2350Page = new Savingsmorethan2350Page(driver);
    CareHomepatrnerPage careHomepatrnerPage = new CareHomepatrnerPage(driver);
    PensionCreditPage pensionCreditPage = new PensionCreditPage(driver);

    @Given("I am on homepage {string} with title {string}")
    public void openHomePage(String url, String expectedPageTitle) {
        driver.get(url);
        Assert.assertEquals(expectedPageTitle, driver.getTitle());
    }

    @When("I click the startnow button")
    public void clickstartnowbutton() {
        eligibilityCheckerHomePage.clickstartbtn();
        eligibilityCheckerHomePage.clickcookiebtn();
    }

    @And("I Choose the country {string} with text in a page {string}")
    public void selectcountry(String country, String expectedCountryPageTitle) {
        eligibleCountryPage.chooseCountry(country);
        String actualCountryPageTitle = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCountryPageTitle, actualCountryPageTitle);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose gp practice is in scotland or wales {string} with text in a page {string}")
    public void selectgpcatgy(String gplocationstatus, String expectedGpPracticeQuestionText) {
        eligibleGpPracticePage.chooseGpcategory(gplocationstatus);
        String actualGpPracticeQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedGpPracticeQuestionText, actualGpPracticeQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I select country for dental practice {string} with text in a page {string}")
    public void selectdentalpractice(String dentalpracticelocation, String expectedDentalPracticeQuestionText) {
        eligibleDentalPracticePage.chooseDentalPractice(dentalpracticelocation);
        String actualDentalPracticeQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedDentalPracticeQuestionText, actualDentalPracticeQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();

    }
    @And("I enter dob as date {string} month {string} year {string} with text in a page {string}")
    public void iEnterDateMonthYearInDobBox(String date, String month, String year, String expectedDOBQuestionText) {
        eligibleDobPage.typeDate(date);
        eligibleDobPage.typeMonth(month);
        eligibleDobPage.typeYear(year);
        String actualDOBQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedDOBQuestionText, actualDOBQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose living with partner as {string} with text in a page {string}")
    public void Partnerstatus(String partnerStatus, String expectedPartnerStatusQuestionText) {
        partnerStatusPage.choosePartnerStatus(partnerStatus);
        String actualPartnerStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPartnerStatusQuestionText, actualPartnerStatusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }


    @And("I select partner claim benefits status  as {string} with text in a page {string}")
    public void PartnerclaimBenefits(String partnerClaimBenefitsStatus, String expectedPartnerClaimBenefitsQuestionText) {
        partnerClaimBenefitsPage.choosePartnerclaimbenefitstatus(partnerClaimBenefitsStatus);
        String actualPartnerClaimBenefitsQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPartnerClaimBenefitsQuestionText, actualPartnerClaimBenefitsQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();

    }

    @And("I select universal credits status as  {string} with text in a page {string}")
    public void UniversalCreditsWithOption(String universalCredits, String expectedUniversalCreditsQuestionsText) {
        universalcreditsPage.chooseuniversalclaimbenefitstatus(universalCredits);
        String actualUniversalCreditsQuestionsText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedUniversalCreditsQuestionsText, actualUniversalCreditsQuestionsText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I select joint universal credits status as {string} with text in a page {string}")
    public void JointUniversalCredits(String jointUniversalCredits, String expectedJointsUniversalCreditsQuestionsText) {
        jointUniversalCreditsPage.choosejointuniversalclaimbenefitstatus(jointUniversalCredits);
        String actualJointsUniversalCreditsQuestionsText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedJointsUniversalCreditsQuestionsText, actualJointsUniversalCreditsQuestionsText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I select combined universal tax credits is £935 pounds {string} with text in a page {string}")
    public void combinedTaxCredits(String combinedCredits, String expectedCombinedCreditsQuestionText) {
        combinedUniversalcreditsPage.choosecombineduniversalclaimbenefitstatus(combinedCredits);
        String actualCombinedCreditsQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedCreditsQuestionText, actualCombinedCreditsQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @Then("I should be provided with {string} message as well as free")
    public void message_as_well_as_free(String string, DataTable dataTable) {
        List<List<String>> freeOptions = dataTable.asLists();
        nhsFreeOffOptionsPage.assertFreeOptions(freeOptions);

    }

    @And("I should be provided with {string} more money off  options")
    public void moneyoffoptions(String string, DataTable dataTable) {
        List<List<String>> moneyoffOptions = dataTable.asLists();
        nhsMoneyOffOptionsPage.assertMoneyoffOptions(moneyoffOptions);
    }

    @And("I choose the location the highlands and midlands as in scotland {string} with text in a page {string}")
    public void scotlandlocation(String scotLocation, String expectedScotlandLocationQuestionText) {
        scotlandlocationPage.choosescotlandlocation(scotLocation);
        String actualScotlandLocationQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedScotlandLocationQuestionText, actualScotlandLocationQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I select own claim benefits status  as {string} with text in a page {string}")
    public void ownclaimbenefits(String ownClaimOption, String expectedClaimBenefitQuestionText) {
        selfclaimbenefitsStatusPage.chooseownclaimbenefits(ownClaimOption);
        String actualClaimBenefitQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedClaimBenefitQuestionText, actualClaimBenefitQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose pregnancy status as {string} with text in a page {string}")
    public void pregnancyoption(String pregnancyStatus, String expectedPregnancyStatusQuestionText) {
        pregnancyStatusPage.choosepregnancystatus(pregnancyStatus);
        String actualPregnancyStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPregnancyStatusQuestionText, actualPregnancyStatusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose injury or illness status caused by armedforce as {string} with text in a page {string}")
    public void injurystatus(String injuryorillnessstatus, String expectedInjuryOrIllnessQuestionText) {
        injuryorIllnessStatusPage.chooseinjuryillnessstatus(injuryorillnessstatus);
        String actualInjuryOrIllnessQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedInjuryOrIllnessQuestionText, actualInjuryOrIllnessQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose permanent living carehome status as {string} with text in a page {string}")
    public void livecarehomeoption(String carehomelivestatus, String expectedCareHomeLiveQuestionText) {
        careHomeStatusPage.choosecarehomestatus(carehomelivestatus);
        String actualCareHomeLiveQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCareHomeLiveQuestionText, actualCareHomeLiveQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose the localcouncilpay for carehome with an option as {string} with text in a page {string}")
    public void localpaycarehomeoption(String localcouncilpaystatus, String expectedLocalCouncilPayQuestionText) {
        localCouncilPayPage.chooselocalcouncilpaystatus(localcouncilpaystatus);
        String actualLocalCouncilPayQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedLocalCouncilPayQuestionText, actualLocalCouncilPayQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I click next button and got an error message")
    public void errormessage() {
        eligibilityCheckerHomePage.clicknextbutn();
        driver.findElement(By.xpath("//*[@role='alert']")).getText();
    }

    @And("I choose the status of full-time education as {string} with text in a page {string}")
    public void educationstatusoption(String educationStatus, String expectedEducationStatusQuestionText) {
        fulltimeEducationDetailsPage.choosefulltimeeducationstatus(educationStatus);
        String actualEducationStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedEducationStatusQuestionText, actualEducationStatusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I got an message {string}")
    public void ageundersixteen(String expectedcheckageundersixteen) {
        String actualcheckageundersixteen = driver.findElement(By.xpath("//p[@class='lede']")).getText();
        Assert.assertEquals(expectedcheckageundersixteen, actualcheckageundersixteen);
    }

    @Then("I got an message for NorthernIreland user {string}")
    public void alertmessagefornorthireland(String expectedstatusforNorthernIreland) {
        String actualstatusforNorthernIreland = driver.findElement(By.xpath("//h1[@id='result-heading']")).getText();
        Assert.assertEquals(expectedstatusforNorthernIreland, actualstatusforNorthernIreland);

    }

    @And("I select self universal credits status as {string} with text in a page {string}")
    public void SelfUniversalCreditsStatusoption(String selfuniversalcreditsstatus, String expecteduniversalcreditquestiontext) {
        universalCreditsPage.chooseuniversalcreditdiffrenetbenefitoption(selfuniversalcreditsstatus);
        String actualuniversalcreditquestiontext = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expecteduniversalcreditquestiontext, actualuniversalcreditquestiontext);
        eligibilityCheckerHomePage.clicknextbutn();

    }

    @And("I select combined universal tax credits is £435 pounds {string} with text in a page {string}")
    public void combinedTaxCredits435(String combinedCredits435, String expectedCombinedCredits435QuestionText) {
        combinedCreditTax435Page.choosecombineduniversalclaimbenefit435status(combinedCredits435);
        String actualCombinedCredits435QuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedCredits435QuestionText, actualCombinedCredits435QuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose Diabetes status as {string} with text in a page {string}")
    public void checkdiabetesstatus(String diabetesstatus, String expecteddiatesstatusQuestionText) {
        diabetesStatusPage.choosedaibetesstatus(diabetesstatus);
        String actualdiatesstatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expecteddiatesstatusQuestionText, actualdiatesstatusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose glaucoma status as {string} with text in a page {string}")
    public void checkglaucomastatus(String glaucomastatus, String expectedglaucomastatusQuestionText) {
        glaucomaStatusPage.chooseglaucomastatus(glaucomastatus);
        String actualglaucomastatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedglaucomastatusQuestionText, actualglaucomastatusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose savings morethan £16000 with an option {string} with a text in a page {string}")
    public void savingmorethan16000status(String saving16000status, String expectedsaving16000statusQuestionText) {
        savingmorethan16000Page.choosesaving16000status(saving16000status);
        String actualsaving16000statusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedsaving16000statusQuestionText, actualsaving16000statusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }


    @Then("I should be provided with message based on savings {string}")
    public void MessageBasedOnSavings(String expectedmessagebasedonsavingText) {
        String actualmessagebasedonsavingText = driver.findElement(By.xpath("//h2[@id='FREE-heading']")).getText();
        Assert.assertEquals(expectedmessagebasedonsavingText, actualmessagebasedonsavingText);

    }

    @And("I select combined saving benefits is more than £2350 pounds {string} with text in a page {string}")
    public void combinedsavingmorethan23250status(String combinedsaving23250status, String expectedCombinedsaving23250statusQuestionText) {
        savingsmorethan2350Page.chooseCombinedsaving23250status(combinedsaving23250status);
        String actualCombinedsaving23250statusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedsaving23250statusQuestionText, actualCombinedsaving23250statusQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose permanent living carehome with partner status as {string} with text in a page {string}")
    public void CarehomeWithPartnerStatusoption(String carehomepartnerlivestatus, String expectedCareHomePartnerLiveQuestionText) {
        careHomepatrnerPage.choosecarehomepartnerstatus(carehomepartnerlivestatus);
        String actualCareHomepartnerLiveQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCareHomePartnerLiveQuestionText, actualCareHomepartnerLiveQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }


    @And("I choose the otherbenefits option as Jobseeker'sAllowance with text in a page {string}")
    public void iChooseTheOtherbenefitsOptionAsJobseekerSAllowanceWithTextInAPage(String expectedotherbenefitsQuestionText) {
        otherBenfitsPage.chooseotherbenefitcheck();
        String actualotherbenefitsQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedotherbenefitsQuestionText, actualotherbenefitsQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose Income-based JSA from Jobseeker's allowance")
    public void JobseekerSAllowanceoption() {
        jobSeekersAllowancePage.choosejobseekercheck();
        eligibilityCheckerHomePage.clicknextbutn();

    }
    @And("I choose the otherbenefits option as pension benefits with text in a page {string}")
    public void OtherbenefitsOptionAsPension(String expectedotherbenefitsoptiontwoQuestionText) {
        otherBenfitsPage.chooseotherbenefitpensioncheck();
        String actualotherbenefitsoptiontwoQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedotherbenefitsoptiontwoQuestionText, actualotherbenefitsoptiontwoQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();

    }

    @And("I choose the otherbenefits option as pension benefits with text in a page")
    public void TheOtherbenefitsOptionAsPension() {
        otherBenfitsPage.chooseotherbenefitpensioncheck();
        eligibilityCheckerHomePage.clicknextbutn();
    }

    @And("I choose the guarantee credit option in pension benefits with a text in a page {string}")
    public void TheGuaranteeCreditOptionInPensionBenefits(String expectedpensionQuestionText) {
        pensionCreditPage.choosepensioncreditcheck();
        String actualpensionQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedpensionQuestionText, actualpensionQuestionText);
        eligibilityCheckerHomePage.clicknextbutn();
    }
}




   

   



