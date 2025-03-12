package andreball;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest
{

    @Test
    public void fillForm() throws InterruptedException
    {
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Colombia\"))"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Colombia']")).click();
        //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Maria Diaz");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getText();
        Assert.assertEquals(toastMessage, "Please enter your name");        
    }

}
