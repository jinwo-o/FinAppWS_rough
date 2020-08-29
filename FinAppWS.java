package ca.finappws.finappws;
// import ca.fantasybasketball.teamweeklystats.model.Player;
// import ca.fantasybasketball.teamweeklystats.stats.PlayerWeeklyTotal;
import ca.finappws.readers.ReadCSV;
import ca.finappws.model.Stock;
// import ca.fantasybasketball.teamweeklystats.stats.AddStats;
// import ca.fantasybasketball.teamweeklystats.model.Stats;
import java.io.IOException;


//
public class FinAppWS {

    public static void main(String[] args) throws IOException {
        Portfolio portfolio = ReadCSV.CSV_Reader("/users/jin/work/FinAppWS/stocks.csv");
        double totalValue = 0;
        for(Stock stock : portfolio.getStocks()) {
            double stockTotalValue = stock.getTotalVal();
            totalValue = stockTotalValue + totalValue;
        }

        System.out.println("Total value of portfolio: "+ totalValue);
    }

}
