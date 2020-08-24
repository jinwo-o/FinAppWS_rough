public class Stock {
    public int numOfShares;
    public double avgPrice;
    public double currentPrice;
    public double yearlyHigh;
    public double totalVal;
    public double ifYearlyHighTotal;

    public double getTotalVal() {
        return totalVal;
    }

    public void setTotalVal(double totalVal) {
        this.totalVal = totalVal;
    }
}
