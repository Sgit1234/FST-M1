package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class googleKeep_activity {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceID","5d2fd5c2");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity",".activities.BrowseActivity");
        caps.setCapability("noReset",true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);

        wait=new WebDriverWait(driver,20);
    }

    @Test
    public void addnote(){
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("Note1");
        driver.findElementById("edit_note_text").sendKeys("Sample note added");
        driver.findElementByAccessibilityId("Open navigation drawer");
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("browse_note_interior_content")));
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("index_note_title")));
        String note = driver.findElementById("index_note_title").getText();
        Assert.assertEquals(note,"Note1");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
