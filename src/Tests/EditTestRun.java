package Tests;

import Methods.CreateTestRun;
import Methods.LogInPage;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;


/**
 * Created by Rena on 23.02.2017.
 */
public class EditTestRun extends BaseTest {

    @Test
    public void EditTestRun() throws InterruptedException {

        LogInPage logInPage = new LogInPage();
        logInPage.loginPositive(driver);
        Thread.sleep(4000);

        CreateTestRun createTestRun = new CreateTestRun();
        createTestRun.newtestrun(driver);
        Thread.sleep(4000);

        driver.findElement(By.id("test_run_title")).sendKeys("New Test run");
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
        driver.findElement(By.linkText("choose assigned user")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath(".//*/div[1]/div[1]/h3")).isDisplayed();
        Thread.sleep(4000);
        driver.findElement(By.id("test_run_title")).click();
        driver.findElement(By.id("test_run_title")).clear();
        driver.findElement(By.id("test_run_title")).sendKeys("Edit test run");
        Thread.sleep(4000);
        driver.findElement(By.id("test_run_title")).submit();
        Thread.sleep(4000);
        assertEquals("Edit test run", driver.findElement(By.linkText("Edit test run")).getText());

    }
}
