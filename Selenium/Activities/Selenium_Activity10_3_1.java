package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity10_3_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/selenium/drag-drop");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        WebElement balldrop = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        Action act = builder.dragAndDrop(balldrop,dropzone1).build();
        act.perform();
        System.out.println(dropzone1.getCssValue("color"));
        System.out.println("Successfully dropped the ball in Zone1 box");

        Action act2 = builder.dragAndDrop(balldrop,dropzone2).build();
        act2.perform();
        System.out.println(dropzone2.getCssValue("color"));
        System.out.println("Successfully dropped the ball in Zone2 box");

        driver.close();

    }
}
