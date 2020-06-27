// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
import java.text.DecimalFormat;

public class BankAccount
{
   // fields
   private String id;
   private double balance;
   private int transactions;
   private String transactionText;
   
   // constructor
   
   // Constructs a BankAccount object with the given id, and
   // 0 balance and transactions.
   public BankAccount(String id)
   {
      this.id = id;
      this.balance = 0;
      this.transactions = 0;
      this.transactionText = "";
   }
   
   // methods
   
   public double getBalance()
   {
      return this.balance;
   }
   
   public String getId()
   {
      return this.id;
   }
   
   public int getTransactionCount()
   {
      return this.transactions;
   }
   
   public String getTransactions()
   {
      return this.transactionText;
   }
   
   // Adds the amount to the balance if it is between 0-500.
   // Also counts as 1 transaction
   public void deposit(double amount)
   {
      if( 0 <= amount && amount <= 500 )
      {
         this.balance += amount;
         this.transactionText += "deposit of $" + amount + "\n";
      }
      transactions++;
   }
   
   // Subtracts the amount from the balance if the user has enough money.
   // Also counts as 1 transaction
   public void withdraw(double amount)
   {
      if(this.balance >= amount)
      {
         balance -= amount;
         transactionText += "withdrawal of $" + amount + "\n";
      }
      transactions++;
   }
   
   // returns true if the user's balance is large enough to afford
   // all of the fees or returns false if the balance has no money left, the balance is left as 0.0
   public boolean transactionFee(double amount)
   {
      double totalTransactionFee = 0.00;

      for(int i=1; i<=this.transactions; i++)
      {
         totalTransactionFee += i * amount; 
      }
      
      if(this.balance > totalTransactionFee)
      {
         this.balance -= totalTransactionFee;
         return true;
      }
      
      balance = 0.00;
      return false;
   }
   
   // This method moves money from this bank account to another account. 
   // The method accepts two parameters: a second BankAccount to accept the money, and a real number for the amount of money to transfer.
   // There is a $5.00 fee for transferring money, so this much must be deducted from the current account's balance before any transfer.
   // A transfer also counts as a transaction on both accounts.
   // If this account object does not have enough money to make the full transfer, transfer whatever money is left after the $5 fee is deducted. 
   // If this account has under $5 or the amount is 0 or less, no transfer should occur and neither account's state should be modified.
   public void transfer(BankAccount transferAccount, double amount)
   {
      if(this.balance < 5 || amount <= 0)
      {
         return;
      }
      
      if(this.balance < 5 + amount)
      {
         transferAccount.deposit(this.balance - 5);
         this.withdraw(this.balance);
      }
      
      else
      {
         transferAccount.deposit(amount);
         this.withdraw(5 + amount);
      }        
   }
   
   // Returns a string that contains the account's name(id) and balance in 2 dp.
   @Override
   public String toString()
   {
      DecimalFormat df2 = new DecimalFormat("0.00");
      
      if(this.balance >=0)
      {
         return this.id + ", $" + df2.format(this.balance);
      }
      else
      {
         return this.id + ", " + "-$" + df2.format(Math.abs(this.balance));
      }      
   }  
}