package Pages;

public class OrderPage {
    public String getOrderCoke_AI() {
        return OrderCoke_AI;
    }

    public String OrderCoke_AI = "Coke";

    public String getOrderPizza_AI() {
        return OrderPizza_AI;
    }

    public String OrderPizza_AI = "Pizza";

    public String getOrderBurger_AI() {
        return OrderBurger_AI;
    }

    public String OrderBurger_AI = "Burger";

    public String getBackButton_XPATH() {
        return BackButton_XPATH;
    }

    public String BackButton_XPATH = "//XCUIElementTypeButton[contains(@name, 'BACK')]";

    public String getClearTableButton_AI() {
        return ClearTableButton_AI;
    }

    public String ClearTableButton_AI = "clearButton";

    public String getTableVerification_AI() {
        return TableVerification_AI;
    }

    public String TableVerification_AI = ", Very Long Restaurant Name";

    public String getAddToTable_XPATH() {
        return AddToTable_XPATH;
    }

    public String AddToTable_XPATH = "//XCUIElementTypeButton[@name=\"ADD TO TABLE\"]";

    public String getYesButton_AI() {
        return YesButton_AI;
    }

    public String YesButton_AI = "okButton";

    public String getListViewButton_AI() {
        return ListViewButton_AI;
    }

    public String getProductPlusButtonBig_AI() {
        return ProductPlusButtonBig_AI;
    }

    public String GridViewButton_AI = "productsGrid";
    public String ListViewButton_AI = "productsList";

    public String getProductPlusButton_XPATH() {
        return ProductPlusButton_XPATH;
    }

    public String ProductPlusButtonBig_AI = "icon product plus big";
    public String ProductPlusButton_XPATH = "//XCUIElementTypeButton[@name=\"icon product plus\"]";

    public String getProductMinusButton_XPATH() {
        return ProductMinusButton_XPATH;
    }

    public String ProductMinusButton_XPATH = "//XCUIElementTypeButton[@name=\"icon product minus\"]";

    public String getProductMinusButtonBig_AI() {
        return ProductMinusButtonBig_AI;
    }

    public String ProductMinusButtonBig_AI = "icon product minus big";

    public String getBillList_XPATH() {
        return billList_XPATH;
    }

    public String billList_XPATH = "//XCUIElementTypeTable[@name=\"Bill line items\"]/XCUIElementTypeCell/XCUIElementTypeStaticText";

    public String getBillListCustomList_XPATH() {
        return billListCustomList_XPATH;
    }

    private String billListCustomList_XPATH = "//XCUIElementTypeTable[@name=\"Bill line items\"]/XCUIElementTypeCell/XCUIElementTypeTable/*/XCUIElementTypeStaticText";

    public String getMenuListGridView_XPATH() {
        return MenuListGridView_XPATH;
    }

    public String getGridViewButton_AI() {
        return GridViewButton_AI;
    }

    public String MenuListGridView_XPATH = "//XCUIElementTypeOther[@name=\"productCollectionView\"]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText";

    public String getMenuListListView_XPATH() {
        return MenuListListView_XPATH;
    }

    public String MenuListListView_XPATH = "//XCUIElementTypeOther[@name=\"productsListCollectionView\"]/XCUIElementTypeTable/XCUIElementTypeCell[@name=\"itemListCell\"]/XCUIElementTypeStaticText";

    public String getSubMenuListListView_XPATH() {
        return SubMenuListListView_XPATH;
    }

    public String SubMenuListListView_XPATH = "//XCUIElementTypeCell[@name=\"itemListCell\"]/XCUIElementTypeStaticText";

    public String getCategoriesCollectionGridView_XPATH() {
        return CategoriesCollectionGridView_XPATH;
    }

    public String CategoriesCollectionGridView_XPATH = "//XCUIElementTypeOther[@name=\"categoriesCollectionView\"]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText";

    public String getCategoriesCollectionListView_XPATH() {
        return CategoriesCollectionListView_XPATH;
    }

    public String CategoriesCollectionListView_XPATH = "//XCUIElementTypeOther[@name=\"productsListCollectionView\"]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText";

    public String getProductsListPopup_XPATH() {
        return ProductsListPopup_XPATH;
    }

    public String ProductsListPopup_XPATH = "//XCUIElementTypeApplication[@name=\"Superb POS TEST\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText";

    public String getFooterViewText_XPATH() {
        return FooterViewText_XPATH;
    }

    public String FooterViewText_XPATH = "//XCUIElementTypeOther[@name=\"footerView\"]/XCUIElementTypeStaticText";

    public String getDiscountListText_XPATH() {
        return DiscountListText_XPATH;
    }

    private String DiscountListText_XPATH = "(//XCUIElementTypeOther[@name=\"billView\"])[2]/XCUIElementTypeOther/XCUIElementTypeTable[2]/XCUIElementTypeCell/XCUIElementTypeStaticText";
}
