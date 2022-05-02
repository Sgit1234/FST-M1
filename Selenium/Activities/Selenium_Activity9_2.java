package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_Activity9_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement selectedopts = driver.findElement(By.id("multi-value"));
        WebElement ms= driver.findElement(By.id("multi-select"));
        Select msselect = new Select(ms);

        if(msselect.isMultiple()) {
            msselect.selectByVisibleText("Javascript");
            System.out.println("Select by visible text: " + selectedopts.getText());
            msselect.selectByValue("node");
            System.out.println("Select by value: " + selectedopts.getText());
            msselect.selectByIndex(4);
            System.out.println("Select by index: " + selectedopts.getText());
            msselect.selectByIndex(5);
            System.out.println("Select by index: " + selectedopts.getText());
            msselect.selectByIndex(6);
            System.out.println("Select by index: " + selectedopts.getText());
            msselect.deselectByValue("node");
            System.out.println("After deselecting node: " + selectedopts.getText());
            msselect.deselectByIndex(7);
            System.out.println("After deselecting 7th option by index: " + selectedopts.getText());
            System.out.println("First selected option: " + msselect.getFirstSelectedOption().getText());
            List<WebElement> ls=msselect.getAllSelectedOptions();
            for(WebElement option: ls) {
                System.out.println("Selected options: " + option.getText());
            }
            msselect.deselectAll();
            System.out.println(selectedopts.getText());
            System.out.println("All options deselected now");

        }
            driver.close();

        }

    }

