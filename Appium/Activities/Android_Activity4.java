package examples;

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

public class Android_Activity4 {

    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceID","5d2fd5c2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity",".activities.PeopleActivity");
        caps.setCapability("noReset", true);


        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void addContact() {

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Add")));
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Add\"]").click();

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("contact_editor_fragment")));
        MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='Name']");
        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");

        firstName.sendKeys("Sunitha Raja");

        phoneNumber.sendKeys("9841282258");

        driver.findElementByAccessibilityId("OK").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("custom_title")));

        MobileElement mobileCard = driver.findElementById("custom_title");
        Assert.assertTrue(mobileCard.isDisplayed());

        String contactName = driver.findElementById("custom_title").getText();
        Assert.assertEquals(contactName, "Sunitha Raja");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
