//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.Assert;
//
//import java.io.IOException;
//import static org.testng.Assert.assertTrue;
//
//public class LogInOut {
//    private WebElement userName;
//    private WebElement password;
//    private WebElement loginButton;
//    private WebDriver driver;
//
//
//    @BeforeMethod()
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    public void loginPositive() throws InterruptedException {
//        String login = "renata.iyber@thinkmobiles.com";
//        String pass = "130613rena";
//        login(login, pass);
//        Thread.sleep(5000);
//    }
//
//    public void login(WebDriver, String _login, String _password) throws InterruptedException {
//        String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
//        driver.get(baseUrl + "/users/sign_in");
//        userName = driver.findElement(By.xpath(".//*[@id='user_email']"));
//        password = driver.findElement(By.id("user_password"));
//        userName.sendKeys(_login);
//        password.sendKeys(_password);
//        loginButton = driver.findElement(By.xpath(".//*[@id='new_user']/input[2]"));
//        loginButton.click();
//    }
//
//    @Test
//    public void loginPositiveTest() throws InterruptedException {
//        loginPositive();
//        Thread.sleep(4000);
//        assertTrue(driver.findElement(By.className("username")).isDisplayed(), "user wasn't logged in");
//    }
//
//    @Test
//    public void loginNegative() throws InterruptedException {
//        String login = "renata.iyber@thinkmobiles.com";
//        String pass = "qwerty";
//        login(login, pass);
//        Thread.sleep(4000);
//        assertTrue(loginButton.isDisplayed(),"user was navigated to some unknown page");
//    }
//
//    @Test
//    public void loginEmpty() throws InterruptedException {
//        String login = "";
//        String pass = "";
//        login(login, pass);
//        Thread.sleep(5000);
//        WebElement errorMessage = driver.findElement(By.className("message"));
//        assertTrue(errorMessage.getText().contains("Invalid Email or password."),
//                "Invalid Email or password. - was not found on the page");
//    }
//
//    @Test
//    public void logoutTest() throws InterruptedException {
//        loginPositive();
//        Thread.sleep(6000);
//        driver.findElement(By.cssSelector(".log_out .svg")).click();
//        Thread.sleep(4000);
//        assertTrue(driver.findElement(By.cssSelector(".sign-title")).isDisplayed(), "sign in fields weren't displayed");
//    }
//}