package Assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCaseTxn {

public void transaction(){

    WebDriver driver;

    //     setting up driver properties
    System.setProperty("webdriver.chrome.driver", "/Users/chigbo/Downloads/chromedriver-mac-x64/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);

    driver.get("https://pay.seerbitapi.com/77288253");

    // Test case for creating a payment link
    WebElement firstName = driver.findElement(By.id("firstName"));
    WebElement lastName = driver.findElement(By.id("lastName"));
    WebElement email = driver.findElement(By.name("email"));
    WebElement createLinkButton = driver.findElement(By.id("createLinkButton"));

    // Fill in the form fields
    Assert.assertTrue(firstName.isDisplayed());
    Assert.assertTrue(lastName.isDisplayed());
    Assert.assertTrue(email.isDisplayed());
    firstName.sendKeys("Chigbo");
    lastName.sendKeys("Mbadugha");
    email.sendKeys("mbadugha_chigbo@yahoo.com");

}

}
