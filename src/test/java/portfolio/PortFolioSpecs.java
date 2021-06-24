package portfolio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortFolioSpecs {

    @Test
    public void getStockPriceOfGoogle() throws Exception {
        Portfolio portfolio = new Portfolio(){
            @Override
            double getStockPrice(String ticker) throws Exception {
                return 10.3;
            }
        };

        assertEquals(10.3, portfolio.track("GOOG").get(0), 0);

    }

}