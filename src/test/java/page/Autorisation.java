package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autorisation extends PageBase{
    String SITE_URL="http://localhost:8080/admin/login";
    public Autorisation(WebDriver driver) {
        super(driver);
    }

    public Autorisation goTo(){
        driver.get(SITE_URL);
        return this;
    }
    public Autorisation fillInLogin(String login){
        writeText(By.id("admin_login__input--login"), login);
        return this;
    }

    public Autorisation fillInPassword(String password){
        writeText(By.id("admin_login__input--password"), password);
        return this;
    }
    public Autorisation clickAutorisation(){
        click(By.id("admin_login__button--submit"));
        return this;
    }
    public Autorisation checkPageIsCorrect(){
        isElementDisplayed(By.id("admin_login__input--login"));
        return this;
    }
    public Autorisation isLoginCorrect(){
        isElementDisplayed(By.id("logout"));
        return this;
    }
    public Autorisation showAuthorisationRole(){
        click(By.cssSelector("admin_login__nz-select--authorizationRole"));
        return this;
    }
    public Autorisation waitListOfItems(){
        waitVisibility(By.cssSelector("nz-option-item[title='Центральный администратор']"));
        return this;
    }
    public Autorisation chooseAuthorisationRole() {
        click(By.cssSelector("nz-option-item[title='Центральный администратор']"));
        return this;
    }

    public Autorisation wrongData(){
        isAlertText("Данные введены неверно");
        return this;
    }
}
