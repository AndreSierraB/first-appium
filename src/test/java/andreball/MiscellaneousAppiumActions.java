package andreball;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.net.MalformedURLException;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumActions extends BaseTest {
    @Test
    public void miscellaneous() throws MalformedURLException, InterruptedException
    {
        //App Package & App Activity
        // Before / is the package
        // After / is the activity
        //mCurrentFocus=Window{e32e753 u0 io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies}
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
            "intent", "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"
        ));
        driver.findElement (By.id("android:id/checkbox")).click();
        //Rotate the device
        DeviceRotation landScape = new DeviceRotation(0, 0, 90);
        driver.rotate(landScape);
        driver.findElement (By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement (By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        //Clipboard actions
        driver.setClipboardText("MyHomeWifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        //Press Key
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        //Hide Keyboard
        driver.hideKeyboard();
        driver.findElement(By.id("android:id/button1")).click();
        //Press Key
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }
}
