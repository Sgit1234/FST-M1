package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Selenium_Activity8_1 {

    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Number of columns in the table: " + cols.size());
        System.out.println("Number of rows in the table: " + rows.size());
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value in thrid row: " + cellValue.getText());
                }

       /* WebElement thirdrow = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]"));
        System.out.println("Third row values: " + thirdrow.getText());*/

        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
        driver.close();

    }
}
