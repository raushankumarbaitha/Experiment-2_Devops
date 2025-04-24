package org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://raushankumarbaitha.github.io/Experiment-2_Devops/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Webpage Design";
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match!");
        Assert.assertTrue(actualTitle.contains("Design"), "Title should contain 'Design'");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

