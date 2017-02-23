package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Rena on 23.02.2017.
 */
public class TestRunChanges {

    public void changesintestrun (WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("test_run_title")).sendKeys("New Test run");
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.xpath("//div[@id='testRunSelect']/ul/li[2]/a/label")).click();
        driver.findElement(By.linkText("choose assigned user")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).click();
        driver.findElement(By.xpath("//div[@id='assignedTestRun']/ul/li[2]/a/label")).submit();
    }
}
