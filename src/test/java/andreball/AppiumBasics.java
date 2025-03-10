package andreball;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.URISyntaxException;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {
    @Test
    public void WifiSettingsName() throws URISyntaxException, MalformedURLException
    {
        // Add your test steps here
        //Xpath, id, class, accessibility id, androidUIAutomator
        driver.findElement (AppiumBy.accessibilityId("Preference")).click();
        //tagName @attribute='value' - xpath
        driver.findElement (By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();;
    }
}
