package examples;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_Activity1 {

    AndroidDriver<WebElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceID","5d2fd5c2");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity",".cal.CalculatorActivity");
        caps.setCapability("noReset",true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);
    }

    @Test
    public void multiply(){
        driver.findElementById("btn_5_s").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("btn_8_s").click();
        driver.findElement(MobileBy.id("result"));

        String product = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println("Product is: " + product);
        Assert.assertEquals(product, "= 40");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
