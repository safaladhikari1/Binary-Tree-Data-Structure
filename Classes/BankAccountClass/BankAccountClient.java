public class BankAccountClient
{
   public static void main(String[] args)
   {
      BankAccount savings = new BankAccount("Ryan");
      System.out.println(savings);
      
      savings.deposit(10.00);
      savings.deposit(50.00);
      savings.deposit(10.00);
      savings.deposit(70.00);
      savings.withdraw(20.00);
      System.out.println(savings.getTransactions());
      System.out.println(savings.getBalance());
      System.out.println(savings.transactionFee(10.00));
      System.out.println(savings.getBalance());
      
      BankAccount checking = new BankAccount("Sarah");
      checking.deposit(432);
      System.out.println(checking);
      
   }
}