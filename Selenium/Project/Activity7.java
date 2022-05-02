package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity7 {
    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void postjob() {
        driver.findElement(By.linkText("Post a Job")).click();
        WebElement Signin = driver.findElement(By.cssSelector("a.button"));
        if (Signin.isEnabled()) {
            driver.findElement(By.xpath("//*[@id=\"create_account_email\"]")).sendKeys("abc17@xyz.com");
            driver.findElement(By.xpath("//*[@id=\"job_title\"]")).sendKeys("Manager");
            Select jobtype = new Select(driver.findElement(By.xpath("//*[@id=\"job_type\"]")));
            jobtype.selectByVisibleText("Part Time");
            driver.switchTo().frame("job_description_ifr");
            driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("Sample description");
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//*[@id=\"application\"]")).sendKeys("pqr1@stu.com");
        }
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]")).click();
        System.out.println("Job successfully posted");
        driver.findElement(By.xpath("//*[@id=\"post-5\"]/div/a")).click();
        if(driver.findElement(By.cssSelector(".entry-title")).getText().equals("Manager"))
            System.out.println("Job posted appears in search successfully");
        else
            System.out.println("Something went wrong, please repost");
    }

    @AfterTest
    public void closepage() {

        driver.close();
    }
}
