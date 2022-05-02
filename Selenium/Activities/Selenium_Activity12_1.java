package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity12_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/iframes");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        driver.switchTo().frame(0);
        WebElement frameheader1 = driver.findElement(By.xpath("//div[@class='sub header']"));
        System.out.println("Header of the first frame: " + frameheader1.getText());

        WebElement framebutton1 = driver.findElement(By.xpath("//*[@id=\"actionButton\"]"));
        System.out.println("Frame1 - Color of the button: " + framebutton1.getCssValue("color"));
        System.out.println("Frame1 - Text of the button: " + framebutton1.getText());
        wait.until(ExpectedConditions.elementToBeClickable(framebutton1));
        framebutton1.click();
        System.out.println("Frame1 - Color of the button after pressing: " + framebutton1.getCssValue("color"));
        System.out.println("Frame1 - Text of the button after pressing: " + framebutton1.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement frameheader2 = driver.findElement(By.xpath("//div[@class='sub header']"));
        System.out.println("Header of the second frame: " + frameheader2.getText());

        WebElement framebutton2 = driver.findElement(By.cssSelector("button"));

        System.out.println("Frame2 - Color of the button: " + framebutton2.getCssValue("color"));
        System.out.println("Frame2 - Text of the button: " + framebutton2.getText());
        wait.until(ExpectedConditions.elementToBeClickable(framebutton2));

        framebutton2.click();
        System.out.println("Frame2 - Color of the button after pressing: " + framebutton2.getCssValue("color"));
        System.out.println("Frame2 - Text of the button after pressing: " + framebutton2.getText());

        driver.switchTo().defaultContent();
        driver.close();

    }
}
