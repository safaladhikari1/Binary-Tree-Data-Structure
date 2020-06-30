// A Stock object represents purchases of shares of a stock.

public class Stock
{
   private String symbol;     // stock symbol, e.g. "YHOO"
   private int totalShares;   // total shares purchased
   private double totalCost;  // total cost for all shares
   
   // initializes a new Stock with no shares purchased
   // pre: symbol != null
   public Stock(String theSymbol)
   {
      if(theSymbol == null)
      {
         throw new NullPointerException();
      }
      
      this.symbol = theSymbol;
      this.totalShares = 0;
      this.totalCost = 0.0;
   }
   
   // Returns the total profit or loss earned on this stock,
   // based on the given price per share.
   // pre: currentPrice >= 0.0
   public double getProfit(double currentPrice)
   {
      if(currentPrice < 0.0)
      {
         throw new IllegalArgumentException();
      }
      
      double marketValue = totalShares * currentPrice;     
      return marketValue - totalCost;
   }
   
   // records purchase of the given number of shares of this stock
   // at the given price per share
   // pre: shares >=0 && pricePerShare >= 0.0s
   public void purchase(int shares, double pricePerShare)
   {
      if(shares < 0 || pricePerShare < 0)
      {
         throw new IllegalArgumentException();
      }
      
      totalShares += shares;
      totalCost += shares * pricePerShare;
   }
   
   // returns the total shares purchased of this stock
   public int getTotalShares()
   {
      return this.totalShares;
   }  
}

// Next Steps:

// accessors for the Stock's data (the symbol, number of shares, so on..)
// toString() method to print Stock objects
// add second constructor that would accept an initial number of shares and cost.
