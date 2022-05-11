/*package examples;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_Activity5 {

    AndroidDriver<WebElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceID","5d2fd5c2");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity",".ui.MmsTabActivity");
        caps.setCapability("noReset",true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void SMS(){
        driver.findElementById("fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_recipient")));
        driver.findElementById("add_recipient").click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByClassName("miuix.androidbasewidget.widget.ClearableEditText")));
        driver.findElementByClassName("miuix.androidbasewidget.widget.ClearableEditText").sendKeys("Sunitha Raja");
        driver.findElementByXPath("//android.widget.TextView[1][@text='Sunitha Raja']").click();
     //  ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
                driver.findElementByXPath("//android.widget.TextView[@text='OK']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Text message']").sendKeys("Hello from Appium");
        driver.findElementById("send_button").click();
        driver.findElementByAccessibilityId("tv_sub_info").click();
        driver.findElementById("send_button").click();

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}*/
package examples;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_Activity5 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity", ".ui.MmsTabActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void smsTest() {

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("fab")));

        driver.findElement(MobileBy.id("fab")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("recipients_editor")));
        driver.findElementById("recipients_editor").sendKeys("Sunitha");
        driver.findElementByXPath("//android.widget.TextView[@text='Sunitha Raja']").click();

        driver.findElementByXPath("//android.widget.EditText[@text='Text message']").sendKeys("Hello from Appium");
        driver.findElementById("send_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[@text='Airtel']")));
        driver.findElementByXPath("//android.widget.TextView[@text='Airtel']").click();
        driver.findElementById("send_button").click();
        String messageLocator = driver.findElementByXPath("//android.widget.TextView[@text='Hello from Appium']").getText();
        Assert.assertEquals(messageLocator, "Hello from Appium");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
