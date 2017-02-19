//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
///**
// * Created by Rena on 08.02.2017.
// */
//public class CreateNewTestRun {
//    @Test
//    public void CreateNewTestRun() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
//        driver.get(baseUrl + "/users/sign_in");
//        driver.findElement(By.id("user_email")).click();
//        driver.findElement(By.id("user_email")).sendKeys("renata.iyber@thinkmobiles.com");
//        driver.findElement(By.id("user_password")).click();
//        driver.findElement(By.id("user_password")).sendKeys("130613rena");
//        driver.findElement(By.name("commit")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.linkText("My Projects")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.linkText("Test Run")).click();
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//ul[@id='left-menu']/li[4]/a")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.linkText("Test run")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//div[@id='test_run_list']/div/a")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//div[@id='mCSB_4_container']/div/div/input")).click();
//        driver.findElement(By.id("test_run_title")).sendKeys("New Test run");
//        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
//       driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
//        driver.findElement(By.linkText("choose assigned user")).click();
//        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
//        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
//        Thread.sleep(4000);
//        driver.findElement(By.id("SvgjsSvg1000")).click();
//        driver.close();
//    }
//}
