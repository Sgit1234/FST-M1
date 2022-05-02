package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void headertext()
    {
        WebElement heading=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
        if(heading.getText().equals("Welcome to Alchemy Jobs"))
        {
            System.out.println(heading.getText());
            System.out.println("Heading matches exactly");
        }
        else
            System.out.println("Heading does not match exactly");
    }

    @AfterTest

    public void closepage() {

        driver.close();
    }
}
