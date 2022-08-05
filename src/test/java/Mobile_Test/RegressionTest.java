package Mobile_Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class RegressionTest extends RegressionClass {

    @Test(priority=0)
    @Description("Test Description: Login test with QA username and password.")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginTestQA() throws Exception {
        utils.testStartLog("LoginTestQA");
        acceptAlert();
        loginQAUser();
        utils.testEndLog("LoginTestQA");
    }

    @Test(priority=1)
    @Description("Test Description: Clear table if the bill is not zero.")
    @Severity(SeverityLevel.BLOCKER)
    public void ClearTableTest() {
        utils.testStartLog("Clear Table Test");
        clearSelectTable(1);
        clearSelectTable(2);
        clearSelectTable(3);
        clearSelectTable(4);
        clearSelectTable(5);
        clearSelectTable(6);
        HomepageValidation();
        utils.testEndLog("Clear Table Test");
    }

    @Test(priority=2)
    @Description("Test Description: Get the list view of category and food list.")
    @Severity(SeverityLevel.BLOCKER)
    public void ProductsListViewTest() {
        utils.testStartLog("Products List View Test");
        getTableListViewMenuList(2);
        HomepageValidation();
        utils.testEndLog("Products List View Test");
    }

    @Test(priority=3)
    @Description("Test Description: Get the grid view of category and food list.")
    @Severity(SeverityLevel.BLOCKER)
    public void ProductsGridViewTest() {
        utils.testStartLog("Products Grid View Test");
        getTableGridViewMenuList(1);
        HomepageValidation();
        utils.testEndLog("Products Grid View Test");
    }

    @Test(priority=4)
    @Description("Test Description: Grid view of category and food list order without add to table.")
    @Severity(SeverityLevel.BLOCKER)
    public void GridViewOrderAndBackTest() {
        utils.testStartLog("Grid View Order And Back Test");
        clearSelectTable(3);
        selectTable(3);
        checkTable(3);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        orderFoodFromGridView(0);
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(3);
        checkTable(3);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("Grid View Order And Back Test");
    }

    @Test(priority=5)
    @Description("Test Description: List view of category and food list order without add to table.")
    @Severity(SeverityLevel.BLOCKER)
    public void ListViewOrderAndBackTest() {
        utils.testStartLog("List View Order And Back Test");
        clearSelectTable(4);
        selectTable(4);
        checkTable(4);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        orderFoodFromListView(1);
        clickBackButton();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(4);
        checkTable(4);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("List View Order And Back Test");
    }

    @Test(priority=6)
    @Description("Test Description: Grid view of category and food list order and add to table.")
    @Severity(SeverityLevel.BLOCKER)
    public void GridViewOrderTest() {
        utils.testStartLog("Grid View Order Test");
        clearSelectTable(5);
        HomepageValidation();
        selectTable(5);
        checkTable(5);
        setProductsGridView();

        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        orderFoodFromGridView(0);

        selectCategoryFromGridView(1);
        getMenuListGridView();
        orderFoodFromGridView(0);
        getProductsListFromPopup();
        orderFoodFromPopup(0);
        checkTableStatus();

        selectCategoryFromGridView(2);
        getMenuListGridView();
        orderFoodFromGridView(1);
        getProductsListFromPopup();
        clickProductPlusButtonBig();
        addSubFoodFromPopup(0);
        clickDoneButtonFromPopup();
        checkAddOnsStatus();
        checkTableStatus();

        clickAddToTableButton();
        HomepageValidation();
        selectTable(5);
        checkTable(5);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("Grid View Order Test");
    }

    @Test(priority=7)
    @Description("Test Description: List view of category and food list order and add to table.")
    @Severity(SeverityLevel.BLOCKER)
    public void ListViewOrderTest() {
        utils.testStartLog("List View Order Test");
        clearSelectTable(2);
        HomepageValidation();
        selectTable(2);
        checkTable(2);
        setProductsListView();
        getCategoriesCollectionListView();

        selectCategoryFromListView(0);
        getMenuListListView();
        orderFoodFromListView(1);
        clickBackButton();

        selectCategoryFromListView(1);
        getMenuListListView();
        orderFoodFromListView(0);
        getSubMenuListListView();
        orderFoodFromSubListView(3);
        checkTableStatus();
        clickBackButton();

        selectCategoryFromListView(2);
        getMenuListListView();
        orderFoodFromListView(1);
        addSubFoodFromPopup(0);
        clickDoneButtonFromPopup();
        checkAddOnsStatus();
        clickBackButton();

        clickAddToTableButton();
        HomepageValidation();
        selectTable(2);
        checkTable(2);
        checkTableStatus();
        checkAddOnsStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("List View Order Test");
    }

    @Test(priority=8)
    @Description("Test Description: Send to KDS status test.")
    @Severity(SeverityLevel.BLOCKER)
    public void SendToKDSTest() {
        testStartLog("Send to KDS Test");
        clearSelectTable(3);
        HomepageValidation();
        selectTable(3);
        checkTable(3);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        orderFoodFromGridView(2);
        KDSStatusInactive();
        activeSendToKitchen();
        KDSStatusActive();
        cancelSendToKitchen();
        KDSStatusInactive();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        utils.testEndLog("Send to KDS Test");
    }

    @Test(priority=9)
    @Description("Test Description: Print with empty list and food list.")
    @Severity(SeverityLevel.BLOCKER)
    public void PrinterTest(){
        utils.testStartLog("Printer Test");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);
        clickPrintBillButton();
        clickBillEmptyPrinterPopupOkButton();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        orderFoodFromGridView(2);
        clickPrintBillButton();
        clickPrinterPopupOkButton();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        utils.testEndLog("End Printer Test");
    }

    @Test(priority=10)
    @Description("Test Description: Return food from the table.")
    @Severity(SeverityLevel.BLOCKER)
    public void ReturnTest(){
        utils.testStartLog("Return Test");
        clearSelectTable(2);
        selectTable(2);
        checkTable(2);
        clickMoreButton();
        clickReturnButton();
        clickEnterReturnModeButton();
        checkReturnModeStatus();
        getMenuListGridView();
        orderFoodFromGridView(0);
        checkTableStatus();
        clickAddToTableButton();
        selectTable(2);
        checkTable(2);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("Return Test");
    }

    @Test(priority=11)
    @Description("Test Description: Discount from the table bill.")
    @Severity(SeverityLevel.BLOCKER)
    public void DiscountTest(){
        utils.testStartLog("Discount Test");
        clearSelectTable(6);
        selectTable(6);
        checkTable(6);

        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        orderFoodFromGridView(1);
        getProductsListFromPopup();
        clickProductPlusButtonBig();
        addSubFoodFromPopup(0);
        clickDoneButtonFromPopup();
        checkTableStatus();
        checkAddOnsStatus();

        clickDiscountButton();
        clickPCTButton();
        editDiscount(10);
        clickAddDiscountButton();
        checkDiscountStatus();

        clickDiscountButton();
        clickCurrencyButton();
        editDiscount(10);
        clickAddDiscountButton();
        checkDiscountStatus();

        clickDiscountButton();
        clickPriceButton();
        editDiscount(10);
        clickAddDiscountButton();
        checkDiscountStatus();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        utils.testEndLog("Discount Test");
    }

    @Test(priority=12)
    @Description("Test Description: Print Send to KDS status test.")
    @Severity(SeverityLevel.BLOCKER)
    public void PrintSendToKDSTest() {
        testStartLog("Print Send to KDS Test");
        clearSelectTable(3);
        HomepageValidation();
        selectTable(3);
        checkTable(3);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(2);
        getMenuListGridView();
        orderFoodFromGridView(2);
        KDSStatusInactive();
        activeSendToKitchen();
        KDSStatusActive();
        clickAddToTableButton();
        selectTable(3);
        clickClearTableButton();
        clickYesButton();
        clickAddToTableButton();
        HomepageValidation();
        utils.testEndLog("Send to KDS Test");
    }

    @Test(priority=13)
    @Description("Test Description: Logout master user.")
    @Severity(SeverityLevel.BLOCKER)
    public void SettingsLogoutMasterUser() throws Exception {
        utils.testStartLog("SettingsLogoutMasterUser");
        logoutMasterUser();
        utils.testEndLog("SettingsLogoutMasterUser");
    }
}
