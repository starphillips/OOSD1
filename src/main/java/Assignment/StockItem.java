
package Assignment;

public class StockItem {
    
    private String stockCode;
    private int stockQuantity;
    private double priceBeforeVAT;
    private final double VATRate = 17.5; // Standard VAT rate
    
     // Constructor
        public StockItem(String stockCode, int quantity, double price) {
        this.stockCode = stockCode;
        this.stockQuantity = quantity;
        this.priceBeforeVAT = price;
    }
        
     // Set and Get
        
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    
    public String getStockCode() {
        return stockCode;
    }
    
    public void setQuantity (int quantity) {
        this.stockQuantity = quantity;
    }
    
    public int getQuantity() {
        return stockQuantity;
    }
    
    public void setPriceBeforeVAT(double price) {
        this.priceBeforeVAT = price;
    }

    public double getPriceBeforeVAT() {
        return priceBeforeVAT;
    }
    
    public double getPriceAfterVAT() {
        return priceBeforeVAT * (1 + VATRate / 100);
    }
    
    // Add and Sell Stock

    public void addStock(int amount) {
        if (amount < 1) {
            System.out.println("\nIncreased item must be greater than or equal to one. Quantity will appear the same.");
        }
        if(stockQuantity + amount > 100){
            System.out.println("Invalid amount. Cannot sell stock. Quanitity will remain the same.");
        }
        stockQuantity += amount;
    }
    
    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("\nInvalid amount. Cannot sell stock. Quantity will remain the same.");
            return false;
        }
        if (amount <= stockQuantity) {
            stockQuantity -= amount;
            return true; } 
            else {
                System.out.println("\nInsufficient quantity of stock. Cannot sell the below. Quantity will remain the same.");
                return false;
        }
    }
    

    public double getVAT() {
        return VATRate;
    }
    
    public String getStockName() {
        return "Unknown Stock Name";
    }
    
    public String getStockDescription() {
        return "Unknown Stock Description";
    }
    
    public String toString() {
        return "Stock Name: " + getStockName() + "\n" +
               "Description: " + getStockDescription() + "\n" +
               "Stock Code: " + stockCode + "\n" +
               "Price before VAT: " + priceBeforeVAT + "\n" +
               "Price with VAT: " + getPriceAfterVAT() + "\n" +
               "Total unit in Stock: " + stockQuantity + "\n";
    }
}



    

    
    

    


