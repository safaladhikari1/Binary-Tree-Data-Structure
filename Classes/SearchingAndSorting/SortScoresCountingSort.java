/*
   Write a method that takes:
      1. an array of unsortedScores.
      2. the highestPossibleScore in the game
   
   and returns a sorted array of scores in less than O(n Log (n)) time.
   
   -------
   
   Algorithm:
   
   1. We are using Counting Sort Algorithm in this solution.
      Counting is a common pattern in time-saving algorithms.
      
      It gives us O(N) runtime, but at the expense of adding O(N) space
      
      The idea is to define a hash map or array (call it e.g. counts) where the keys/indices represent the items from the input set and the values represent the number of times the item appears. 
      In one pass through the input you can fully populate counts: 
      
      Map<Integer, Integer> counts = new HashMap<>();

      for (int item : array) 
      {
          Integer count = counts.get(item);
          int incrementedCount = (count == null) ? 1 : count + 1;
          counts.put(item, incrementedCount);
      }
      
   2. For our solution:
      
      We have a method sortedScores, which takes in an array of unsortedArray and the highNum (highest Number)
      
      We first make our counterTable = new int[highNum + 1]; 
      The reason we have + 1 is because,
      
      if our highNum is 100.
      
      we have to count from indices 0 to 100, which is 101.
      
   3. Then we loop through our unsortedArray and count the occurence of each item in our counterTable.
   
   4. Now we create our resultArray. It is same size as our unsortedArray.
      We create our index = 0.
      
   5. Now we create a for loop, that starts at HighNum and ends at 0, and decrements
      
      for(int i=highNum; i >=0; i--)
         
         Here we keep tab on the count of the counterTable[i] i.e. occurence;
         This will tell us how many number of times the item from on unsortedArray occured in our counterTable.
         
         Another for loop for occurrence:
         
         for(int occurrence = 0; occurrence < count; occurrence++)
         
         Now we we assign the value of i, to our resultArray[index], the index is 0 at first
         increment the index.
         This will sort the array in descending order (highestnumber first to lowest)
         
         If we need in ascending order,
         we just assign the value of i, to our resultArray[index], the index is resultarray.length() - 1, which is the last index of the result array.
         decrement the index.
         
   6. Return the result Array.
   
   -----------
   
   Time-Complexity: O(N + K), N is the number of items in the array, for the first for loop
                              K is our highest score, we loop through every elements in the array made from K at least once.
                                     
   Space-Complexity: O(N + K), N is the number of items in the array, we created resultArray based on N.
                               K is our highest score, we created counterTable based on the value of K.
                               
                               
   (Notice it's not O(N ^ 2) even though there are two for loops)
      because the outer loop runs once for each unique number in the array.
      The inner loop runs once for each time that number occurred.
      
   So in essence we're just looping through the nn numbers from our input array, except we're splitting it into two steps: (1) each unique number, and (2) each time that number appeared.                                 
*/

import java.util.Arrays;

class SortScoresCountingSort
{
   public static void main(String[] args)
   {
      int[] unsortedScores = {37, 89, 41, 65, 91, 53};
      int highScore = 100;
      
      System.out.println(Arrays.toString(sortedScores(unsortedScores, highScore)));
      
   }
   
   // Sorts in Ascending Order
   /*
   public static int[] sortedScores(int[] unsortedArray, int highNum)
   {
      int[] counterTable = new int[highNum + 1];
      
      for(int num : unsortedArray)
      {
         counterTable[num]++;
      }
      
      int[] resultArray = new int[unsortedArray.length];
      int lastIndex = resultArray.length - 1;
      
      for(int i = highNum; i >= 0; i--)
      {
         int count = counterTable[i];
         
         // for number of times the item occurs
         for(int occurrence = 0; occurrence < count; occurrence++)
         {
            resultArray[lastIndex] = i;
            lastIndex--;
         }        
      }
      
      return resultArray;
           
   }
   */
   
     
   // Sorts in Descending Order  
   public static int[] sortedScores(int[] unsortedArray, int highNum)
   {
      int[] counterTable = new int[highNum + 1];
      
      for(int num : unsortedArray)
      {
         counterTable[num]++;
      }
      
      int[] resultArray = new int[unsortedArray.length];
      int index = 0;
      
      for(int i = highNum; i >= 0; i--)
      {
         int count = counterTable[i];
         
         // for number of times the item occurs
         for(int occurrence = 0; occurrence < count; occurrence++)
         {
            resultArray[index] = i;
            index++;
         }        
      }
      
      return resultArray;
           
   } 
}