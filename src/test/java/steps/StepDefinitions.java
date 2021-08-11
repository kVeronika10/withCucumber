package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDefinitions extends TestBase {

    @Before
    public void initialisation() {
        start();
    }
    @After
    public void teardown() {
        finish();
    }
    @Given("I go to main page")
    public void iGoToMainPage() {
        autorisation.goTo();
    }

    @When("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String login, String password) {
//        autorisation.fillInLogin(login)
//                    .fillInPassword(password)
//                    .showAuthorisationRole()
//                    .waitListOfItems()
//                    .chooseAuthorisationRole()
//                    .clickAutorisation();
        autorisation.click(By.id("admin_login__nz-select--authorizationRole"));
        autorisation.waitVisibility(By.cssSelector("nz-option-item[title='Центральный администратор']"));
        autorisation.click(By.cssSelector("nz-option-item[title='Центральный администратор']"));
        autorisation.click(By.id("admin_login__button--submit"));
    }

    @Then("I have been successfully logged")
    public void iHaveBeenSuccessfullyLogged() {
        //main.isMainPage();
    }

    @Then("I have not been successfully logged")
    public void iHaveNotBeenSuccessfullyLogged() {
        //autorisation.wrongData();
    }
}
