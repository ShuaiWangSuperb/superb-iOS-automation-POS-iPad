package Mobile_Test;

import Config.iPadDriver;
import Config.iPadSimulatorDriver;
import Config.iPadBrowserstackDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils {

    IOSDriver driver;

    iPadDriver iPadDriver = new iPadDriver();

    iPadSimulatorDriver iPadSimulatorDriver = new iPadSimulatorDriver();

    iPadBrowserstackDriver iPadBrowserstackDriver = new iPadBrowserstackDriver();

    public String[] arrItems;

    public IOSDriver iPadDriverSetup(){
            driver = iPadDriver.iPadDriverSetup();
            System.out.println("Set iPad Device Driver");
            return driver;
    }

    public IOSDriver iPadSimulatorSetup(){
        driver = iPadSimulatorDriver.iPadSimulatorSetup();
        System.out.println("Set iPad Simulator Driver");
        return driver;
    }

    public IOSDriver iPadBrowserstackSetup(){
        driver = iPadBrowserstackDriver.iPadBrowserstackSetup();
        System.out.println("Set iPad Browserstack Driver");
        return driver;
    }

    public void QuitDriver() {
        driver.quit();
        System.out.println("Quit Driver");
    }

    public MobileElement getElementByAccessibilityId(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByAccessibilityId(id);
            if (element.isDisplayed())
                return element;
            else
                System.out.println("MobileElement is not found");
        } catch (Exception exp) {
            System.out.println("getElementByAccessibilityId ERROR is " + exp.getCause());
            System.out.println("getElementByAccessibilityId ERROR is " + exp.getMessage());
//            Assert.fail();
        }
        return null;
    }

    public MobileElement getElementByXpath(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByXPath(id);
            if (element.isDisplayed())
                return element;
            else
                System.out.println("MobileElement is not found");
        } catch (Exception exp) {
            System.out.println("getElementByXpath ERROR is " + exp.getCause());
            System.out.println("getElementByXpath ERROR is " + exp.getMessage());
//            Assert.fail();
        }
        return null;
    }

    public List<MobileElement> getElementsByXpath(String id) throws Exception {
        try {
            List<MobileElement> elements;
            elements = (List<MobileElement>) driver.findElementsByXPath(id);
            return elements;
        } catch (Exception exp) {
            System.out.println("getElementsByXpath ERROR is " + exp.getCause());
            System.out.println("getElementsByXpath ERROR is " + exp.getMessage());
        }
        return null;
    }

    public MobileElement getElementByIosClassChain(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByIosClassChain(id);
            return element;
        } catch (Exception exp) {
            System.out.println("getElementByIosClassChain ERROR is " + exp.getCause());
            System.out.println("getElementByIosClassChain ERROR is " + exp.getMessage());
        }
        return null;
    }

    public void acceptAlert() throws Exception{
        int i=1;
        do{
            try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                String alertText = driver.switchTo().alert().getText();
                if (alertText != null) {
                    driver.switchTo().alert().accept();
                    System.out.println("Accept alert " + alertText);
                }
            } catch (Exception exp) {
                System.out.println("No alert shown Alert is " + exp.getCause());
            }
            i++;
        }while(i<=3);
    }

    public String[] getProductsList(String XPATH, String Products) {
        try {
            List<MobileElement> productList;
            productList = (List) getElementsByXpath(XPATH);
            if (productList.isEmpty()){
                System.out.println("the product list is empty");
                return null;
            }else{
                this.arrItems = new String[productList.size()];
                System.out.println("There are " + productList.size() + " " + Products);
                int itemIndex = 0;
                for (MobileElement product : productList) {
                    String productName = product.getText();
//                    System.out.println("There is " + productName);
                    this.arrItems[itemIndex] = productName;
                    itemIndex++;
                }
                System.out.println(Products + " there are " + Arrays.toString(arrItems));
                return this.arrItems;
            }
        } catch (Exception e) {
            System.out.println("\n" + Products +" list ERROR " + e.getCause());
            System.out.println("\n" + Products +" list ERROR " + e.getMessage());
        }
        return null;
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void scriptWait(int seconds){
        driver.manage().timeouts().setScriptTimeout(seconds,TimeUnit.SECONDS);
    }

    public void log(String str){
        System.out.println(str);
    }
    public void testSuiteStartLog(){
        System.out.println("*****************Test Suite Start*****************\n");
    }

    public void testSuiteEndLog(){
        System.out.println("\n*****************Test Suite End*****************\n");
    }

    public void testStartLog(String str){
        System.out.println("**************Test " + str + " Start**************\n");
    }

    public void testEndLog(String str){
        System.out.println("\n**************Test " + str + " End**************\n");
    }

}
