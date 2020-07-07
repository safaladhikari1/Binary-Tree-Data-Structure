// A Stock object represents purchases of shares of a stock.
// Initial version.

public class Stock extends ShareAsset
{
   private int totalShares;
   
   // constructs a new Stock with the given symbol and
   // current price per share
   public Stock(String symbol, double currentPrice)
   {
      super(symbol, currentPrice);
      this.totalShares = 0;
   }
   
   // returns the market value of this stock, which is
   // the number of total shares times the share price
   public double getMarketValue()
   {
      return this.totalShares * super.getCurrentPrice();
   }
   
   // returns the total number of shares purchased
   public int getTotalShares()
   {
      return this.totalShares;
   }
   
   // records a purchase of the given number of shares of
   // the stock at the given price per share
   public void purchase(int shares, double pricePerShare)
   {
      this.totalShares += shares;
      super.addCost(shares * pricePerShare);
   }   
}