package Config;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class iPadDriver {

    IOSDriver driver;

    public String AppSTGBundleId = "com.superb.superbpos.test";
    public String AppiumUrl = "http://127.0.0.1:4723/wd/hub";
    public String AppiumAutomationName = "XCUITest";
    public String iPad_UDID = "00008030-0001752C1A60C02E";
    public String iPad_DeviceName = "SuperbiPad";
    public String iPad_PlatformName = "iOS";
    public String iPad_PlatformVersion = "15.2";

    public IOSDriver iPadDriverSetup(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", iPad_PlatformName);
        caps.setCapability("platformVersion", iPad_PlatformVersion);
        caps.setCapability("deviceName", iPad_DeviceName);
        caps.setCapability(MobileCapabilityType.UDID,iPad_UDID);
        caps.setCapability("automationName",AppiumAutomationName);
        caps.setCapability("bundleId",AppSTGBundleId);

        URL url = null;
        try {
            url = new URL(AppiumUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new IOSDriver(url, caps);
        return driver;
    }

}
