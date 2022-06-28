package Config;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class iPadBrowserstackDriver {

    IOSDriver driver;

    public String userName = "shuaifromsuperb_2RXf9J";
    public String accessKey = "zXZQ33nCe2CpCFvpnsaq";
    public String AppiumUrl = "http://hub-cloud.browserstack.com/wd/hub";
    public String iPadOsVersion = "15";
    public String deviceName = "iPad 9th";
    public String app = "bs://3b931a0f32e3f026c5ecaec5fa5439e2cbf63230";
    public String projectName = "POS";
    public String buildName = "Build 2.45.6 (5)";
    public String browserstackAppiumVersion = "1.22.0";

    public IOSDriver iPadBrowserstackSetup(){
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserstack.user", userName);
        caps.setCapability("browserstack.key", accessKey);
        caps.setCapability("os_version", iPadOsVersion);
        caps.setCapability("device", deviceName);
        caps.setCapability("app", app);
        caps.setCapability("project", projectName);
        caps.setCapability("build", buildName);
        caps.setCapability("browserstack.appium_version", browserstackAppiumVersion);

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
