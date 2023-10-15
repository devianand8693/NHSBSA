package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.EligibilityCheckerPage;

import java.util.List;

public class EligibilityCheckerSteps extends CommonFunctions {
    EligibilityCheckerPage eligibilityCheckerPage = new EligibilityCheckerPage(driver);

    @Given("I am on homepage {string} with title {string}")
    public void openHomePage(String url, String expectedPageTitle) {
        driver.get(url);
        Assert.assertEquals(expectedPageTitle, driver.getTitle());
    }

    @When("I click the startnow button")
    public void clickstartnowbutton() {
        eligibilityCheckerPage.clickstartbtn();
        eligibilityCheckerPage.clickcookiebtn();
    }

    @And("I Choose the country {string} with text in a page {string}")
    public void selectcountry(String country, String expectedCountryPageTitle) {
        eligibilityCheckerPage.chooseCountry(country);
        String actualCountryPageTitle = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCountryPageTitle, actualCountryPageTitle);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose gp practice is in scotland or wales {string} with text in a page {string}")
    public void selectgpcatgy(String gplocationstatus, String expectedGpPracticeQuestionText) {
        eligibilityCheckerPage.chooseGpcategory(gplocationstatus);
        String actualGpPracticeQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedGpPracticeQuestionText, actualGpPracticeQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I select country for dental practice {string} with text in a page {string}")
    public void selectdentalpractice(String dentalpracticelocation, String expectedDentalPracticeQuestionText) {
        eligibilityCheckerPage.chooseDentalPractice(dentalpracticelocation);
        String actualDentalPracticeQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedDentalPracticeQuestionText, actualDentalPracticeQuestionText);
        eligibilityCheckerPage.clicknextbutn();

    }


    @And("I enter dob as date {string} month {string} year {string} with text in a page {string}")
    public void iEnterDateMonthYearInDobBox(String date, String month, String year, String expectedDOBQuestionText) {
        eligibilityCheckerPage.typeDate(date);
        eligibilityCheckerPage.typeMonth(month);
        eligibilityCheckerPage.typeYear(year);
        String actualDOBQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedDOBQuestionText, actualDOBQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose living with partner as {string} with text in a page {string}")
    public void Partnerstatus(String partnerStatus, String expectedPartnerStatusQuestionText) {
        eligibilityCheckerPage.choosePartnerStatus(partnerStatus);
        String actualPartnerStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPartnerStatusQuestionText, actualPartnerStatusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }


    @And("I select partner claim benefits status  as {string} with text in a page {string}")
    public void PartnerclaimBenefits(String partnerClaimBenefitsStatus, String expectedPartnerClaimBenefitsQuestionText) {
        eligibilityCheckerPage.choosePartnerclaimbenefitstatus(partnerClaimBenefitsStatus);
        String actualPartnerClaimBenefitsQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPartnerClaimBenefitsQuestionText, actualPartnerClaimBenefitsQuestionText);
        eligibilityCheckerPage.clicknextbutn();

    }

