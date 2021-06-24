package portfolio;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Portfolio portfolio = new Portfolio();
        List<Double> prices = portfolio.track("AAPL", "MSFT", "GOOG");
        System.out.println("Got Prices => " + prices);
    }
}