// A DividendStock object represents a stock purchase that also pays dividends.

public class DividendStock extends Stock
{
   private double dividends; // amount of dividends paid
   
   // constructs a new dividend stock with the given symbol
   // and no shares purchased
   public DividendStock(String theSymbol)
   {
      super(theSymbol); // call Stock constructor
      this.dividends = 0.0;
   }
   
   // records a dividend of the given amount per share
   public void payDividend(double amountPerShare)
   {
      // super.getTotalShares() only required when accessing overridden methods or constructors from the superclass.
      this.dividends += amountPerShare * getTotalShares(); 
   }
   
   // returns the total profit or loss earned on this stock,
   // including profits made from dividends
   public double getProfit(double currentPrice)
   {
      return super.getProfit(currentPrice) + this.dividends;
   }   
}