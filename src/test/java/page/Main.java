package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends PageBase{
    //String MAIN_URL="http://localhost:8080/admin/login";
    public Main(WebDriver driver) {
        super(driver);
    }

    public Main isMainPage(){
        isElementDisplayed(By.id("admin_main__div--submit-1"));
        return this;
    }
}
