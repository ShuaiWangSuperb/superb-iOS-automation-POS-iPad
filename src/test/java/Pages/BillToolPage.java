package Pages;

public class BillToolPage {
    public String getPrintBillButton_XPATH() {
        return PrintBillButton_XPATH;
    }

    public String getReturnButton_XPATH() {
        return ReturnButton_XPATH;
    }

    public String getDiscountButton_XPATH() {
        return DiscountButton_XPATH;
    }

    public String getAddProductButton_XPATH() {
        return AddProductButton_XPATH;
    }

    public String getMoreButton_XPATH() {
        return MoreButton_XPATH;
    }

    public String getSendToKDSFilled_AI() {
        return SendToKDSFilled_AI;
    }

    public String getSendToKDSOutline_AI() {
        return SendToKDSOutline_AI;
    }

    public String getPrinterPopupOkButton_XPATH() {
        return PrinterPopupOkButton_XPATH;
    }

    public String getBillEmptyPrinterPopupOkButton_XPATH() {
        return BillEmptyPrinterPopupOkButton_XPATH;
    }

    public String getEnterReturnModeButton_XPATH() {
        return EnterReturnModeButton_XPATH;
    }

    public String getDiscountPriceText_AI() {
        return DiscountPriceText_AI;
    }

    public String getDiscountPCTButton_AI() {
        return DiscountPCTButton_AI;
    }

    public String getDiscountCurrencyButton_AI() {
        return DiscountCurrencyButton_AI;
    }

    public String getDiscountPriceButton_AI() {
        return DiscountPriceButton_AI;
    }

    public String getAddDiscountButton_AI() {
        return AddDiscountButton_AI;
    }

    private String PrintBillButton_XPATH = "//XCUIElementTypeOther[@name=\"menuBarView\"]/XCUIElementTypeOther[2]/XCUIElementTypeButton[@name=\"PRINT BILL\"]";
    private String DiscountButton_XPATH = "//XCUIElementTypeButton[@name=\"DISCOUNT\"]";
    private String AddProductButton_XPATH = "//XCUIElementTypeButton[@name=\"ADD PRODUCT\"]";
    private String MoreButton_XPATH = "//XCUIElementTypeButton[@name=\"MORE\"]";
    private String ReturnButton_XPATH = "//XCUIElementTypeOther[@name=\"menuBarView\"]/XCUIElementTypeOther[2]/XCUIElementTypeButton[@name=\"RETURN\"]";
    private String SendToKDSFilled_AI = "send to kds filled";
    private String SendToKDSOutline_AI = "send to kds outlined";

    public String getSendToKDSOutline_XPATH() {
        return SendToKDSOutline_XPATH;
    }

    private String SendToKDSOutline_XPATH = "//XCUIElementTypeTable[@name=\"Bill line items\"]/XCUIElementTypeCell/XCUIElementTypeButton[@name=\"send to kds outlined\"]";
    private String PrinterPopupOkButton_XPATH = "//XCUIElementTypeButton[@name=\"Ok\"]";
    private String BillEmptyPrinterPopupOkButton_XPATH = "//XCUIElementTypeButton[@name=\"Okay\"]";
    private String EnterReturnModeButton_XPATH = "//XCUIElementTypeButton[@name=\"ENTER RETURN MODE\"]";
    private String DiscountPriceText_AI = "piecePriceTextField";
    private String DiscountPCTButton_AI = "pctButton";
    private String DiscountCurrencyButton_AI = "currencyButton";
    private String DiscountPriceButton_AI = "priceButton";
    private String AddDiscountButton_AI = "addDiscountButton";



}
