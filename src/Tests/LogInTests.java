package Tests;

import Methods.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


/**
 * Created by Rena on 09.02.2017.
 */
public class LogInTests extends BaseTest {

    @Test
    public void loginPositiveTest() throws InterruptedException {
        driver.get(baseUrl + "/users/sign_in");
        LogInPage logInPage= new LogInPage();
        logInPage.loginPositiveTest(driver);
        Thread.sleep(4000);
        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
    }

    @Test
    public void loginNegative() throws InterruptedException {
        driver.get(baseUrl + "/users/sign_in");
        LogInPage logInPage= new LogInPage();
        logInPage.loginNegative(driver);
        Thread.sleep(4000);
        assertTrue(logInPage.loginButton.isDisplayed(),"user was navigated to some unknown page");
    }

    @Test
    public void loginEmpty() throws InterruptedException {
        driver.get(baseUrl + "/users/sign_in");
        LogInPage logInPage= new LogInPage();
        logInPage.loginEmpty(driver);
        Thread.sleep(4000);
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("Can`t be blank"),
                       "Invalid Email or password. - was not found on the page");
    }
}