    @And("I select universal credits status as  {string} with text in a page {string}")
    public void UniversalCreditsWithOption(String universalCredits, String expectedUniversalCreditsQuestionsText) {
        eligibilityCheckerPage.chooseuniversalclaimbenefitstatus(universalCredits);
        String actualUniversalCreditsQuestionsText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedUniversalCreditsQuestionsText, actualUniversalCreditsQuestionsText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I select joint universal credits status as {string} with text in a page {string}")
    public void JointUniversalCredits(String jointUniversalCredits, String expectedJointsUniversalCreditsQuestionsText) {
        eligibilityCheckerPage.choosejointuniversalclaimbenefitstatus(jointUniversalCredits);
        String actualJointsUniversalCreditsQuestionsText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedJointsUniversalCreditsQuestionsText, actualJointsUniversalCreditsQuestionsText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I select combined universal tax credits is £935 pounds {string} with text in a page {string}")
    public void combinedTaxCredits(String combinedCredits, String expectedCombinedCreditsQuestionText) {
        eligibilityCheckerPage.choosecombineduniversalclaimbenefitstatus(combinedCredits);
        String actualCombinedCreditsQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedCreditsQuestionText, actualCombinedCreditsQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }
    @Then("I should be provided with {string} message as well as free")
    public void message_as_well_as_free(String string, DataTable dataTable) {

        List<List<String>> freeOptions = dataTable.asLists();

        eligibilityCheckerPage.assertFreeOptions(freeOptions);

    }

    @And("I should be provided with {string} more money off  options")
    public void moneyoffoptions(String string, DataTable dataTable) {

        List<List<String>> freeOptions = dataTable.asLists();

        String expectedMoneyOffNewGlassText = freeOptions.get(0).get(0);
        String expectedMoneyOffRepairingGlassText = freeOptions.get(0).get(1);
        String expectedMoneyOffTravelTreatmentText = freeOptions.get(0).get(2);


        eligibilityCheckerPage.assertmoneyoffOptions(expectedMoneyOffNewGlassText, expectedMoneyOffRepairingGlassText, expectedMoneyOffTravelTreatmentText);

    }

    @And("I choose the location the highlands and midlands as in scotland {string} with text in a page {string}")
    public void scotlandlocation(String scotLocation, String expectedScotlandLocationQuestionText) {
        eligibilityCheckerPage.choosescotlandlocation(scotLocation);
        String actualScotlandLocationQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedScotlandLocationQuestionText, actualScotlandLocationQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I select own claim benefits status  as {string} with text in a page {string}")
    public void ownclaimbenefits(String ownClaimOption, String expectedClaimBenefitQuestionText) {
        eligibilityCheckerPage.chooseownclaimbenefits(ownClaimOption);
        String actualClaimBenefitQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedClaimBenefitQuestionText, actualClaimBenefitQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose pregnancy status as {string} with text in a page {string}")
    public void pregnancyoption(String pregnancyStatus, String expectedPregnancyStatusQuestionText) {
        eligibilityCheckerPage.choosepregnancystatus(pregnancyStatus);
        String actualPregnancyStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedPregnancyStatusQuestionText, actualPregnancyStatusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose injury or illness status caused by armedforce as {string} with text in a page {string}")
    public void injurystatus(String injuryorillnessstatus, String expectedInjuryOrIllnessQuestionText) {
        eligibilityCheckerPage.chooseinjuryillnessstatus(injuryorillnessstatus);
        String actualInjuryOrIllnessQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedInjuryOrIllnessQuestionText, actualInjuryOrIllnessQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose permanent living carehome status as {string} with text in a page {string}")
    public void livecarehomeoption(String carehomelivestatus, String expectedCareHomeLiveQuestionText) {
        eligibilityCheckerPage.choosecarehomestatus(carehomelivestatus);
        String actualCareHomeLiveQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCareHomeLiveQuestionText, actualCareHomeLiveQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose the localcouncilpay for carehome with an option as {string} with text in a page {string}")
    public void localpaycarehomeoption(String localcouncilpaystatus, String expectedLocalCouncilPayQuestionText) {
        eligibilityCheckerPage.chooselocalcouncilpaystatus(localcouncilpaystatus);
        String actualLocalCouncilPayQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedLocalCouncilPayQuestionText, actualLocalCouncilPayQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }
    @And("I click next button and got an error message")
    public void errormessage(){
        eligibilityCheckerPage.clicknextbutn();
       driver.findElement(By.xpath("//*[@role='alert']")).getText();

    }

@And("I choose the status of full-time education as {string} with text in a page {string}")
    public void educationstatusoption(String educationStatus, String expectedEducationStatusQuestionText){

    eligibilityCheckerPage.choosefulltimeeducationstatus( educationStatus);
    String actualEducationStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
    Assert.assertEquals(expectedEducationStatusQuestionText,  actualEducationStatusQuestionText);
    eligibilityCheckerPage.clicknextbutn();

}
    @And("I got an message {string}")
    public void ageundersixteen(String expectedcheckageundersixteen){
        String actualcheckageundersixteen = driver.findElement(By.xpath("//p[@class='lede']")).getText();
        Assert.assertEquals(expectedcheckageundersixteen, actualcheckageundersixteen);
    }
    @Then("I got an message for NorthernIreland user {string}")
    public void alertmessagefornorthireland(String expectedstatusforNorthernIreland){
        String  actualstatusforNorthernIreland = driver.findElement(By.xpath("//h1[@id='result-heading']")).getText();
        Assert.assertEquals( expectedstatusforNorthernIreland, actualstatusforNorthernIreland);

    }

    @And("I select combined universal tax credits is £435 pounds {string} with text in a page {string}")
    public void combinedTaxCredits435(String combinedCredits435, String expectedCombinedCredits435QuestionText) {
        eligibilityCheckerPage.choosecombineduniversalclaimbenefit435status(combinedCredits435);
        String actualCombinedCredits435QuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedCredits435QuestionText, actualCombinedCredits435QuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }
    @And("I choose Diabetes status as {string} with text in a page {string}")
    public void checkdiabetesstatus(String diabetesstatus, String expecteddiatesstatusQuestionText) {
        eligibilityCheckerPage.choosedaibetesstatus(diabetesstatus);
        String actualdiatesstatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expecteddiatesstatusQuestionText, actualdiatesstatusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }
    @And("I choose glaucoma status as {string} with text in a page {string}")
    public void checkglaucomastatus(String glaucomastatus, String expectedglaucomastatusQuestionText) {
        eligibilityCheckerPage.chooseglaucomastatus(glaucomastatus);
        String actualglaucomastatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedglaucomastatusQuestionText, actualglaucomastatusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }
    @And("I choose savings morethan £16000 with an option {string} with a text in a page {string}")
    public void savingmorethan16000status(String saving16000status, String expectedsaving16000statusQuestionText) {
        eligibilityCheckerPage.choosesaving16000status(saving16000status);
        String actualsaving16000statusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedsaving16000statusQuestionText, actualsaving16000statusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }


    @And("I select combined saving benefits is more than £2350 pounds {string} with text in a page {string}")
    public void combinedsavingmorethan23250status(String combinedsaving23250status, String expectedCombinedsaving23250statusQuestionText) {
        eligibilityCheckerPage.chooseCombinedsaving23250status(combinedsaving23250status);
        String actualCombinedsaving23250statusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedCombinedsaving23250statusQuestionText, actualCombinedsaving23250statusQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose Diabetes blood sugar level status as {string} with text in a page {string}")
    public void BloodSugarLevelStatus(String bloodsugarlevel, String expectedbloodsugarlevelquestiontext) {
        eligibilityCheckerPage.choosebloodlevelstatus(bloodsugarlevel);
        String actualbloodsugarlevelquestiontext = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedbloodsugarlevelquestiontext, actualbloodsugarlevelquestiontext);
        eligibilityCheckerPage.clicknextbutn();

    }


    @And("I got an message for universal credit decision with {string}")
    public void SelfUniversalCreditsdecisionStatus(String expectedUniversalCredidecisionQuestionText) {


        String actualUniversalCredidecisionQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedUniversalCredidecisionQuestionText, actualUniversalCredidecisionQuestionText);
        eligibilityCheckerPage.clicknextbutn();
    }

    @And("I choose other type of benefits as {string} with {string}")
    public void OtherTypeOfBenefitsoption(String othertypebenefitcheck, String expectedothertypebenefitQuestionText) {
        eligibilityCheckerPage.chooseothertypebenefitstatus(othertypebenefitcheck);
        String actualothertypebenefitQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedothertypebenefitQuestionText, actualothertypebenefitQuestionText);
        eligibilityCheckerPage.clicknextbutn();

    }

    @And("I choose type of pensions as {string} with {string}")
    public void TypeOfPensionsoption(String pensiontypecheck, String expectedpensionbenefitQuestionText) {
        eligibilityCheckerPage.chooseotherpensionbenefitstatus(pensiontypecheck);
        String actualpensionbenefitQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expectedpensionbenefitQuestionText, actualpensionbenefitQuestionText);
        eligibilityCheckerPage.clicknextbutn();

    }

    @And("I select self universal credits status as {string} with text in a page {string}")
    public void iSelectSelfUniversalCreditsStatusoption(String selfuniversalcreditsstatus, String expecteduniversalcreditquestiontext) {
        eligibilityCheckerPage.chooseuniversalcreditdiffrenetbenefitoption(selfuniversalcreditsstatus);
        String actualuniversalcreditquestiontext = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        Assert.assertEquals(expecteduniversalcreditquestiontext, actualuniversalcreditquestiontext);
        eligibilityCheckerPage.clicknextbutn();

    }


    // @And("I select self universal credits status as {string} with text in a page {string}")
    //public void selfuniversalcreditstatusoption(String selfuniversalcreditStatus, String expectedselfuniversalcreditStatusQuestionText){
        //eligibilityCheckerPage.chooseselfuniversalcreditstatus(selfuniversalcreditStatus);


        //String  actualselfuniversalcreditStatusQuestionText = driver.findElement(By.xpath("//h1[@id='question-heading']")).getText();
        //Assert.assertEquals( expectedselfuniversalcreditStatusQuestionText,   actualselfuniversalcreditStatusQuestionText);
        //eligibilityCheckerPage.clicknextbutn();

   // }



    }



