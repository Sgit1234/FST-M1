package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Selenium_Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        String Parenttab = driver.getWindowHandle();
        System.out.println("Parent Window " + Parenttab);

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allhandles = driver.getWindowHandles();
        System.out.println("All windows " + allhandles);

       for (String tabs: allhandles)
        {
            driver.switchTo().window(tabs);
        }

        System.out.println("Current window: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));

        String tab2 = driver.getTitle();
        System.out.println("Title of new tab: " + tab2);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/div")));
        String headingtext= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div")).getText();
        System.out.println("Heading on the new tab: " + headingtext);

        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        allhandles = driver.getWindowHandles();
        System.out.println("All windows " + allhandles);

        for (String tabs: allhandles)
        {
            driver.switchTo().window(tabs);
        }
        System.out.println("Current window: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        System.out.println("New Tab Title is: " + driver.getTitle());

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.content")));
        headingtext= driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("Heading on the new window: " + headingtext);
        driver.quit();

    }
}
