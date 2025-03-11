package andreball;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URISyntaxException;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;

public class WifiSettings extends BaseTest {
    @Test
    public void WifiSettingsName() throws URISyntaxException, MalformedURLException
    {
        // Add your test steps here
        //Xpath, id, class, accessibility id, androidUIAutomator
        driver.findElement (AppiumBy.accessibilityId("Preference")).click();
        //tagName @attribute='value' - xpath -> //tagName[@attribute='value']
        driver.findElement (By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement (By.id("android:id/checkbox")).click();
        driver.findElement (By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement (By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("MyHomeWifi");
        //driver.findElement(By.id("android:id/button1")).click();
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}
