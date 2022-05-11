package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class chromeBrowser_activity {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceID","5d2fd5c2");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
        caps.setCapability("noReset",true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

        wait=new WebDriverWait(driver,20);
    }

    @Test
    public void addnote(){
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.EditText")));

        driver.findElementByClassName("android.widget.EditText").sendKeys("Add tasks to list");

        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='Add Task'])")));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("findElementByXPath(\"//android.widget.Button[@text='Add Task']\")")));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.Button")));
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").click();
        driver.findElementByXPath("//android.widget.TextView[1]").click();
        Assert.assertNotEquals(driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").getText(),"");
        Assert.assertNotEquals(driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").getText(),"");
        Assert.assertNotEquals(driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").getText(),"");

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
