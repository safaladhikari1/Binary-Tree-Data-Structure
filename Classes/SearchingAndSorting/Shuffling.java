import java.util.*;

public class Shuffling
{
   public static void main(String[] args)
   {
      String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
      String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      
      List<String> deck = new ArrayList<String>();
      
      for(String rank: ranks)
      {
         for(String suit: suits)
         {
            deck.add(rank + " of " + suit);
         }
      }
      
      //System.out.println(deck);
      Collections.shuffle(deck);
      System.out.println("Top card = " + deck.get(0));
      
      
   }
}