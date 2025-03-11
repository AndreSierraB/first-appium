package andreball;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {
    @Test
    public void SwipelDemoTest() throws MalformedURLException, InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        RemoteWebElement firstImage = (RemoteWebElement) driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "true");
        swipeAction(firstImage, "left");
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "false");
    }
}
