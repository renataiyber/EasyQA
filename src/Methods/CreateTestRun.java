package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

/**
 * Created by Rena on 14.02.2017.
 */
public class CreateTestRun {

    public void newtestrun(WebDriver driver) throws InterruptedException {
        String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";
        driver.get(baseUrl + "/users/sign_in");
        driver.findElement(By.linkText("My Projects")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Test Run")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//ul[@id='left-menu']/li[4]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Test run")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='test_run_list']/div/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*/div[1]/div[1]/h3")).isDisplayed();
    }
}
