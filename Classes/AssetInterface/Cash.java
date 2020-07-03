// A Cash object represents an amount of money held by an investor.

public class Cash implements Asset
{
   private double amount; // amount of money held
   
   // constructs a cash investment of the given amount
   public Cash(double amount)
   {
      this.amount = amount;
   }
   
   // returns this cash investment's market value, which
   // is equal to the amount of cash
   public double getMarketValue()
   {
      return this.amount;
   }
   
   // since cash is a fixed asset, it never has any profit
   public double getProfit()
   {
      return 0.0;
   }
   
   // sets the amount of cash invested to the given value
   public void setAmount(double amount)
   {
      this.amount = amount;
   }
}