public class GroceryBillMain
{
   public static void main(String[] args)
   {
      GroceryBill.Item banana = new GroceryBill.Item("banana", 3.45, 1.00);
      GroceryBill.Item milk = new GroceryBill.Item("milk", 4.25, 0.25);
      
      GroceryBill.Employee employeeLacey = new GroceryBill.Employee("lacey");
      GroceryBill lacey = new GroceryBill(employeeLacey);
      lacey.add(banana);
      lacey.add(milk);
      System.out.println(lacey.discountToString());
      
      
   }
}