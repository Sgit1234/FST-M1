package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void loginpage() {
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        if (driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/h1")).getText().equals("Dashboard"))
            System.out.println("Successfully logged in");
        else
            System.out.println("Login failed");
    }

    @AfterTest
    public void closepage() {

        driver.close();
    }
    }