package Mobile_Test;
import org.testng.annotations.Test;

public class TableTest extends TableClass{

    @Test(priority=1)
    public void ClearTableTest() {
        utils.testStartLog("Clear Table Test");
        clearSelectTable(1);
        HomepageValidation();
        utils.testEndLog("Clear Table Test");
    }

    @Test(priority=2)
    public void ProductsListViewTest() {
        utils.testStartLog("Products List View Test");
        getTableListViewMenuList(1);
        HomepageValidation();
        utils.testEndLog("Products List View Test");
    }

    @Test(priority=3)
    public void ProductsGridViewTest() {
        utils.testStartLog("Products Grid View Test");
        getTableGridViewMenuList(1);
        HomepageValidation();
        utils.testEndLog("Products Grid View Test");
    }

    @Test(priority=4)
    public void GridViewOrderAndBackTest() {
        utils.testStartLog("Grid View Order And Back Test");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);
        setProductsGridView();
        getCategoriesCollectionGridView();
        selectCategoryFromGridView(0);
        getMenuListGridView();
        orderFoodFromGridView(0);
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("Grid View Order And Back Test");
    }

    @Test(priority=5)
    public void ListViewOrderAndBackTest() {
        utils.testStartLog("List View Order And Back Test");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);
        setProductsListView();
        getCategoriesCollectionListView();
        selectCategoryFromListView(0);
        getMenuListListView();
        orderFoodFromListView(1);
        clickBackButton();
        clickBackButton();
        clickYesButton();
        HomepageValidation();
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("List View Order And Back Test");
    }

    @Test(priority=6)
    public void GridViewOrderTest() {
        utils.testStartLog("Grid View Order Test");
        clearSelectTable(1);
        HomepageValidation();
        selectTable(1);
        checkTable(1);
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
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("Grid View Order Test");
    }

    @Test(priority=7)
    public void ListViewOrderTest() {
        utils.testStartLog("List View Order Test");
        clearSelectTable(1);
        HomepageValidation();
        selectTable(1);
        checkTable(1);
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
        selectTable(1);
        checkTable(1);
        checkTableStatus();
        checkAddOnsStatus();
        clickBackButton();
        HomepageValidation();
        utils.testEndLog("List View Order Test");
    }

}
