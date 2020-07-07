// A DividendStock object represents a stock purchase that also pays
// dividends.
public class DividendStock extends Stock
{
   private double dividends; // amount of dividends paid
   
   // constructs a new DividendStock with the given symbol
   // and no shares purchased
   public DividendStock(String symbol, double currentPrice)
   {
      super(symbol, currentPrice); // call Stock constructor
      this.dividends = 0.0;     
   }
   
   // returns this DividendStock's market value, which is
   // a normal stock's market value plus any dividends
   @Override
   public double getMarketValue()
   {
      return super.getMarketValue() + this.dividends;
   }
   
   // records a dividend of the given amount per share
   public void payDividend(double amountPerShare)
   {
      this.dividends += amountPerShare * super.getTotalShares();
   }      
}
