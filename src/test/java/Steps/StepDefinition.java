package Steps;

import Base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinition extends BaseTest {

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("User inputs username")
    public void user_inputs_username(){
        loginPage.inputUsername("tomsmith");

    }

    @And("user inputs password")
    public void user_inputs_password(){
        loginPage.inputPassword("SuperSecretPassword!");
    }

    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("User is logged in")
    public void user_is_logged_in() {
        Assert.assertTrue(profilePage.logOutButton.isDisplayed());
    }




}