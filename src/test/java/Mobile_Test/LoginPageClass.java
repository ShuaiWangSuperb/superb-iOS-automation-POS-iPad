package Mobile_Test;

import io.appium.java_client.MobileElement;
import Pages.LoginPage;
import Pages.HomePage;
import Config.UserData;
import org.testng.annotations.BeforeTest;

public class LoginPageClass extends Utils{

    HomePage homePage = new HomePage();
    String homepageLabel_ai = homePage.HomepageLabel_AI;

    LoginPage loginPage = new LoginPage();
    String userNameInput_ai = loginPage.UserNameInput_AI;
    String passWordInput_ai = loginPage.PasswordInput_AI;
    String loginButton_ai = loginPage.LoginButton_AI;
    String demoUserButton_ai = loginPage.DemoUserButton_AI;
    String proceedButton_ai = loginPage.ProceedButton_AI;
    String searchRegistersInput_ai = loginPage.SearchRegistersInput_AI;
    String registerUserButton_ai = loginPage.RegisterUserButton_AI;
    String popupProceedButton_ai = loginPage.PopupProceedButton_AI;
    String shopManagerButton_ai = loginPage.ShopManager_AI;
    String numberPad_one_xpath = loginPage.NumberPad_One_Xpath;
    String numberPad_two_xpath = loginPage.NumberPad_Two_Xpath;
    String numberPad_three_xpath = loginPage.NumberPad_Three_Xpath;
    String numberPad_four_xpath = loginPage.NumberPad_Four_Xpath;
    String numberPad_login_xpath = loginPage.NumberPad_Login_Xpath;
    String numberPad_xpath = loginPage.NumberPad_Xpath;
    String numberPad_xpath1 = loginPage.NumberPad_Xpath1;
    String qaManualTestButton_ai = loginPage.QAManualTestButton_AI;
    String qaRegisterUserButton_ai = loginPage.QARegisterUserButton_AI;
    String qaShopOwnerButton_ai = loginPage.QAShopOwner_AI;

    UserData userData = new UserData();
    String userName = userData.UserName;
    String passWord = userData.Password;
    String registerName = userData.RegisterName;
    String qaTestUserName = userData.QATestUserName;
    String qaTestPassword = userData.QATestPassword;


    Utils utils = new Utils();

    @BeforeTest
    public void setup() {
        utils.iPadDriverSetup();
//        utils.iPadBrowserstackSetup();
    }


//    @AfterTest
//    public void teardown() {
//        utils.QuitDriver();
//    }

    public void acceptAlert() throws Exception {
        utils.acceptAlert();
    }

