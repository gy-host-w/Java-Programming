package demo1.week9.exercise;

class Stock {
    // Data fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        // Assuming initial previousClosingPrice and currentPrice are set to some default or provided values,
        // but for this example, we'll only set previousClosingPrice in the constructor (currentPrice will be set later).
        // In a real-world scenario, consider using a more robust initialization strategy.
        this.previousClosingPrice = 0.0; // Default value, should be set to actual previous closing price when object is created.
        // Note: currentPrice is not set here and should be updated later.
    }

    // Method to calculate the percentage change
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            throw new ArithmeticException("Previous closing price cannot be zero for percentage calculation.");
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
public class e1 {
    public static void main(String[] args) {
        // Create a Stock object with symbol ORCL and name Oracle Corporation
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Set the previous closing price
        stock.setPreviousClosingPrice(34.5);

        // Set the current price
        stock.setCurrentPrice(34.35);

        // Calculate and display the price-change percentage
        double changePercent = stock.getChangePercent();
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: $" + stock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + stock.getCurrentPrice());
        System.out.printf("Price Change Percentage: %.2f%%\n", changePercent);
    }
}
