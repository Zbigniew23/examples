package org.epoint;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void epoint()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\serwis\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.e-point.pl/");
        System.out.println(driver.getTitle());
        Locators loc = new Locators(driver);
        System.out.println("Madrid");

        loc.getSearchIcon().click();
        loc.getQuery().sendKeys("test");
        loc.getQuery().sendKeys(Keys.ENTER);

    }
}