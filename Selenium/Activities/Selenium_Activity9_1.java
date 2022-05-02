package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement selectedvalue = driver.findElement(By.id("single-value"));
        WebElement dropdown = driver.findElement(By.id("single-select"));

        Select list = new Select(dropdown);
        list.selectByVisibleText("Option 2");
        System.out.println("Select by Visible text: " + selectedvalue.getText());

        list.selectByIndex(3);
        System.out.println("Select by Index: " + selectedvalue.getText());
        list.selectByValue("4");
        System.out.println("Select by Value: " + selectedvalue.getText());
        List<WebElement> alloptions =  list.getOptions();
        for(WebElement option: alloptions){
            System.out.println("Dropdown values: " + option.getText());
        }
        driver.close();
    }
}
