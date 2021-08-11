package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver,15);
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void isElementDisplayed(By elementBy){
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

    public void isAlertText(String message) {
        assertEquals(message, driver.switchTo().alert().getText());
    }

}