    public void clearUsername() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.clear();
            System.out.println("clear Username Input");
        } catch (Exception exp) {
            System.out.println("\nclear Username Input ERROR " + exp.getCause());
            System.out.println("\nclear Username Input ERROR " + exp.getMessage());
        }
    }

    public void clearPassword() {
        try {
            MobileElement passWordInput;
            passWordInput = utils.getElementByAccessibilityId(passWordInput_ai);
            passWordInput.clear();
            System.out.println("clear Password Input");
        } catch (Exception exp) {
            System.out.println("\nclear Password Input ERROR " + exp.getCause());
            System.out.println("\nclear Password Input ERROR " + exp.getMessage());
        }
    }

    public void insertDemoUsername() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.sendKeys(userName);
            System.out.println("insert username Input with " + userName);
        } catch (Exception exp) {
            System.out.println("\ninsert username Input ERROR " + exp.getCause());
            System.out.println("\ninsert username Input ERROR " + exp.getMessage());
        }
    }

    public void insertDemoUserPassword() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(passWordInput_ai);
            userNameInput.sendKeys(passWord);
            System.out.println("insert password Input with " + passWord);
        } catch (Exception exp) {
            System.out.println("\ninsert password Input ERROR " + exp.getCause());
            System.out.println("\ninsert password Input ERROR " + exp.getMessage());
        }
    }

    public void clickLoginButton() {
        try {
            MobileElement loginButton;
            loginButton = utils.getElementByAccessibilityId(loginButton_ai);
            loginButton.click();
            System.out.println("click login button");
        } catch (Exception exp) {
            System.out.println("\nclick login button ERROR " + exp.getCause());
            System.out.println("\nclick login button ERROR " + exp.getMessage());
        }
    }

    public void clickDemoUserButton() {
        try {
            utils.scriptWait(3);
            utils.wait(10);
            MobileElement demoUserButton;
            demoUserButton = utils.getElementByAccessibilityId(demoUserButton_ai);
            demoUserButton.click();
            System.out.println("click demo user button");
        } catch (Exception exp) {
            System.out.println("\nclick demo user button ERROR " + exp.getCause());
            System.out.println("\nclick demo user button ERROR " + exp.getMessage());
        }
    }

    public void clickProceedButton() {
        utils.scriptWait(3);
        try {
            MobileElement proceedButton;
            proceedButton = utils.getElementByAccessibilityId(proceedButton_ai);
            proceedButton.click();
            System.out.println("click proceed button");
        } catch (Exception exp) {
            System.out.println("\nclick proceed button ERROR " + exp.getCause());
            System.out.println("\nclick proceed button ERROR " + exp.getMessage());
        }
    }

    public void setSearchRegisterUser() {
        try {
            utils.scriptWait(3);
            utils.wait(10);
            MobileElement searchRegistersInput;
            searchRegistersInput = utils.getElementByAccessibilityId(searchRegistersInput_ai);
            searchRegistersInput.sendKeys(registerName);
            System.out.println("set Search Register User input");
        } catch (Exception exp) {
            System.out.println("\nset Search Register User input ERROR " + exp.getCause());
            System.out.println("\nset Search Register User input ERROR " + exp.getMessage());
        }
    }

    public void clickRegisterUser() {
        try {
            utils.scriptWait(5);
            MobileElement registerUserButton;
            registerUserButton = utils.getElementByAccessibilityId(registerUserButton_ai);
            registerUserButton.click();
            System.out.println("click Register User button");
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void  clickPopupProceedButton(){
        try {
            utils.scriptWait(3);
            MobileElement popupProceedButton;
            popupProceedButton = utils.getElementByAccessibilityId(popupProceedButton_ai);
            popupProceedButton.click();
            System.out.println("click popup Proceed Button");
        } catch (Exception exp) {
            System.out.println("\nclick popup Proceed Button ERROR " + exp.getCause());
            System.out.println("\nclick popup Proceed Button ERROR " + exp.getMessage());
        }
    }

    public void clickShopManagerButton() {
        try {
            utils.wait(10);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(shopManagerButton_ai);
            shopManagerButton.click();
            System.out.println("click shop manager button");
        } catch (Exception exp) {
            System.out.println("\nclick shop manager button ERROR " + exp.getCause());
            System.out.println("\nclick shop manager button ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPad(int number){
        try {
            MobileElement numberSelect;
            numberSelect = utils.getElementByXpath(numberPad_xpath + number + numberPad_xpath1);
            numberSelect.click();
            System.out.println("set Shop Manager Pin " + number);
        } catch (Exception exp) {
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getCause());
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPadLogin(){
        try {
            MobileElement numberPadLoginButton;
            numberPadLoginButton = utils.getElementByXpath(numberPad_login_xpath);
            numberPadLoginButton.click();
            System.out.println("click number pad login");
        } catch (Exception exp) {
            System.out.println("\nclick number pad login ERROR " + exp.getCause());
            System.out.println("\nclick number pad login ERROR " + exp.getMessage());
        }
    }

    public void setShopManagerPin(){
        try {
            MobileElement numberOne;
            numberOne = utils.getElementByXpath(numberPad_one_xpath);
            numberOne.click();
            MobileElement numberTwo;
            numberTwo = utils.getElementByXpath(numberPad_two_xpath);
            numberTwo.click();
            MobileElement numberThree;
            numberThree = utils.getElementByXpath(numberPad_three_xpath);
            numberThree.click();
            MobileElement numberFour;
            numberFour = utils.getElementByXpath(numberPad_four_xpath);
            numberFour.click();
            System.out.println("set Shop Manager Pin");
        } catch (Exception exp) {
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getCause());
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getMessage());
        }
    }

    public void LoginValidation() throws Exception {
        utils.wait(10);
           try {
               MobileElement homePageLocation;
               homePageLocation = utils.getElementByAccessibilityId(homepageLabel_ai);
               Boolean homePage = homePageLocation.isDisplayed();
               if (homePage == true) {
                   System.out.println("Login homepage validation success");
               } else {
                   System.out.println("Login homepage validation fail");
               }
           } catch (Exception exp) {
               System.out.println("\nLogin homepage validation fail ERROR " + exp.getCause());
               System.out.println("\nLogin homepage validation fail ERROR " + exp.getMessage());
           }

    }

    public void hideKeyboard(){
        utils.hideKeyboard();
    }

    public void insertQATestName() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.sendKeys(qaTestUserName);
            System.out.println("insert username Input with " + qaTestUserName);
        } catch (Exception exp) {
            System.out.println("\ninsert username Input ERROR " + exp.getCause());
            System.out.println("\ninsert username Input ERROR " + exp.getMessage());
        }
    }

    public void insertQATestPassword() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(passWordInput_ai);
            userNameInput.sendKeys(qaTestPassword);
            System.out.println("insert password Input with " + qaTestPassword);
        } catch (Exception exp) {
            System.out.println("\ninsert password Input ERROR " + exp.getCause());
            System.out.println("\ninsert password Input ERROR " + exp.getMessage());
        }
    }

    public void clickQAManualTestButton() {
        try {
            utils.scriptWait(3);
            utils.wait(10);
            MobileElement demoUserButton;
            demoUserButton = utils.getElementByAccessibilityId(qaManualTestButton_ai);
            demoUserButton.click();
            System.out.println("click QA Manual Test button");
        } catch (Exception exp) {
            System.out.println("\nclick demo user button ERROR " + exp.getCause());
            System.out.println("\nclick demo user button ERROR " + exp.getMessage());
        }
    }

    public void clickQARegisterUser() {
        try {
            utils.scriptWait(5);
            utils.wait(10);
            MobileElement registerUserButton;
            registerUserButton = utils.getElementByAccessibilityId(qaRegisterUserButton_ai);
            registerUserButton.click();
            System.out.println("click Register User Register2 button");
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void clickQAShopOwnerButton() {
        try {
            utils.scriptWait(5);
            utils.wait(10);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(qaShopOwnerButton_ai);
            shopManagerButton.click();
            System.out.println("click QA shop owner button");
        } catch (Exception exp) {
            System.out.println("\nclick QA shop owner button ERROR " + exp.getCause());
            System.out.println("\nclick QA shop owner button ERROR " + exp.getMessage());
        }
    }

    public void loginQAUser() {
        try {
            clearUsername();
            clearPassword();
            insertQATestName();
            insertQATestPassword();
            clickLoginButton();
            clickQAManualTestButton();
            clickProceedButton();
            clickQARegisterUser();
            clickProceedButton();
            clickPopupProceedButton();
            clickQAShopOwnerButton();
            clickNumberPad(1);
            clickNumberPad(2);
            clickNumberPad(3);
            clickNumberPad(4);
            clickNumberPadLogin();
            LoginValidation();
        } catch (Exception exp) {
            System.out.println("\nLogin QA user ERROR " + exp.getCause());
            System.out.println("\nLogin QA user ERROR " + exp.getMessage());
        }
    }

    public void loginDemoUser() {
        try {
            clearUsername();
            clearPassword();
            insertDemoUsername();
            insertDemoUserPassword();
            clickLoginButton();
            clickDemoUserButton();
            clickProceedButton();
            setSearchRegisterUser();
            hideKeyboard();
            clickRegisterUser();
            clickProceedButton();
            clickPopupProceedButton();
            clickShopManagerButton();
            setShopManagerPin();
            clickNumberPad(1);
            clickNumberPad(2);
            clickNumberPad(3);
            clickNumberPad(4);
            clickNumberPadLogin();
            LoginValidation();
        } catch (Exception exp) {
            System.out.println("\nLogin QA user ERROR " + exp.getCause());
            System.out.println("\nLogin QA user ERROR " + exp.getMessage());
        }
    }
}
