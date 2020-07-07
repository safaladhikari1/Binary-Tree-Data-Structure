// A ShareAsset object represents a general asset that has a symbol
// and holds shares. Initial version.
public class ShareAsset
{
   private String symbol;
   private double totalCost;
   private double currentPrice;
   
   // constructs a new share asset with the given symbol and current price
   public ShareAsset(String symbol, double currentPrice)
   {
      this.symbol = symbol;
      this.currentPrice = currentPrice;
      this.totalCost = 0.0;
   }
   
   // adds a cost of the given amount to this asset
   public void addCost(double cost)
   {
      this.totalCost += cost;
   }
   
   // returns the price per share of this asset
   public double getCurrentPrice()
   {
      return this.currentPrice;
   }
   
   // returns this asset's total cost for all shares
   public double getTotalCost()
   {
      return this.totalCost;
   }
   
   // sets the current share price of this asset
   public void setCurrentPrice(double currentPrice)
   {
      this.currentPrice = currentPrice;
   }
}