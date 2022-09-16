package com.nttdata.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import com.nttdata.steps.LoginSwagLabsSteps;

public class LoginSwagLabsStepdefs {

    @Steps
    LoginSwagLabsSteps loginSwagLabsSteps;

    @Given("the login screen, fill the user as {string}")
    public void fillTheUserAs(String user) {
        loginSwagLabsSteps.fillUsername(user);
    }

    @And("fill the password as {string}")
    public void fillThePasswordAs(String password) {
        loginSwagLabsSteps.fillPassword(password);
    }

    @When("click the login button")
    public void clickTheLoginButton() {
        loginSwagLabsSteps.clickBtn();
    }

    @Then("validate the successful login, page text must contain {string}")
    public void validateTheSuccessfulLoginPageMustContain(String expectedText) {
        Assert.assertEquals(loginSwagLabsSteps.validateText(), expectedText);
    }
}
