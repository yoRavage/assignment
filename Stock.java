import java.util.Scanner;
   public class Stock {

   
    private String symbol;
    private String name;
    private double priorClosingPrice;
    private double currentPrice;
    
    

    public Stock(String symbol, String name, double priorClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.priorClosingPrice = priorClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice - priorClosingPrice) / priorClosingPrice * 100;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriorClosingPrice() {
        return priorClosingPrice;
    }

    public void setPriorClosingPrice(double priorClosingPrice) {
        this.priorClosingPrice = priorClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stock symbol: ");
        String symbol = input.nextLine();

        System.out.println("Enter the stock name: ");
        String name = input.nextLine();

        System.out.println("Enter the closing price of the stock the prior day: ");
        double priorClosingPrice = input.nextDouble();

        System.out.println("Enter the current price of the stock: ");
        double currentPrice = input.nextDouble();

        Stock stock = new Stock(symbol, name, priorClosingPrice, currentPrice);

        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Prior Closing Price: " + stock.getPriorClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price-change Percentage: " + stock.getChangePercent() + "%");
    }
}