//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
///**
// * Created by Rena on 08.02.2017.
// */
//public class OpenProject {
//    @Test
//    public void OpenProject() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
//        driver.get(baseUrl + "/users/sign_in");
//        driver.findElement(By.id("user_email")).click();
//        driver.findElement(By.id("user_email")).sendKeys("renata.iyber@thinkmobiles.com");
//        driver.findElement(By.id("user_password")).click();
//        driver.findElement(By.id("user_password")).sendKeys("130613rena");
//        driver.findElement(By.name("commit")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.linkText("My Projects")).click();
//        driver.findElement(By.linkText("Test Run")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.id("SvgjsSvg1000")).click();
//        driver.close();
//    }
//}
