public class BankingAccountMain
{
   public static void main(String[] args)
   {
      BankingAccount.Startup myCompany = new BankingAccount.Startup(200); 
      BankingAccount.Debit firstDebit = new BankingAccount.Debit(100);
      
      BankingAccount myAccount = new BankingAccount(myCompany);
      myAccount.debit(firstDebit);
      //System.out.println(myAccount);
      
      //System.out.println(myAccount.historyBalanceToString());
      
      System.out.println(myAccount.historyTransactionToString());
      
   }
}