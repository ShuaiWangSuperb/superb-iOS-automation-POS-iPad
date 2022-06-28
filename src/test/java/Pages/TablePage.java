package Pages;

public class TablePage {
    int TableNumber;
    public String Table_IosClassChain_first = "**/XCUIElementTypeOther[`label == \"MainView\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeImage[";
    public String Table_IosClassChain_second = "]";

    public String getTable_XPATH_first() {
        return Table_XPATH_first;
    }

    public String Table_XPATH_first = "//XCUIElementTypeOther[@name=\"MainView\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[@name=";

    public String getTable_XPATH_second() {
        return Table_XPATH_second;
    }

    public String Table_XPATH_second = "]";

    public String getRefreshIcon_XPATH() {
        return RefreshIcon_XPATH;
    }

    private String RefreshIcon_XPATH = "//XCUIElementTypeButton[@name=\"refresh icon\"]";

    public String getTableView_XPATH() {
        return TableView_XPATH;
    }

    private String TableView_XPATH = "//XCUIElementTypeOther[@name=\"MainView\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]";
}
