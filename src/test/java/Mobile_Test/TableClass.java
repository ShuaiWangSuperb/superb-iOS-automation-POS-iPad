package Mobile_Test;

import Pages.BillToolPage;
import Pages.HomePage;
import io.appium.java_client.MobileElement;
import Pages.TablePage;
import Pages.OrderPage;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class TableClass extends Utils{

    Utils utils = new Utils();

    TablePage tablePage = new TablePage();

    HomePage homePage = new HomePage();

    OrderPage orderPage = new OrderPage();

    String[] CategoriesCollectionGridViewList;
    String[] CategoriesCollectionListViewList;
    String[] MenuListGridViewList;
    String[] MenuListListViewList;
    String[] TableBillList;
    String[] FoodListPopup;
    String FooterViewText;
    String[] PlusButtonPopup;
    String[] MinusButtonPopup;
    String[] SubMenuListListViewList;
    String BillCustomListText;
    String DiscountText;

    @BeforeTest
    public void setup() {
        driver = utils.iPadDriverSetup();
//        utils.iPadBrowserstackSetup();
    }

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
        utils.wait(10);
        try {
            MobileElement table;
            String tableLocator = tablePage.getTable_XPATH_first();
            String tableLocator1 = tablePage.getTable_XPATH_second();
            if (utils.getElementByXpath(tableLocator+tableNumber+tableLocator1).isDisplayed()){
                utils.getElementByXpath(tableLocator+tableNumber+tableLocator1).click();
                System.out.println("select table " + tableNumber);
            }
            else
                System.out.println("Table " + tableNumber + " not found");
        } catch (Exception exp) {
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getCause());
            System.out.println("\nselect table" + tableNumber + " ERROR " + exp.getMessage());
        }
    }

    public void selectCategories(String category) {
        utils.wait(100);
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
        utils.wait(3);
        try {
            if (utils.getElementByXpath(orderPage.getBackButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(orderPage.getBackButton_XPATH()).click();
                System.out.println("click back button");
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
        } catch (Exception exp) {
            System.out.println("\nclick add to table button ERROR " + exp.getCause());
            System.out.println("\nclick add to table button ERROR " + exp.getMessage());
        }
    }

    public void clickYesButton() {
        try {
            utils.getElementByAccessibilityId(orderPage.getYesButton_AI()).click();
            System.out.println("click Yes button");
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
        utils.wait(3);
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
//            if (FooterViewText.contains("0,00")&&TableBillList.length==0){
            if (FooterViewText.contains("0,00")){
                System.out.println("The table bill is zero");
                clickBackButton();
            }else {
                getTableBillList();
                clickClearTableButton();
                clickYesButton();
                clickAddToTableButton();
                System.out.println("Clear table done now table bill is zero");
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
        BillCustomListText = Arrays.toString(utils.getProductsList(orderPage.getBillListCustomList_XPATH(),"custom items"));
    }

    public void getDiscountText(){
        DiscountText = Arrays.toString(utils.getProductsList(orderPage.getDiscountListText_XPATH(),"discount fields"));
    }

    public void getTableGridViewMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
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
        selectTable(tableNumber);
        utils.wait(3);
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
            MobileElement food;
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
        utils.wait(10);
        try {
            if (utils.getElementByAccessibilityId(homePage.getHomepageLabel_AI()).isDisplayed()) {
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
        try {
            Boolean activeButtonDisplayed = utils.getElementByAccessibilityId(billToolPage.getSendToKDSFilled_AI()).isDisplayed();
            if (activeButtonDisplayed)
                System.out.println("Product send to KDS active");
            else System.out.println("Product NOT send to KDS inactive");
        } catch (Exception exp) {
            System.out.println("\nProduct send to KDS status ERROR " + exp.getCause());
            System.out.println("\nProduct send to KDS status ERROR " + exp.getMessage());
        }
    }

    public void KDSStatusInactive() {
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
        try {
            if (utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getPrintBillButton_XPATH()).click();
                System.out.println("click Print Bill Button");
            }else
                System.out.println("click Print Bill Button not found");
        } catch (Exception exp) {
            System.out.println("\nclick Print Bill Button ERROR " + exp.getCause());
            System.out.println("\nclick Print Bill Button ERROR " + exp.getMessage());
        }
    }

    public void clickPrinterPopupOkButton() {
        try {
            utils.getElementByXpath(billToolPage.getPrinterPopupOkButton_XPATH()).click();
            System.out.println("click Print Bill Popup OK Button");
        } catch (Exception exp) {
            System.out.println("\nclick Print Bill Popup OK Button ERROR " + exp.getCause());
            System.out.println("\nclick Print Bill Popup OK Button ERROR " + exp.getMessage());
        }
    }

    public void clickBillEmptyPrinterPopupOkButton() {
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
        try {
            if (utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).isDisplayed()){
                utils.getElementByXpath(billToolPage.getReturnButton_XPATH()).click();
                System.out.println("click Return Button");
            }else
                System.out.println("click Return Button not found");
        } catch (Exception exp) {
            System.out.println("\nclick Return Button ERROR " + exp.getCause());
            System.out.println("\nclick Return Button ERROR " + exp.getMessage());
        }
    }

    public void clickEnterReturnModeButton() {
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
        utils.wait(10);
        try {
            if (utils.getElementByXpath(billToolPage.getDiscountButton_XPATH()).isDisplayed()){
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
        try {
            if (utils.getElementByAccessibilityId(billToolPage.getSendToKDSOutline_AI()).isDisplayed())
                utils.getElementByAccessibilityId(billToolPage.getSendToKDSOutline_AI()).click();
            System.out.println("Product send to KDS button click");
        } catch (Exception exp) {
            System.out.println("\nProduct send to KDS button click ERROR " + exp.getCause());
            System.out.println("\nProduct send to KDS button click ERROR " + exp.getMessage());
        }
    }

    public void cancelSendToKitchen() {
        try {
            utils.getElementByAccessibilityId(billToolPage.getSendToKDSFilled_AI()).click();
            System.out.println("Cancel product send to KDS button click");
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

    }
