
package Assignment;

public class NavSys extends StockItem {

    // Constructor
    public NavSys(String stockCode, int quantity, double price) {
        super(stockCode, quantity, price);
    }

    // Overriding getStockName method
    @Override
    public String getStockName() {
        return "Navigation system";
    }

    // Overriding getStockDescription method
    @Override
    public String getStockDescription() {
        return "GeoVision Sat Nav";
    }

    // Overriding toString method using super
    @Override
    public String toString() {
        return super.toString();
    }
}
