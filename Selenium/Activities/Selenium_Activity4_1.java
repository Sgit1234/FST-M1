package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity4_1 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String pageTitle= driver.getTitle();
        System.out.println("Title of the first page: " + pageTitle);

        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        String pageTitle2 = driver.getTitle();
        System.out.println("Title of the new page: " + pageTitle2);

        driver.close();
    }

}
