// This class helps to compute discounts for preferred customers.

public class DiscountBill extends GroceryBill
{
   private boolean preferred;
   private int discountCount;
   private double discountAmount;
   
   // constructs discount bill for given clerk
   public DiscountBill(Employee clerk, boolean preferred)
   {
      super(clerk);
      this.preferred = preferred;
   }
   
   @Override
   public void add(Item i)
   {
      super.add(i);
      
      if(preferred && i.getDiscount() > 0)
      {
         discountAmount += i.getDiscount();
         discountCount++;
      }
   }
   
   // returns the number of items that were discounted, if any
   public int getDiscountCount()
   {
      return this.discountCount;   
   }
   
   // returns the total discount for this list of items, if any
   public double getDiscountAmount()
   {
      return this.discountAmount;
   }
   
   // returns the total for the list of items, after deducting total discount
   public double getTotal()
   {
      return super.getTotal() - this.discountAmount;
   }
   
   // returns the percent of the total discount as a percent of what the total would have been otherwise
   public double getDiscountPercent()
   {
      return (this.discountAmount * 100) / super.getTotal();  
   }     
}