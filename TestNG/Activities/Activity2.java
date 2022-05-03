package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

        @Test
        public void titlecheck() {

            System.out.println("Title of the page: " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Target Practice" );
            }

            @Test
            public void blackbtnchk()
            {
            WebElement blackbtn = driver.findElement(By.xpath("//button[@class='ui black button']"));
            Assert.assertEquals(blackbtn.getText(),"BLACK");
            }

            @Test(enabled = false)
            public void skippedtc()
                 {
            WebElement heading=driver.findElement(By.xpath("//div[@class='sub header']"));
            System.out.println("Heading: " + heading.getText());
                }

        @Test
        public void skipexceptionmethod(){
            throw new SkipException("Skipping the test case");
        }

    @AfterClass
        public void tearDown()
        {
            driver.close();
        }
    }

