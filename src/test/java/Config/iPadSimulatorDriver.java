package Config;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class iPadSimulatorDriver {

    IOSDriver driver;

    public String App = "/Users/shuaiwang/Desktop/supperb-iOS-automation/app/Superb POS TEST.app";
    public String IntegrationApp = System.getProperty("user.dir") + "/app/IntegrationApp.app";
    public String AppiumUrl = "http://127.0.0.1:4723/wd/hub";
    public String AppiumAutomationName = "XCUITest";
    public String iPad_Simulator_UDID = "39E1DBBA-D792-4DD7-8ABA-D62BCED1ECB7";
    public String iPad_Simulator_DeviceName = "iPad";
    public String iPad_Simulator_PlatformName = "iOS";
    public String iPad_Simulator_PlatformVersion = "15.4";
    public String AppSTGBundleId = "com.superb.superbpos.test";

    public IOSDriver iPadSimulatorSetup(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", iPad_Simulator_PlatformName);
        caps.setCapability("platformVersion", iPad_Simulator_PlatformVersion);
        caps.setCapability("deviceName", iPad_Simulator_DeviceName);
        caps.setCapability(MobileCapabilityType.UDID,iPad_Simulator_UDID);
        caps.setCapability("automationName",AppiumAutomationName);
        caps.setCapability("app",IntegrationApp);
//        caps.setCapability("app",App);

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
