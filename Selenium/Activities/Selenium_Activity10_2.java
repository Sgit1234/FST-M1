package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Activity10_2 {

    public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            Actions builder = new Actions(driver);

            driver.get("https://www.training-support.net/selenium/input-events");
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);
            WebElement keypress = driver.findElement(By.id("keyPressed"));
            Action Firstaction = builder.sendKeys("S").build();
            Firstaction.perform();
            System.out.println("Pressed key value: " + keypress.getText());
            Action Secaction = builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
            Secaction.perform();
            System.out.println("Pressed key value: " + keypress.getText());
            driver.close();

        }
    }

