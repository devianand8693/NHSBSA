Feature:As a user
  I validate the EligibilityChecker Details

@checkerft
  Scenario: Verify england user who get universal tax credits with partner which is less than or equal to £935 per month

  Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
  When I click the startnow button
  And I Choose the country "England" with text in a page "Which country do you live in?"
  And I choose gp practice is in scotland or wales "Yes" with text in a page "Is your GP practice in Scotland or Wales?"
  And I select country for dental practice "England" with text in a page "Which country is your dental practice in?"
  And I enter dob as date "20" month "12" year "1967" with text in a page "What is your date of birth?"
  And I choose living with partner as "Yes" with text in a page "Do you live with a partner?"
  And I select partner claim benefits status  as "Yes" with text in a page "Do you or your partner claim any benefits or tax credits?"
  And I select universal credits status as  "Yes, we receive Universal Credit payments" with text in a page "Do you or your partner get paid Universal Credit?"
  And I select joint universal credits status as "Yes" with text in a page "As part of your joint Universal Credit, do you have any of these?"
  And I select combined universal tax credits is £935 pounds "Yes" with text in a page "Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?"
  Then I should be provided with "You get help with NHS costs" message as well as free
  |NHS prescriptions|NHS dental check-ups and treatment|sight tests|NHS wigs and fabric supports|
  And I should be provided with "You get help with NHS costs" more money off  options
  |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|travel for NHS treatment|

  @checkerft1
  Scenario: Verify scotland user who get their own claim benefits with the help of carehome through the localcouncil

    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Scotland" with text in a page "Which country do you live in?"
    And I choose the location the highlands and midlands as in scotland "Yes" with text in a page "Do you live in the Highlands and Islands?"
    And I select country for dental practice "Scotland" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "04" month "11" year "1989" with text in a page "What is your date of birth?"
    And I choose living with partner as "No" with text in a page "Do you live with a partner?"
    And I select own claim benefits status  as "No" with text in a page "Do you claim any benefits or tax credits?"
    And I choose pregnancy status as "No" with text in a page "Are you pregnant or have you given birth in the last 12 months?"
    And I choose injury or illness status caused by armedforce as "No" with text in a page "Do you have an injury or illness caused by serving in the armed forces?"
    And I choose permanent living carehome status as "Yes" with text in a page "Do you live permanently in a care home?"
    And I choose the localcouncilpay for carehome with an option as "Yes" with text in a page "Do you get help to pay for your care home from your local council?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS dental check-ups and treatment|NHS eye examinations|NHS wigs and fabric supports|
    And I should be provided with "You get help with NHS costs" more money off  options
      |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|travel for NHS treatment|
  @checkerft2
  Scenario: Verify Wales user who are under the age of 19 getting NHS Health Benefits costs.
    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Wales" with text in a page "Which country do you live in?"
    And I choose gp practice is in scotland or wales "Yes" with text in a page "Is your GP practice in Scotland or Wales?"
    And I select country for dental practice "England" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "14" month "02" year "2005" with text in a page "What is your date of birth?"
    And I click next button and got an error message
    And I choose the status of full-time education as "Yes" with text in a page "Are you in full-time education?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS dental check-ups and treatment|sight tests|NHS wigs and fabric supports|
    And I should be provided with "You get help with NHS costs" more money off  options
      |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|
  @checkerft3
  Scenario: Verify Wales user who are under the age of 16 getting NHS Health Benefits costs.
    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Wales" with text in a page "Which country do you live in?"
    And I choose gp practice is in scotland or wales "No" with text in a page "Is your GP practice in Scotland or Wales?"
    And I select country for dental practice "Northern Ireland" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "19" month "05" year "2019" with text in a page "What is your date of birth?"
    And I got an message "Because you're under 16:"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS dental check-ups and treatment|sight tests|NHS wigs and fabric supports|
    And I should be provided with "You get help with NHS costs" more money off  options
      |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|

  @checkerft4
  Scenario: Verify Northern Ireland user who are not getting NHS Health Benefits costs.
    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Northern Ireland" with text in a page "Which country do you live in?"
    Then I got an message for NorthernIreland user "You cannot use this service because you live in Northern Ireland"
  @checkerft5
  Scenario: Verify scotland user who get their own claim benefits with the help of income based Job Seeker's allowance

    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Scotland" with text in a page "Which country do you live in?"
    And I choose the location the highlands and midlands as in scotland "No" with text in a page "Do you live in the Highlands and Islands?"
    And I select country for dental practice "I am not registered with a dental practice" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "22" month "07" year "1956" with text in a page "What is your date of birth?"
    And I choose living with partner as "No" with text in a page "Do you live with a partner?"
    And I select own claim benefits status  as "Yes" with text in a page "Do you claim any benefits or tax credits?"


  @checkerft6
  Scenario: Verify england user who get universal tax credits with partner which is less than or equal to £435 per month
    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "England" with text in a page "Which country do you live in?"
    And I choose gp practice is in scotland or wales "No" with text in a page "Is your GP practice in Scotland or Wales?"
    And I select country for dental practice "I am not registered with a dental practice" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "16" month "03" year "2000" with text in a page "What is your date of birth?"
    And I choose living with partner as "Yes" with text in a page "Do you live with a partner?"
    And I select partner claim benefits status  as "Yes" with text in a page "Do you or your partner claim any benefits or tax credits?"
    And I select universal credits status as  "Yes, we receive Universal Credit payments" with text in a page "Do you or your partner get paid Universal Credit?"
    And I select joint universal credits status as "No" with text in a page "As part of your joint Universal Credit, do you have any of these?"
    And I select combined universal tax credits is £435 pounds "Yes" with text in a page "Did you and your partner have a combined take-home pay of £435 or less in your last Universal Credit period?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS dental check-ups and treatment|sight tests|NHS wigs and fabric supports|
    And I should be provided with "You get help with NHS costs" more money off  options
      |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|travel for NHS treatment|

  @checkerft7
  Scenario: Verify Wales user who are in diabetes, glaucoma status stay in carehome, getting NHS health benefits by local council.
    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Wales" with text in a page "Which country do you live in?"
    And I choose gp practice is in scotland or wales "No" with text in a page "Is your GP practice in Scotland or Wales?"
    And I select country for dental practice "I am not registered with a dental practice" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "05" month "07" year "1965" with text in a page "What is your date of birth?"
    And I choose living with partner as "No" with text in a page "Do you live with a partner?"
    And I select own claim benefits status  as "No" with text in a page "Do you claim any benefits or tax credits?"
    And I choose pregnancy status as "No" with text in a page "Are you pregnant or have you given birth in the last 12 months?"
    And I choose injury or illness status caused by armedforce as "No" with text in a page "Do you have an injury or illness caused by serving in the armed forces?"
    And I choose Diabetes status as "Yes" with text in a page "Do you have diabetes?"
    And I choose glaucoma status as "Yes" with text in a page "Do you or a family member have glaucoma?"
    And I choose permanent living carehome status as "Yes" with text in a page "Do you live permanently in a care home?"
    And I choose the localcouncilpay for carehome with an option as "Yes" with text in a page "Do you get help to pay for your care home from your local council?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS dental check-ups and treatment|sight tests|NHS wigs and fabric supports|
    And I should be provided with "You get help with NHS costs" more money off  options
      |new glasses or contact lenses|repairing or replacing your glasses or contact lenses|travel for NHS treatment|
  @checkerft8
  Scenario: Verify scotland user who getting their NHS health cost by having their savings morethan  £16000

    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Scotland" with text in a page "Which country do you live in?"
    And I choose the location the highlands and midlands as in scotland "Yes" with text in a page "Do you live in the Highlands and Islands?"
    And I select country for dental practice "Northern Ireland" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "25" month "08" year "1976" with text in a page "What is your date of birth?"
    And I choose living with partner as "No" with text in a page "Do you live with a partner?"
    And I select own claim benefits status  as "No" with text in a page "Do you claim any benefits or tax credits?"
    And I choose pregnancy status as "No" with text in a page "Are you pregnant or have you given birth in the last 12 months?"
    And I choose injury or illness status caused by armedforce as "No" with text in a page "Do you have an injury or illness caused by serving in the armed forces?"
    And I choose permanent living carehome status as "No" with text in a page "Do you live permanently in a care home?"
    And I choose savings morethan £16000 with an option "Yes" with a text in a page "Do you have more than £16,000 in savings, investments or property?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|NHS eye examinations|
    And I should be provided with "You get help with NHS costs" more money off  options
      |travel for NHS treatment|
  @checkerft9
  Scenario: Verify england user who are getting NHS health cost from their savings more than £23250

    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "England" with text in a page "Which country do you live in?"
    And I choose gp practice is in scotland or wales "No" with text in a page "Is your GP practice in Scotland or Wales?"
    And I select country for dental practice "England" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "08" month "10" year "1960" with text in a page "What is your date of birth?"
    And I choose living with partner as "Yes" with text in a page "Do you live with a partner?"
    And I select partner claim benefits status  as "No" with text in a page "Do you or your partner claim any benefits or tax credits?"
    And I choose pregnancy status as "No" with text in a page "Are you pregnant or have you given birth in the last 12 months?"
    And I choose injury or illness status caused by armedforce as "No" with text in a page "Do you have an injury or illness caused by serving in the armed forces?"
    And I choose Diabetes status as "Yes" with text in a page "Do you have diabetes?"
    And I choose Diabetes blood sugar level status as "Yes" with text in a page "Do you need to take medication to keep your blood sugar levels stable?"
    And I choose permanent living carehome status as "Yes" with text in a page "Do you live permanently in a care home?"
    And I choose the localcouncilpay for carehome with an option as "No" with text in a page "Do you get help to pay for your care home from your local council?"
    And I select combined saving benefits is more than £2350 pounds "Yes" with text in a page "Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?"
    Then I should be provided with "You get help with NHS costs" message as well as free
      |NHS prescriptions|sight tests|
  @checkerft10
  Scenario: Verify scotland user who getting their NHS health cost by their pension guarantee credits only.

    Given I am on homepage "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start" with title "Check what help you could get to pay for NHS costs - NHSBSA"
    When I click the startnow button
    And I Choose the country "Scotland" with text in a page "Which country do you live in?"
    And I choose the location the highlands and midlands as in scotland "Yes" with text in a page "Do you live in the Highlands and Islands?"
    And I select country for dental practice "Scotland" with text in a page "Which country is your dental practice in?"
    And I enter dob as date "25" month "08" year "1976" with text in a page "What is your date of birth?"
    And I choose living with partner as "No" with text in a page "Do you live with a partner?"
    And I select own claim benefits status  as "Yes" with text in a page "Do you claim any benefits or tax credits?"
    And I select self universal credits status as "No, I get a different benefit" with text in a page "Do you get paid Universal Credit?"









































