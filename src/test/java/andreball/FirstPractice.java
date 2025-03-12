package andreball;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class FirstPractice extends BaseTest {

    @Test(priority = 1)
    public void locateFunctionality()
    {
        driver.findElement (AppiumBy.accessibilityId("App")).click();
        driver.findElement (AppiumBy.accessibilityId("Alert Dialogs")).click();
    }

    @Test(priority = 2)
    public void okDialogShortMessage()
    {
        driver.findElement (AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
        String alertTitle = driver.findElement (By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
        driver.findElement (By.id("android:id/button1")).click();
    }

    @Test(priority = 3)
    public void cancelDialogShortMessage()
    {
        driver.findElement (AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
        String alertTitle = driver.findElement (By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
        driver.findElement (By.id("android:id/button2")).click();
    }

    @Test(priority = 4)
    public void scrollLargeMessage()
    {
        driver.findElement (AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
        scrollToEndAction();
        driver.findElement (By.id("android:id/button3")).click();
    }

    @Test(priority = 5)
    public void secondListDialog()
    {
        locateFunctionality();
        driver.findElement (AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement (By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command two\"]")).click();
        String messageString = driver.findElement (By.id("android:id/message")).getText(); 
        Assert.assertEquals(messageString, "You selected: 1 , Command two");
        
        //Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(By.id("android:id/message"))).click().perform();
    }
}
