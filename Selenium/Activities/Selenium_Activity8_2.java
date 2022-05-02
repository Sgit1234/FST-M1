package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Selenium_Activity8_2 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of columns in the Sortable table: " + cols.size());
        System.out.println("Number of rows in the Sortable table: " + rows.size());
        WebElement srsc = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column value before sorting: " + srsc.getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
        WebElement srscafter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column value after sorting: " + srscafter.getText());
        List<WebElement> footeritems = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        for(WebElement items : footeritems) {
            System.out.println("Value in the footer row: " + items.getText());
        }

        driver.close();
    }
}
