package Methods;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

/**
 * Created by Rena on 09.02.2017.
 */
public class LogInPage {
    private WebElement userName;
    private WebElement password;
    public WebElement loginButton;

    public void loginPositive(WebDriver driver) throws InterruptedException {
        String login = "renata.iyber@thinkmobiles.com";
        String pass = "130613rena";
        login(driver, login, pass);
        Thread.sleep(5000);
    }

    public void loginPositiveTest(WebDriver driver) throws InterruptedException {
        loginPositive(driver);
        Thread.sleep(4000);
        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
    }

    public void login(WebDriver driver, String _login, String _password) throws InterruptedException {
        String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
        driver.get(baseUrl + "/users/sign_in");
        userName = driver.findElement(By.xpath(".//*[@id='user_email']"));
        password = driver.findElement(By.id("user_password"));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = driver.findElement(By.xpath(".//*[@id='new_user']/input[2]"));
        loginButton.click();
    }

    public void loginNegative(WebDriver driver) throws InterruptedException {
        String login = "renata.iyber@thinkmobiles.com";
        String pass = "qwerty";
        login(driver, login, pass);
        Thread.sleep(4000);
        assertTrue(loginButton.isDisplayed(), "user was navigated to some unknown page");
    }

    public void loginEmpty(WebDriver driver) throws InterruptedException {
        String login = "";
        String pass = "";
        login(driver, login, pass);
        Thread.sleep(5000);
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("Can`t be blank"),
                "Invalid Email or password. - was not found on the page");
    }
}