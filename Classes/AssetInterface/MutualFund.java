// A MutualFund object represents a mutual fund asset.
// Initial version.

public class MutualFund extends ShareAsset implements Asset
{
   private double totalShares;
   
   // constructs a new MutualFund investment with the given 
   // symbol and price per share
   public MutualFund(String symbol, double currentPrice)
   {
      super(symbol, currentPrice);
      this.totalShares = 0;
   }
   
   // returns the market value of this mutual fund, which is
   // the number of shares times the price per share
   public double getMarketValue()
   {
      return this.totalShares * super.getCurrentPrice();
   }
   
   // returns the number of shares of this mutual fund
   public double getTotalShares()
   {
      return this.totalShares;
   }
   
   // returns the profit made on this mutual fund
   public double getProfit()
   {
      return getMarketValue() - super.getTotalCost();
   }
   
   // records purchase of the given shares at the given price
   public void purchase(double shares, double pricePerShare)
   {
      this.totalShares += shares;
      super.addCost(shares * pricePerShare);
   }   
}