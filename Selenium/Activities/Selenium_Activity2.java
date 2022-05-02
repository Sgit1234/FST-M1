package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);

        WebElement aboutId = driver.findElement(By.id("about-link"));
        System.out.println("Using ID: " + aboutId.getText());
        WebElement aboutClassname = driver.findElement(By.className("green"));
        System.out.println("Using ClassName: " + aboutClassname.getText());
        WebElement aboutCSS = driver.findElement(By.cssSelector("#about-link"));
        System.out.println("Using CSS: " + aboutCSS.getText());
        WebElement aboutLinktext = driver.findElement(By.linkText("About Us"));
        System.out.println("Using Linktext: " + aboutLinktext.getText());

        driver.close();
    }
}
