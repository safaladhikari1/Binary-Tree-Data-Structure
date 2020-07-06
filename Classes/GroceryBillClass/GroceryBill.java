// This class keeps track of a list of items being purchased at a market
import java.util.*;

public class GroceryBill
{
   private Employee clerk;
   private List<Item> receipt;
   private double total;
   private double internalDiscount;
   
   public GroceryBill(Employee clerk)
   {
      this.clerk = clerk;
      this.receipt = new ArrayList<Item>();
      this.total = 0.0;
      this.internalDiscount = 0.0;
   }
   
   public void add(Item i)
   {
      receipt.add(i);
      total += i.getPrice();
      internalDiscount += i.getDiscount();
   }
   
   public double getTotal()
   {
      return Math.rint(total * 100) / 100.0;
   }
   
   public Employee getClerk()
   {
      return this.clerk;
   }
   
   public void printReceipt()
   {
      System.out.println(this);
   }
   
   private String valueToString(double value)
   {
      value = Math.rint(value * 100) / 100.0;
      String result = "" + Math.abs(value);
      
      if(result.indexOf(".") == result.length() - 2)
      {
         result += "0";
      }
      
      result = "$" + result;
      return result;     
   }
   
   public String receiptToString()
   {
      String build = "items:\n";
      
      for(int i=0; i<receipt.size(); i++)
      {
         build += "  " + receipt.get(i);
         
         if(i != receipt.size() - 1)
         {
            build += "\n";
         }        
      }
      
      return build;
   }
   
   @Override
   public String toString()
   {
      return receiptToString() + "\ntotal: " + valueToString(total);
   }
   
   public String discountToString()
   {
      return receiptToString() + "\nsub-total: " + 
             valueToString(total) + "\ndiscount: " +
             valueToString(internalDiscount) + "\ntotal: " +
             valueToString(total - internalDiscount);
   }
   
   public static class Employee
   {
      private String name;
      
      public Employee(String name)
      {
         this.name = name;
      }
      
      public String getName()
      {
         return this.name;
      }
   }
   
   public static class Item
   {
      private String name;
      private double price;
      private double discount;
      
      public Item(String name, double price, double discount)
      {
         this.name = name;
         this.price = price;
         this.discount = discount;
      }
      
      public double getPrice()
      {
         return this.price;
      }
      
      public double getDiscount()
      {
         return this.discount;
      }
      
      private String valueToString(double value)
      {
         String result = "" + Math.abs(value);
         
         if(result.indexOf(".") == result.length() - 2)
         {
            result += "0";
         }
         
         result = "$" + result;
              
         return result;
      }
      
      @Override
      public String toString()
      {
         return this.name + " " + valueToString(this.price) + " (-" + 
                valueToString(this.discount) + ")";
      }
   }
   
   
}