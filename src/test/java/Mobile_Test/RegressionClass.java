package Mobile_Test;

import Pages.*;
import io.appium.java_client.MobileElement;
import Config.UserData;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class RegressionClass extends Utils{

    HomePage homePage = new HomePage();
    String toolbarSettings_ai = homePage.ToolbarSettings_AI;

    SettingPage settingPage = new SettingPage();
    String settingsMenu_ai = settingPage.SettingsMenu_AI;
    String logoutMenu_ai = settingPage.LogoutMenu_AI;
    String logoutMasterUser_ai = settingPage.LogoutMasterUser_AI;
    String logoutMasterUserPopup_xpath = settingPage.LogoutMasterUserPopup_XPATH;

    LoginPage loginPage = new LoginPage();
    String userNameInput_ai = loginPage.UserNameInput_AI;
    String passWordInput_ai = loginPage.PasswordInput_AI;
    String loginButton_ai = loginPage.LoginButton_AI;
    String demoUserButton_ai = loginPage.DemoUserButton_AI;
    String qaManualTestButton_ai = loginPage.QAManualTestButton_AI;
    String proceedButton_ai = loginPage.ProceedButton_AI;
    String searchRegistersInput_ai = loginPage.SearchRegistersInput_AI;
    String registerUserButton_ai = loginPage.RegisterUserButton_AI;
//    String qaRegisterUserButton_ai = loginPage.QARegisterUserButton_AI;
    String popupProceedButton_ai = loginPage.PopupProceedButton_AI;
    String shopManagerButton_ai = loginPage.ShopManager_AI;
    String qaShopOwnerButton_ai = loginPage.QAShopOwner_AI;
    String numberPad_one_xpath = loginPage.NumberPad_One_Xpath;
    String numberPad_two_xpath = loginPage.NumberPad_Two_Xpath;
    String numberPad_three_xpath = loginPage.NumberPad_Three_Xpath;
    String numberPad_four_xpath = loginPage.NumberPad_Four_Xpath;
    String numberPad_login_xpath = loginPage.NumberPad_Login_Xpath;
    String numberPad_xpath = loginPage.NumberPad_Xpath;
    String numberPad_xpath1 = loginPage.NumberPad_Xpath1;
    String loginPageLabel_ai = loginPage.LoginPageLabel_AI;

    UserData userData = new UserData();
    String userName = userData.UserName;
    String qaTestUserName = userData.QATestUserName;
    String passWord = userData.Password;
    String qaTestPassword = userData.QATestPassword;
    String registerName = userData.RegisterName;

    TablePage tablePage = new TablePage();

    OrderPage orderPage = new OrderPage();

    String[] CategoriesCollectionGridViewList;
    String[] CategoriesCollectionListViewList;
    String[] MenuListGridViewList;
    String[] MenuListListViewList;
    String[] TableBillList;
    String[] FoodListPopup;
    String FooterViewText;
    String[] SubMenuListListViewList;
    String[] PlusButtonPopup;
    String[] MinusButtonPopup;
    String BillCustomListText;
    String DiscountText;

    Utils utils = new Utils();

    @BeforeTest
    public void setup() {
        utils.iPadDriverSetup();
//        utils.iPadBrowserstackSetup();
        utils.testSuiteStartLog();
    }

    @AfterTest
    @Step("quit driver")
    public void teardown() {
        utils.QuitDriver();
        utils.testSuiteEndLog();
    }

    @Step("accept if there is alert")
    public void acceptAlert() throws Exception {
            utils.acceptAlert();
    }

    @Step("clear username input")
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

    @Step("clear password input")
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

    @Step("insert demo user username")
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

    @Step("insert QA user username")
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

    @Step("insert demo user password")
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

    @Step("insert QA user username")
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

    public void clickQAManualTestButton() {
        utils.wait(10);
        try {
            utils.scriptWait(1);
            MobileElement demoUserButton;
            demoUserButton = utils.getElementByAccessibilityId(qaManualTestButton_ai);
            demoUserButton.click();
            System.out.println("click QA Manual Test button");
        } catch (Exception exp) {
            System.out.println("\nclick QA Manual Test button ERROR " + exp.getCause());
            System.out.println("\nclick QA Manual Test button ERROR " + exp.getMessage());
        }
    }

    public void clickProceedButton() {
        try {
            utils.wait(10);
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
            MobileElement registerUserButton;
            registerUserButton = utils.getElementByAccessibilityId(registerUserButton_ai);
            registerUserButton.click();
            System.out.println("click Register User button");
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void clickQARegisterUser() {
        utils.scriptWait(15);
        utils.wait(10);
        try {
            if (utils.getElementByXpath(loginPage.getQARegisterUserButton_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(loginPage.getQARegisterUser1Button_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(loginPage.getSelectRegisterTitle()).isDisplayed()){
                utils.getElementByXpath(loginPage.getQARegisterUserButton_XPATH()).click();
                System.out.println("click Register User Register2 button");}
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void  clickPopupProceedButton(){
        utils.wait(1);
        try {
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
            utils.wait(1);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(shopManagerButton_ai);
            shopManagerButton.click();
            System.out.println("click shop manager button");
        } catch (Exception exp) {
            System.out.println("\nclick shop manager button ERROR " + exp.getCause());
            System.out.println("\nclick shop manager button ERROR " + exp.getMessage());
        }
    }

    public void clickQAShopOwnerButton() {
        try {
            utils.scriptWait(1);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(qaShopOwnerButton_ai);
            shopManagerButton.click();
            System.out.println("click QA shop owner button");
        } catch (Exception exp) {
            System.out.println("\nclick QA shop owner button ERROR " + exp.getCause());
            System.out.println("\nclick QA shop owner button ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPad(int number){
        utils.wait(5);
        try {
            MobileElement numberSelect;
            numberSelect = utils.getElementByXpath(numberPad_xpath + number + numberPad_xpath1);
            numberSelect.click();
            System.out.println("click number pad " + number);
        } catch (Exception exp) {
            System.out.println("\nclick number pad ERROR " + exp.getCause());
            System.out.println("\nclick number pad ERROR " + exp.getMessage());
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

    public void hideKeyboard(){
        utils.hideKeyboard();
    }

    public void clickToolbarSettingsButton() {
        try {
            MobileElement toolbarSettingsButton;
            toolbarSettingsButton = utils.getElementByAccessibilityId(toolbarSettings_ai);
            toolbarSettingsButton.click();
            System.out.println("click Toolbar Settings Button");
        } catch (Exception exp) {
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getCause());
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getMessage());
        }
    }

    public void clickSettingsMenuButton() {
        utils.wait(1);
        try {
            MobileElement settingsMenuButton;
            settingsMenuButton = utils.getElementByAccessibilityId(settingsMenu_ai);
            settingsMenuButton.click();
            System.out.println("click Settings Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMenuButton() {
        utils.wait(1);
        try {
            MobileElement logoutMenuButton;
            logoutMenuButton = utils.getElementByAccessibilityId(logoutMenu_ai);
            logoutMenuButton.click();
            System.out.println("click Logout Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserButton() {
        utils.wait(1);
        try {
            MobileElement logoutMasterUserButton;
            logoutMasterUserButton = utils.getElementByAccessibilityId(logoutMasterUser_ai);
            logoutMasterUserButton.click();
            System.out.println("click Logout MasterUser Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserPopupButton() {
        utils.wait(1);
        try {
            MobileElement logoutMasterUserPopupButton;
            logoutMasterUserPopupButton = utils.getElementByXpath(logoutMasterUserPopup_xpath);
            logoutMasterUserPopupButton.click();
            System.out.println("click Logout MasterUser Popup Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getMessage());
        }
    }

    @Step("Logout with master user")
    public void logoutMasterUser() {
        try {
            clickToolbarSettingsButton();
            clickSettingsMenuButton();
            clickLogoutMenuButton();
            clickLogoutMasterUserButton();
            clickLogoutMasterUserPopupButton();
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser ERROR " + exp.getMessage());
        }
    }

    @Step("login with QA user")
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
            HomepageValidation();
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
            HomepageValidation();
        } catch (Exception exp) {
            System.out.println("\nLogin QA user ERROR " + exp.getCause());
            System.out.println("\nLogin QA user ERROR " + exp.getMessage());
        }
    }
//↧↧↧********************************** table class *****************************************↧↧↧

    public void checkTable(int num) {
        try {
            MobileElement tableNumberValidation;
//            tableNumberValidation = utils.getElementByAccessibilityId(num+orderPage.getTableVerification_AI());
            String table = orderPage.getTableVerification_AI();
            tableNumberValidation = utils.getElementByAccessibilityId(num+table);
            if (tableNumberValidation.isDisplayed())
                System.out.println("table correctly selected " + num);
            else
                System.out.println("table correctly selected " + num + "not found");
        } catch (Exception exp) {
            System.out.println("\ncheck table ERROR " + exp.getCause());
            System.out.println("\ncheck table ERROR " + exp.getMessage());
        }
    }

    public void selectTable(int tableNumber) {
        utils.scriptWait(20);
//        utils.wait(30);
        try {
            String tableLocator = tablePage.getTable_XPATH_first();
            String tableLocator1 = tablePage.getTable_XPATH_second();
            if (utils.getElementByXpath(tableLocator+tableNumber+tableLocator1).isDisplayed()
                    &&utils.getElementByXpath(tablePage.getRefreshIcon_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(tablePage.getTableView_XPATH()).isDisplayed()){
                utils.getElementByXpath(tableLocator+tableNumber+tableLocator1).click();
                System.out.println("select table " + tableNumber);
            }
            else {
                System.out.println("Table " + tableNumber + " not found");
            }
        } catch (Exception exp) {
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getCause());
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getMessage());
        }
    }

    public void selectCategories(String category) {
        utils.wait(10);
        try {
            MobileElement table;
            table = utils.getElementByAccessibilityId(category);
            table.click();
            System.out.println("select category " + category);
        } catch (Exception exp) {
            System.out.println("\nselect category" + category + " ERROR " + exp.getCause());
            System.out.println("\nselect category" + category + " ERROR " + exp.getMessage());
        }
    }

    public void clickBackButton() {
        utils.scriptWait(10);
        try {
            if (utils.getElementByXpath(orderPage.getBackButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(orderPage.getBackButton_XPATH()).click();
                System.out.println("click back button");
                utils.scriptWait(3);
            }else
                System.out.println("click back button not found");
        } catch (Exception exp) {
            System.out.println("\nclick back button ERROR " + exp.getCause());
            System.out.println("\nclick back button ERROR " + exp.getMessage());
        }
    }

    public void clickClearTableButton() {
        try {
            utils.getElementByAccessibilityId(orderPage.getClearTableButton_AI()).click();
            System.out.println("click clear table button");
        } catch (Exception exp) {
            System.out.println("\nclick clear table button ERROR " + exp.getCause());
            System.out.println("\nclick clear table button ERROR " + exp.getMessage());
        }
    }

    public void clickAddToTableButton() {
        utils.wait(2);
        try {
            utils.getElementByXpath(orderPage.getAddToTable_XPATH()).click();
            System.out.println("click add to table button");
            utils.scriptWait(3);
        } catch (Exception exp) {
            System.out.println("\nclick add to table button ERROR " + exp.getCause());
            System.out.println("\nclick add to table button ERROR " + exp.getMessage());
        }
    }

    public void clickYesButton() {
        utils.scriptWait(5);
        try {
            utils.getElementByAccessibilityId(orderPage.getYesButton_AI()).click();
            System.out.println("click Yes button");
            utils.scriptWait(3);
        } catch (Exception exp) {
            System.out.println("\nclick Yes button ERROR " + exp.getCause());
            System.out.println("\nclick Yes button ERROR " + exp.getMessage());
        }
    }

    public void clickProductPlusButtonBig() {
        try {
            utils.getElementByAccessibilityId(orderPage.getProductPlusButtonBig_AI()).click();
            System.out.println("click product plus button");
        } catch (Exception exp) {
            System.out.println("\nclick product plus button ERROR " + exp.getCause());
            System.out.println("\nclick product plus button ERROR " + exp.getMessage());
        }
    }

    public void clickProductMinusButtonBig() {
        try {
            utils.getElementByAccessibilityId(orderPage.getProductMinusButtonBig_AI()).click();
            System.out.println("click product minus button");
        } catch (Exception exp) {
            System.out.println("\nclick product minus button ERROR " + exp.getCause());
            System.out.println("\nclick product minus button ERROR " + exp.getMessage());
        }
    }

    public void clickDoneButtonFromPopup() {
        try {
            MobileElement doneButton;
            doneButton = utils.getElementByXpath("//XCUIElementTypeButton[@name=\"DONE\"]");
            doneButton.click();
            System.out.println("click done button from popup");
        } catch (Exception exp) {
            System.out.println("\nclick done button from popup ERROR " + exp.getCause());
            System.out.println("\nclick done button from popup ERROR " + exp.getMessage());
        }
    }

    public void checkTableStatus(){
        utils.scriptWait(1);
        getFooterViewText();
        try {
            if (FooterViewText.contains("0,00")){
                getTableBillList();
                System.out.println("The table bill is zero");
            }else {
                getTableBillList();
            }
        }catch (Exception exp) {
            System.out.println("\ncheck table status ERROR " + exp.getCause());
            System.out.println("\ncheck table status ERROR " + exp.getMessage());
        }
    }

    public void checkAddOnsStatus(){
        utils.scriptWait(1);
        getTableBillCustomListText();
    }

    public void checkDiscountStatus(){
        getDiscountText();
    }

    public void addCokeToTable() {
        utils.wait(1);
        try {
            utils.getElementByAccessibilityId(orderPage.getOrderCoke_AI()).click();
            System.out.println("order coke");
        } catch (Exception exp) {
            System.out.println("\norder coke ERROR " + exp.getCause());
            System.out.println("\norder coke ERROR " + exp.getMessage());
        }
    }

    public void addFoodToTable(String foodName) {
        utils.wait(1);
        try {
            MobileElement coke;
            coke = utils.getElementByAccessibilityId(foodName);
            coke.click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void addPizzaToTable() {
        try {
            utils.getElementByAccessibilityId(orderPage.getOrderPizza_AI()).click();
            System.out.println("order pizza");
        } catch (Exception exp) {
            System.out.println("\nclick pizza ERROR " + exp.getCause());
            System.out.println("\nclick coke ERROR " + exp.getMessage());
        }
    }

    public void addBurgerToTable() {
        try {
            utils.getElementByAccessibilityId(orderPage.getOrderBurger_AI()).click();
            System.out.println("order burger");
        } catch (Exception exp) {
            System.out.println("\norder burger ERROR " + exp.getCause());
            System.out.println("\norder burger ERROR " + exp.getMessage());
        }
    }

    public void clearTable() {
        try {
            getFooterViewText();
//            getTableBillList();
//            if (FooterViewText.contains("0,00")&&TableBillList==null){
            if (FooterViewText.contains("0,00")){
                System.out.println("The table bill is zero");
                clickBackButton();
                utils.scriptWait(1);
            }else {
                getTableBillList();
                clickClearTableButton();
                clickYesButton();
                clickAddToTableButton();
                System.out.println("Clear table done now table bill is zero");
                utils.scriptWait(1);
            }
        } catch (Exception exp) {
            System.out.println("\nclear table ERROR " + exp.getCause());
            System.out.println("\nclear table ERROR " + exp.getMessage());
        }
    }

    public void clearSelectTable(int tableNumber) {
        selectTable(tableNumber);
        checkTable(tableNumber);
        clearTable();
    }

    public void getProductsListFromPopup() {
        FoodListPopup = utils.getProductsList(orderPage.getProductsListPopup_XPATH(), "Food list from popup");
    }

    public void getPlusButtonFromPopup() {
        PlusButtonPopup = utils.getProductsList(orderPage.getProductPlusButton_XPATH(), "Plus button from popup");
    }

    public void getMinusButtonFromPopup() {
        MinusButtonPopup = utils.getProductsList(orderPage.getProductMinusButton_XPATH(), "Minus button from popup");
    }

    public void getCategoriesCollectionGridView() {
        CategoriesCollectionGridViewList = utils.getProductsList(orderPage.getCategoriesCollectionGridView_XPATH(), "Categories");
    }

    public void getCategoriesCollectionListView() {
        CategoriesCollectionListViewList = utils.getProductsList(orderPage.getCategoriesCollectionListView_XPATH(), "Categories");
    }

    public void getMenuListGridView() {
        MenuListGridViewList = utils.getProductsList(orderPage.getMenuListGridView_XPATH(), "products from the menu");
    }

    public void getMenuListListView() {
        MenuListListViewList = utils.getProductsList(orderPage.getMenuListListView_XPATH(), "products from the menu");
    }

    public void getSubMenuListListView() {
        SubMenuListListViewList = utils.getProductsList(orderPage.getSubMenuListListView_XPATH(), "sub products from the menu");
    }

    public void getTableBillList() {
        TableBillList = utils.getProductsList( orderPage.getBillList_XPATH(), "products on the bill");
    }

    public void getFooterViewText() {
        FooterViewText = Arrays.toString(utils.getProductsList(orderPage.getFooterViewText_XPATH(), "price items"));
    }

    public void getTableBillCustomListText(){
        utils.wait(10);
        BillCustomListText = Arrays.toString(utils.getProductsList(orderPage.getBillListCustomList_XPATH(),"custom items"));
    }

    public void getDiscountText(){
        DiscountText = Arrays.toString(utils.getProductsList(orderPage.getDiscountListText_XPATH(),"discount fields"));
    }

    public void getTableGridViewMenuList(int tableNumber) {
        utils.wait(10);
        selectTable(tableNumber);
        checkTable(tableNumber);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        selectCategoryFromGridView(1);
        getMenuListGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        clickBackButton();
    }

    public void getTableListViewMenuList(int tableNumber) {
        utils.wait(10);
        selectTable(tableNumber);
//        utils.wait(3);
        checkTable(tableNumber);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        clickBackButton();
        selectCategoryFromListView(1);
        getMenuListListView();
        clickBackButton();
        selectCategoryFromListView(2);
        getMenuListListView();
        clickBackButton();
        clickBackButton();
    }

    public void orderFoodFromListView(int foodIndex) {
        try {
//            MobileElement food;
            String foodName;
            foodName = MenuListListViewList[foodIndex];
            utils.getElementByAccessibilityId(foodName).click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void addSubFoodFromPopup(int buttonIndex) {
        try {
            getPlusButtonFromPopup();
            MobileElement button;
            String plusButton;
            plusButton = PlusButtonPopup[buttonIndex];
            button = utils.getElementByAccessibilityId(plusButton);
            button.click();
            System.out.println("click add sub food button");
        } catch (Exception exp) {
            System.out.println("\nclick add sub button " + exp.getCause());
            System.out.println("\nclick add sub button " + exp.getMessage());
        }
    }

    public void minusSubFoodFromPopup(int buttonIndex) {
        try {
            getMinusButtonFromPopup();
            MobileElement button;
            String minusButton;
            minusButton = PlusButtonPopup[buttonIndex];
            button = utils.getElementByAccessibilityId(minusButton);
            button.click();
            System.out.println("click add button " + buttonIndex);
        } catch (Exception exp) {
            System.out.println("\nclick add button " + exp.getCause());
            System.out.println("\nclick add button " + exp.getMessage());
        }
    }

    public void selectCategoryFromListView(int categoryIndex) {
        try {
            MobileElement category;
            String categoryName;
            categoryName = CategoriesCollectionListViewList[categoryIndex];
            category = utils.getElementByAccessibilityId(categoryName);
            category.click();
            System.out.println("select category " + categoryName);
        } catch (Exception exp) {
            System.out.println("\nselect category ERROR " + exp.getCause());
            System.out.println("\nselect category ERROR " + exp.getMessage());
        }
    }

    public void selectCategoryFromGridView(int categoryIndex) {
        try {
            MobileElement category;
            String categoryName;
            categoryName = CategoriesCollectionGridViewList[categoryIndex];
            category = utils.getElementByAccessibilityId(categoryName);
            category.click();
            System.out.println("select category " + categoryName);
        } catch (Exception exp) {
            System.out.println("\nselect category ERROR " + exp.getCause());
            System.out.println("\nselect category ERROR " + exp.getMessage());
        }
    }

    public void setProductsGridView() {
        try {
            utils.getElementByAccessibilityId(orderPage.getGridViewButton_AI()).click();
            System.out.println("Set products grid view");
        } catch (Exception exp) {
            System.out.println("\nSet products grid view ERROR " + exp.getCause());
            System.out.println("\nSet products grid view ERROR " + exp.getMessage());
        }
    }

    public void setProductsListView() {
        try {
            utils.getElementByAccessibilityId(orderPage.getListViewButton_AI()).click();
            System.out.println("Set products list view");
        } catch (Exception exp) {
            System.out.println("\nSet products list view ERROR " + exp.getCause());
            System.out.println("\nSet products list view ERROR " + exp.getMessage());
        }
    }

    public void HomepageValidation() {
        utils.scriptWait(3);
        utils.wait(10);
        try {
            if (utils.getElementByXpath(tablePage.getTableView_XPATH()).isDisplayed()) {
                System.out.println("Get homepage successfully");
            } else {
                System.out.println("Homepage validation fail");
            }
        } catch (Exception exp) {
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getCause());
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getMessage());
        }

    }

    BillToolPage billToolPage = new BillToolPage();

    public void KDSStatusActive() {
        utils.scriptWait(10);
        utils.wait(10);
        try {
            Boolean activeButtonDisplayed = utils.getElementByAccessibilityId(billToolPage.getSendToKDSFilled_AI()).isDisplayed();
            if (activeButtonDisplayed)
                System.out.println("Product send to KDS active");
            else {
                System.out.println("Product NOT send to KDS inactive");
            }
        } catch (Exception exp) {
            System.out.println("\nProduct send to KDS status ERROR " + exp.getCause());
            System.out.println("\nProduct send to KDS status ERROR " + exp.getMessage());
        }
    }

    public void KDSStatusInactive() {
        utils.scriptWait(5);
        utils.wait(10);
        try {
            Boolean inactiveButtonDisplayed = utils.getElementByAccessibilityId(billToolPage.getSendToKDSOutline_AI()).isDisplayed();
            if (inactiveButtonDisplayed)
                System.out.println("Product NOT send to KDS inactive");
            else System.out.println("Product send to KDS active");
        } catch (Exception exp) {
            System.out.println("\nProduct send to KDS status ERROR " + exp.getCause());
            System.out.println("\nProduct send to KDS status ERROR " + exp.getMessage());
        }
    }

    public void clickPrintBillButton() {
        utils.scriptWait(20);
        utils.wait(20);
        try {
            if (utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).click();
                System.out.println("click Print Bill Button");
            }else{
                System.out.println("click Print Bill Button not found");
            }
        } catch (Exception exp) {
            System.out.println("\nclick Print Bill Button ERROR " + exp.getCause());
            System.out.println("\nclick Print Bill Button ERROR " + exp.getMessage());
        }
    }

    public void clickPrinterPopupOkButton() {
        utils.wait(5);
        try {
            utils.getElementByXpath(billToolPage.getPrinterPopupOkButton_XPATH()).click();
            System.out.println("click Print Bill Popup OK Button");
        } catch (Exception exp) {
            System.out.println("\nclick Print Bill Popup OK Button ERROR " + exp.getCause());
            System.out.println("\nclick Print Bill Popup OK Button ERROR " + exp.getMessage());
        }
    }

    public void clickBillEmptyPrinterPopupOkButton() {
        utils.scriptWait(5);
        utils.wait(5);
        try {
            if (utils.getElementByXpath(billToolPage.getBillEmptyPrinterPopupOkButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getBillEmptyPrinterPopupOkButton_XPATH()).click();
                System.out.println("Bill empty click Print Bill Popup OK Button");
            }else
                System.out.println("Bill empty click Print Bill Popup OK Button not found");
        } catch (Exception exp) {
            System.out.println("\nBill empty click Print Bill Popup OK Button ERROR " + exp.getCause());
            System.out.println("\nBill empty click Print Bill Popup OK Button ERROR " + exp.getMessage());
        }
    }

    public void clickReturnButton() {
        utils.scriptWait(5);
        utils.wait(20);
        try {
            if (utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).click();
                System.out.println("click Return Button");
            }else
                System.out.println("click Return Button not found");
        } catch (Exception exp) {
            System.out.println("\nclick Return Button ERROR " + exp.getCause());
            System.out.println("\nclick Return Button ERROR " + exp.getMessage());
        }
    }

    public void checkReturnModeStatus(){
        utils.scriptWait(5);
        utils.wait(10);
        try {
            boolean result = utils.getElementByXpath("//XCUIElementTypeStaticText[@name=\"RETURN STATUS ACTIVATED\"]").isDisplayed();
            if (result)
                System.out.println("ENTER Return Mode");
            else
                System.out.println("NOT in Return Mode");
        } catch (Exception exp) {
            System.out.println("\nreturn mode check ERROR " + exp.getCause());
            System.out.println("\nreturn mode check ERROR " + exp.getMessage());
        }

    }

    public void clickEnterReturnModeButton() {
        utils.scriptWait(5);
        utils.wait(10);
        try {
            if (utils.getElementByXpath(billToolPage.getEnterReturnModeButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getEnterReturnModeButton_XPATH()).click();
                System.out.println("click Enter Return Mode Button");
            }else
                System.out.println("click Enter Return Mode Button not found");
        } catch (Exception exp) {
            System.out.println("\nclick Enter Return Mode Button ERROR " + exp.getCause());
            System.out.println("\nclick Enter Return Mode Button ERROR " + exp.getMessage());
        }
    }

    public void clickDiscountButton() {
        utils.scriptWait(10);
        try {
            if (utils.getElementByXpath(billToolPage.getDiscountButton_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).isDisplayed()
                    &&utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getDiscountButton_XPATH()).click();
                System.out.println("click Discount Button");
            }else
                System.out.println("click Discount Button not found");
        } catch (Exception exp) {
            System.out.println("\nclick Discount Button ERROR " + exp.getCause());
            System.out.println("\nclick Discount Button ERROR " + exp.getMessage());
        }
    }

    public void clickPCTButton(){
        utils.scriptWait(5);
        utils.wait(5);
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getDiscountPCTButton_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getDiscountPCTButton_AI()).click();
                System.out.println("click PCT button");
            }
            else
                System.out.println("click PCT button not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCurrencyButton(){
        utils.scriptWait(5);
        utils.wait(5);
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getDiscountCurrencyButton_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getDiscountCurrencyButton_AI()).click();
                System.out.println("click currency button");
            }
            else
                System.out.println("click currency button not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPriceButton(){
        utils.scriptWait(5);
        utils.wait(5);
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getDiscountPriceButton_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getDiscountPriceButton_AI()).click();
                System.out.println("click price button");
            }
            else
                System.out.println("click price button not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickAddDiscountButton(){
        utils.scriptWait(5);
        utils.wait(5);
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getAddDiscountButton_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getAddDiscountButton_AI()).click();
                System.out.println("click add discount button");
            }
            else
                System.out.println("click add discount button not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickMoreButton() {
        try {
            MobileElement button;
            button = utils.getElementByXpath(billToolPage.getMoreButton_XPATH());
            button.click();
            System.out.println("click More Button");
        } catch (Exception exp) {
            System.out.println("\nclick More Button ERROR " + exp.getCause());
            System.out.println("\nclick More Button ERROR " + exp.getMessage());
        }
    }

    public void activeSendToKitchen() {
        utils.scriptWait(20);
        utils.wait(20);
        try {
            if (utils.getElementByXpath(billToolPage.getSendToKDSOutline_XPATH()).isDisplayed())
                utils.getElementByXpath(billToolPage.getSendToKDSOutline_XPATH()).click();
            System.out.println("Product send to KDS button click");
        } catch (Exception exp) {
            System.out.println("\nProduct send to KDS button click ERROR " + exp.getCause());
            System.out.println("\nProduct send to KDS button click ERROR " + exp.getMessage());
        }
    }

    public void cancelSendToKitchen() {
        utils.scriptWait(15);
        utils.wait(20);
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getSendToKDSFilled_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getSendToKDSFilled_AI()).click();
                System.out.println("Cancel product send to KDS button click");
            }
        } catch (Exception exp) {
            System.out.println("\nCancel product send to KDS ERROR " + exp.getCause());
            System.out.println("\nCancel product send to KDS ERROR " + exp.getMessage());
        }
    }

    public void editDiscount(int num){
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getDiscountPriceText_AI()).isDisplayed()){
                utils.getElementByAccessibilityId(billToolPage.getDiscountPriceText_AI()).sendKeys(Integer.toString(num));
                System.out.println("Edit discount with " + num);
            }
            else
                System.out.println("edit discount not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void orderFoodFromGridView(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = MenuListGridViewList[foodIndex];
//            food = utils.getElementByAccessibilityId(foodName);
            if(utils.getElementByXpath(orderPage.getMenuListGridView_XPATH()+"[@name=\""+foodName+"\"]").isDisplayed()){
                utils.getElementByXpath(orderPage.getMenuListGridView_XPATH()+"[@name=\""+foodName+"\"]").click();
                System.out.println("Select food " + foodName);
            }else
                System.out.println("Select food " + foodName + " not found");
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void orderFoodFromSubListView(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = SubMenuListListViewList[foodIndex];
            utils.getElementByAccessibilityId(foodName).click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void orderFoodFromPopup(int foodIndex) {
        try {
            MobileElement food;
            String foodName;
            foodName = FoodListPopup[foodIndex];
            utils.getElementByAccessibilityId(foodName).click();
            System.out.println("order " + foodName);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

//↥↥↥********************************** table class *****************************************↥↥↥

}
