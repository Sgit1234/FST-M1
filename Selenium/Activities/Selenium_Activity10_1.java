package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity10_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Actions builder = new Actions(driver);
        WebElement cube = driver.findElement(By.id("D3Cube"));
        builder.click(cube);
        String cubevalue = driver.findElement(By.className("active")).getText();
        System.out.println("Value in the front after a click: " + cubevalue);
        builder.doubleClick(cube).perform();
        String cubevalue2 = driver.findElement(By.className("active")).getText();
        System.out.println("Value in the front after a double-click: " + cubevalue2);
        builder.contextClick(cube).perform();
        String cubevalue3 = driver.findElement(By.className("active")).getText();
        System.out.println("Value in the front after a right click: " + cubevalue3);
        driver.close();

    }
}