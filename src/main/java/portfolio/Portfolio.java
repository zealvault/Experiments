package portfolio;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
  private NationalStockService stockService;
	
  public Portfolio() {
    stockService = new NationalStockService();
  }
	
  public List<Double> track(String ...tickers) throws Exception {
    List<Double>  prices = new ArrayList<>();
    for(String ticker : tickers) {
      prices.add(getStockPrice(ticker));
    }
    return prices;
  }

  double getStockPrice(String ticker) throws Exception {
    return stockService.getPrice(ticker);
  }
}