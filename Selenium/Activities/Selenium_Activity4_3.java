package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity4_3 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        String thirdheader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("Third header: " + thirdheader);
        String fifthcolour = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("Color of the fifth header: " + fifthcolour);
        String violetbtn = driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("Attributes of violet button: " + violetbtn);
        String greyBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The Grey button text: " + greyBtn);
        driver.close();
}
}