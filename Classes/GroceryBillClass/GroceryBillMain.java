public class GroceryBillMain
{
   public static void main(String[] args)
   {
      GroceryBill.Item banana = new GroceryBill.Item("banana", 3.45, 1.00);
      System.out.println(banana);
      
      GroceryBill.Employee employeeLacey = new GroceryBill.Employee("lacey");
      GroceryBill lacey = new GroceryBill(employeeLacey);
      lacey.add(banana);
      System.out.println(lacey.getTotal());
      
      
   }
}