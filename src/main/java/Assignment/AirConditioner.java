
package Assignment;

public class AirConditioner extends StockItem {
    private String efficiency;

    public AirConditioner(String stockCode, int quantity, double price, String efficiency) {
        super(stockCode, quantity, price);
        this.efficiency = efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String getStockName() {
        return "Air Conditioner";
    }

    @Override
    public String getStockDescription() {
        return "A/C System";
    }

    @Override
    public String toString() {
        return super.toString() +
               "Energy Efficiency: " + efficiency + "\n";
    }
}

