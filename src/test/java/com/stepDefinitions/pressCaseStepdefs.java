package com.stepDefinitions;

import com.actions.Actions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class pressCaseStepdefs {

    Actions actions;
    public WebDriver driver;
    Logger logger = LoggerFactory.getLogger(judgeCaseStepdefs.class);

    public pressCaseStepdefs() {
        this.driver = Hooks.driver;
        actions = new Actions(driver);
    }


    @FindBy(xpath="//*[@id=\"pa_5c9126fe3f4fb_p179d7b273e1-card__image-1\"]")
    public WebElement make_a_case;

    @FindBy(xpath="//*[@id=\"pa_5c9126fe434ba_p1550efedbe9-text\"]/p/em")
    public WebElement watched_a_case;


    @Before
    public void init() {
        PageFactory.initElements(driver, this);
    }
    @When("he proceed to the Make a case against Kevin")
    public void heProceedToTheMakeACaseAgainstKevin() {
        actions.clickButton(make_a_case);
    }

    @Then("he should see a description containing {string}")
    public void heShouldSeeADescriptionContaining(String arg0) {
        Assert.assertTrue(watched_a_case.getText().contains(arg0));
    }
}
