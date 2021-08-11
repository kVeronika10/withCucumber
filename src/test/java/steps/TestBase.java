package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.Autorisation;
import page.Main;

import java.util.concurrent.TimeUnit;

public class TestBase {
    String SITE_URL="http://localhost:8080/admin/login";
    WebDriver driver; //инициализация переменной
    public Autorisation autorisation;
    public Main main;

    public void start(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(); //создали объект
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        autorisation= PageFactory.initElements(driver,Autorisation.class);
    }

    public void finish(){
        driver.quit();
    }
}
