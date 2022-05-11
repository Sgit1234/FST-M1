package examples;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstExampleTest {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "5d2fd5c2");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UIAutomator2");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity",".cal.CalculatorActivity");
        caps.setCapability("noReset",true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL,caps);
    }

    @Test

    public void additionTest()
    {
       driver.findElementById("btn_3_s").click();
       driver.findElementByAccessibilityId("plus").click();
       driver.findElementById("btn_5_s").click();
       driver.findElementByAccessibilityId("equals").click();
       String result = driver.findElementById("result").getText();
       System.out.println("Result is:" + result);
       Assert.assertEquals(result,"= 8");
    }
    @AfterClass

    public void tearDown()
    {
        driver.quit();
    }

}
