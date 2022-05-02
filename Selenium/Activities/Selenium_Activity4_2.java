package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Selenium_Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitleform = driver.getTitle();
        System.out.println("Title of the page: "+ pageTitleform);

        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstname.sendKeys("Sunitha");
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastname.sendKeys("Raja");
        WebElement emailfield = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailfield.sendKeys("abc@xyz.com");

        WebElement contactnumber = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        contactnumber.sendKeys("8757833228");
        WebElement messagefield = driver.findElement(By.xpath("//textarea"));
        messagefield.sendKeys("Sample message");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
        System.out.println("Details submitted successfully");
        driver.close();

    }
}
