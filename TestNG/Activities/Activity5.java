package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup()
    {
        driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

    }
    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void trgtprtc()
    {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        Assert.assertEquals(pageTitle, "Target Practice");
    }
    @Test (dependsOnMethods = {"trgtprtc"}, groups = {"HeaderTests"})
    public void headertest1()
    {
        String thirdhrdtxt = driver.findElement(By.id("third-header")).getText();
        System.out.println("Third header: "+ thirdhrdtxt);
        Assert.assertEquals(thirdhrdtxt,"Third header");
    }

    @Test (dependsOnMethods = {"trgtprtc"}, groups = {"HeaderTests" })
    public void headertest2()
    {
            String fifthhrdcolor = driver.findElement(By.cssSelector("h5.ui")).getCssValue("Color");
            System.out.println("Fifth header color: " + fifthhrdcolor);
            Assert.assertEquals(fifthhrdcolor,"rgb(33, 186, 69)");
    }

    @Test (dependsOnMethods = {"trgtprtc"}, groups = {"ButtonTests"})
    public void buttontest1()
    {
        String olvbtn = driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
        System.out.println("Button text: " + olvbtn);
        Assert.assertEquals(olvbtn,"Olive");
    }
    @Test (dependsOnMethods = {"trgtprtc"}, groups = {"ButtonTests"})
    public void buttontest2()
        {
            String btncolor = driver.findElement(By.xpath("//button[@class='ui brown button']")).getCssValue("Color");
            System.out.println("Button Color: " + btncolor);
            Assert.assertEquals(btncolor,"rgb(255, 255, 255)");
        }

    @AfterClass(alwaysRun = true)
    public void tearDown()
    {
        driver.close();
    }
}
