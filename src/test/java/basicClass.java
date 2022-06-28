
import io.appium.java_client.ios.IOSDriver;
import Config.iPadDriver;
import Config.iPadSimulatorDriver;
import org.testng.annotations.Test;
import Mobile_Test.Utils;


public class basicClass {

    iPadDriver iPadDriver = new iPadDriver();
    iPadSimulatorDriver iPadSimulatorDriver = new iPadSimulatorDriver();
    Utils utils = new Utils();

    @Test
    public void firstTest()  {

        IOSDriver driver;

        driver = utils.iPadDriverSetup();

//        driver = utils.iPadSimulatorSetup();

//        driver = utils.iPadBrowserstackSetup();
//        utils.acceptAlert();
//        driver.quit();
        utils.wait(5);
        driver.findElementByAccessibilityId("1").click();


    }

}
