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

public class Android_Activity3 {
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
    public void sum()
    {
        driver.findElementById("btn_5_s").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("btn_9_s").click();
        driver.findElement(MobileBy.id("result"));

        String sumvalue = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println("Sum of 5 and 9 " + sumvalue);
        Assert.assertEquals(sumvalue, "= 14");
    }
    @Test
    public void diff()
    {
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementByAccessibilityId("minus").click();
        driver.findElementById("btn_5_s").click();
        driver.findElement(MobileBy.id("result"));

        String diffvalue = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println("Difference of 10 and 5 " + diffvalue);
        Assert.assertEquals(diffvalue, "= 5");
    }

    @Test
    public void multiply(){
        driver.findElementById("btn_5_s").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElement(MobileBy.id("result"));

        String product = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println("Product of 5 and 100 " + product);
        Assert.assertEquals(product, "= 500");
    }
    @Test
    public void division(){
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementByAccessibilityId("divide").click();
        driver.findElementById("btn_2_s").click();
        driver.findElement(MobileBy.id("result"));

        String quotient = driver.findElementById("com.miui.calculator:id/result").getText();
        System.out.println("Quotient of 50/2 " + quotient);
        Assert.assertEquals(quotient, "= 25");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
