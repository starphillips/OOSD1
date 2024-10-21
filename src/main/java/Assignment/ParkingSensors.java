
package Assignment;

public class ParkingSensors extends StockItem {
    private String location;

    public ParkingSensors(String stockCode, int quantity, double price, String location) {
        super(stockCode, quantity, price);
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getStockName() {
        return "Parking Sensors";
    }

    @Override
    public String getStockDescription() {
        return "Infrared Parking Sensor";
    }

    @Override
    public String toString() {
        return super.toString() +
               "Location of Parking Sensors: " + location + "\n";
    }
}
