package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity12_3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions act=new Actions(driver);
        driver.get("https://www.training-support.net/selenium/popups");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        WebElement signinbtn = driver.findElement(By.cssSelector(".inverted"));
        act.moveToElement(signinbtn).build().perform();
        String tooltiptext = signinbtn.getAttribute("data-tooltip");
        System.out.println("Tool tip text of the button: " + tooltiptext);
        signinbtn.click();

        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
        WebElement msg = driver.findElement(By.id("action-confirmation"));
        System.out.println(msg.getText());
        driver.close();

    }
}
