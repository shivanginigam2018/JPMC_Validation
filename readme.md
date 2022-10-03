#This project is to validate JP Morgan logo present on JP Morgan website.

##Prerequisites:
- IDE - IntelliJ or Eclipse
- Java installed on system - JDK 8 or above 
- Chrome browser/Firefox browser

##Setup:
- Checkout from Git repository
- Execute mvn clean install

##Steps:
- Execute the project by navigating to JPMC_Validation/src/test/java/runner/Testrunner.java
  * Default tag : @functionalTest executes all scenarios
  * execution can be done by proving specific scenario tags
- Feature file is located at src/test/resources/features/LogoValidation.feature, and it contains 7 scenarios
- StepDefs are located at src/test/java/stepDefinitions/HomepageSteps.java
- The project runs on chrome and firefox, depending on the browser property value
- HTML and JSON reports are generated at *target* folder
- In case of failed scenarios, screenshots are generated at *target/FailedScreenshots* folder with DateTime Stamp
- This project is built on JDK 18, any java version above 8 will suffice.

