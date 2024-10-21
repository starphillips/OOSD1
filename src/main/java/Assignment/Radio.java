
package Assignment;

public class Radio extends StockItem {
    private String quality;

    public Radio (String stockCode, int quantity, double price, String quality) {
        super(stockCode, quantity, price);
        this.quality = quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String getStockName() {
        return "Radio";
    }

    @Override
    public String getStockDescription() {
            return "Radio System";
    }

    @Override
    public String toString() {
        return super.toString() +
               "Quality of Speaker: " + quality + "\n";
    }
    
}
