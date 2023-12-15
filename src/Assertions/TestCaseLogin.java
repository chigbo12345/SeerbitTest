package Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCaseLogin {

@Test
    public void login(){

    WebDriver driver;

    //     setting up driver properties
    System.setProperty("webdriver.chrome.driver","/Users/chigbo/Downloads/chromedriver-mac-x64/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);

    driver.get("https://www.seerbit.com/");
    driver.get("https://www.dashboard.seerbit.com/#/auth/login");

    WebElement username= driver.findElement(By.name("email"));
    WebElement password= driver.findElement(By.id("password"));

    Assert.assertTrue(username.isDisplayed());
    username.sendKeys("mbadugha_chigbo@yahoo.com");

    Assert.assertTrue(password.isDisplayed());
    username.sendKeys("P@ssw0rd");

    //driver.findElement(By.name("")).click();
    driver.close();
}



}
