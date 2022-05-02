package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);

        driver.findElement(By.id("firstName")).sendKeys("Sunitha");
        driver.findElement(By.id("lastName")).sendKeys("Raja");
        driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("number")).sendKeys("9823452311");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.green")).submit();

        driver.close();
}
}

