// A new class MinMaxAccount whose instances can be used in place of a BankingAccount object
// but include new behavior of remembering the minimum and maximum balances ever recorded on the account.

public class MinMaxAccount extends BankingAccount
{
   private int minBalance;
   private int maxBalance;
   
   // Constructs a MinMaxAccount object using information in the Startup object s
   public MinMaxAccount(Startup s)
   {
      super(s);
      this.minBalance = s.startup_getBalance();
      this.maxBalance = s.startup_getBalance();
   }
   
   public void debit(Debit d)
   {
      super.debit(d);
      
      int balance = super.getBalance();
      
      if(balance < minBalance)
      {
         this.minBalance = balance;
      }
      
      if(balance > maxBalance)
      {
         this.maxBalance = balance;
      }
   }
   
   public void credit(Credit c)
   {
      super.credit(c);
      
      int balance = super.getBalance();
      
      if(balance < minBalance)
      {
         this.minBalance = balance;
      }
      
      if(balance > maxBalance)
      {
         this.maxBalance = balance;
      }
   }
   
   // returns minimum balance in pennies
   public int getMin()
   {
      return this.minBalance;
   }
   
   // returns maximum balance in pennies
   public int getMax()
   {
      return this.maxBalance;
   }
}