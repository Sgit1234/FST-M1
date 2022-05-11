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
import java.util.List;

public class Android_Activity6 {
        AndroidDriver<MobileElement> driver;
        WebDriverWait wait;

        @BeforeClass
        public void beforeClass() throws MalformedURLException {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "<Your device name>");
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.android.chrome");
            caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            caps.setCapability("noReset", true);

            URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver<>(appServer, caps);
            wait = new WebDriverWait(driver, 10);

            driver.get("https://www.training-support.net/selenium/lazy-loading");
        }

        @Test
        public void imageScrollTest() {

            MobileElement pageTitle = driver.findElementByClassName("android.view.View");
            wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));

            List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
            System.out.println("Number of image shown currently: " + numberOfImages.size());

            Assert.assertEquals(numberOfImages.size(), 4);

            driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));

            numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
            System.out.println("Number of image shown currently: " + numberOfImages.size());

            Assert.assertEquals(numberOfImages.size(), 4);
        }

        @AfterClass
        public void afterClass() {
            driver.quit();
        }
    }

