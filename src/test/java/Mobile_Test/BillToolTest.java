package Mobile_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BillToolTest extends TableTest{

    @Test
    public void SendToKDSTest() {
        testStartLog("Send to KDS Test");
        clearSelectTable(1);
        HomepageValidation();
        selectTable(1);
        checkTable(1);
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
        utils.testEndLog("End Send to KDS Test");
    }

    @Test
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
        utils.testStartLog("End Printer Test");
    }

    @Test
    public void ReturnTest(){
        utils.testStartLog("Return Test");
        clearSelectTable(1);
        selectTable(1);
        clickReturnButton();
        clickEnterReturnModeButton();
        getMenuListGridView();
        orderFoodFromGridView(0);
        clickReturnButton();
        checkTableStatus();
        clickAddToTableButton();
        selectTable(1);
        checkTableStatus();
        clickBackButton();
        HomepageValidation();
        utils.testStartLog("End Return Test");
    }

    @Test
    public void DiscountTest(){
        utils.testStartLog("Discount Test");
        clearSelectTable(1);
        selectTable(1);
        checkTable(1);

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
        utils.testStartLog("End Discount Test");
    }

}
