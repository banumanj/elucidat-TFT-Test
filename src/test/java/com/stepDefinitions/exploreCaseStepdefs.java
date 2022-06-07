package com.stepDefinitions;

import com.actions.Actions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class exploreCaseStepdefs {

    Actions actions;
    public WebDriver driver;
    Logger logger = LoggerFactory.getLogger(exploreCaseStepdefs.class);


    @FindBy(xpath = "//*[@id=\"pa_5c9126fe3b767_p1550728cdbc-projectTitle\"]/strong")
    public WebElement title;


    @FindBy(id="pa_5c9126fe3b767_p15577f075e9-textButton")
    public WebElement startBtn;


    public exploreCaseStepdefs() {
        this.driver = Hooks.driver;
        actions = new Actions(driver);
    }

    @Before
    public void init() {
        PageFactory.initElements(driver, this);
    }


    @Given("user navigate to {string} course")
    public void userNavigateToCourse(String expectedTitle) {
        actions.openExploreCasePage();
    }

    @Then("he clicks start")
    public void heClicksStart() {
        actions.clickButton(startBtn);
    }
}
