package andreball;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
    @Test
    public void ScrollDemoTest() throws MalformedURLException, InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        scrollToEndAction();
    }
}
