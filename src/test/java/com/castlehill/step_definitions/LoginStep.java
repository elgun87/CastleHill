package com.castlehill.step_definitions;

import com.castlehill.pages.DashBoard;
import com.castlehill.utilitiy.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStep extends DashBoard {

    //Positive Scenario
    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {
        Driver.getDriver().get(url);
    }

    @When("I fill the account information for account StandardUser into the {string} field and the {string}")
    public void i_fill_the_account_information_for_account_standard_user_into_the_field_and_the(String userName, String password) {
        loginPage.typeUserName(userName);
        loginPage.typePassWord(password);
    }

    @When("I click the Login Button")
    public void i_click_the_login_button() {
        loginPage.clickButton();
    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {
        //Verify the title after redirect to main page
        String expected = "Swag Labs";
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actual);
    }

    @Then("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='peek']"));
        String height = element.getCssValue("height");
        String width = element.getCssValue("width");
        Assert.assertEquals(height,"91px");
        Assert.assertEquals(width,"90px");
    }

    //Negative Scenario

    @When("I fill the account information for account LockedOutUser into the {string} field and the {string}")
    public void i_fill_the_account_information_for_account_into_the_username_field_and_the(String userName, String password) {
        loginPage.typeUserName(userName);
        loginPage.typePassWord(password);
    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_error_message_contains_the_text(String string) {
        String expected = "Sorry, this user has been banned.";
        String actual = Driver.getDriver().findElement(By.tagName("h3")).getText();
        Assert.assertEquals(expected,actual);
    }
}
