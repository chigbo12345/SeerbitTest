package Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCaseCreatePaymentLink {


    @Test
    public void createPayLink() {

        WebDriver driver;

        //     setting up driver properties
        System.setProperty("webdriver.chrome.driver", "/Users/chigbo/Downloads/chromedriver-mac-x64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://www.seerbit.com/");
        driver.get("https://www.dashboard.seerbit.com/#/auth/login");

        // Test case for creating a payment link
        WebElement pageName = driver.findElement(By.name("paymentLinkName"));
        WebElement description = driver.findElement(By.name("description"));
        WebElement amountInput = driver.findElement(By.name("amount"));
        WebElement createLinkButton = driver.findElement(By.id("createLinkButton"));  // Replace with the actual ID of the create link button

        // Fill in the form fields
        Assert.assertTrue(pageName.isDisplayed());
        Assert.assertTrue(description.isDisplayed());
        Assert.assertTrue(amountInput.isDisplayed());
        pageName.sendKeys("Sample Product");
        description.sendKeys("For input of ecommerce");
        amountInput.sendKeys("100.00");


    }
}