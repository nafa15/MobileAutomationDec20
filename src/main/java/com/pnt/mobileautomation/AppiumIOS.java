package com.pnt.mobileautomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumIOS {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//
        //


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        cap.setCapability(MobileCapabilityType.UDID, "R58MC41NVYE");

        //cap.setCapability(MobileCapabilityType.APP_PACKAGE, "");
        //cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "");
        cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/main/resources/TD.apk");

        AppiumDriver appiumDriver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), cap);

        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(10000);

        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='View Accounts']")).click();

        Thread.sleep(10000);
        appiumDriver.quit();
    }

}
