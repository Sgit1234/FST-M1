package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {

    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
    }

    @Test
    public void publish() {
        driver.findElement(By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys("Architect");
        driver.findElement(By.xpath("//*[@id=\"_company_website\"]")).sendKeys("www.ibm.com");
        driver.findElement(By.xpath("//*[@id=\"_company_name\"]")).sendKeys("IBM");
        driver.findElement(By.xpath("//*[@id=\"_company_tagline\"]")).sendKeys("Sample tagline");
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='entry-title' and contains(text(),'Architect')]")));
        if (driver.findElement(By.xpath("//h1[@class='entry-title' and contains(text(),'Architect')]")).getText().equals("Architect"))
            System.out.println("Job successfully listed");
        else
            System.out.println("Job not listed, please repost");

    }

    @AfterTest
    public void closepage() {

        driver.close();
    }
}
