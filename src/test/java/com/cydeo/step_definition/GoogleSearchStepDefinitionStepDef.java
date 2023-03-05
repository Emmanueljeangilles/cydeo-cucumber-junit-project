package com.cydeo.step_definition;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefinitionStepDef {
    //creating the object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on the Google search page")
    public void userIsOnTheGoogleSearchPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user searches for apple")
    public void userSearchesForApple() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }
}






