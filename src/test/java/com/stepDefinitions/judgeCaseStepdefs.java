package com.stepDefinitions;

import com.actions.Actions;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class judgeCaseStepdefs {

    Actions actions;
    public WebDriver driver;
    Logger logger = LoggerFactory.getLogger(judgeCaseStepdefs.class);


    @FindBy(id="pa_5c9126fe434ba_p15564daa856-textButton")
    public WebElement judge_case;

    @FindBy(xpath="//span[@id='pa_5c9126fe47260_p15515116385-itemInner-1']")
    public WebElement select_guilty;

    @FindBy(xpath="//span[.='VOTE']")
    public WebElement vote;

    public judgeCaseStepdefs() {
        this.driver = Hooks.driver;
        actions = new Actions(driver);
    }

    @Before
    public void init() {
        PageFactory.initElements(driver, this);
    }



    @Then("I should see the {string}")
    public void iShouldSeeThe(String arg0) {
    }

    @And("he select judges")
    public void heSelectJudges() {
        actions.clickButton(judge_case);

    }

    @When("he vote {string}")
    public void heVote(String arg0) {
        actions.clickButton(select_guilty);
    }

    @Then("his verdict should be saved")
    public void hisVerdictShouldBeSaved() {
        actions.clickButton(vote);
    }
}
