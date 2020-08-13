// This client program tests our hash set of integers, hash set of objects
// by adding and removing several elements from it.
public class HashMain
{
   public static void main(String[] args)
   {
      HashSet<String> stringSet = new HashSet<String>();
      stringSet.add("hello");
      stringSet.add("apple");
      stringSet.add("banana");
      stringSet.add("orange");
      
      System.out.println(stringSet);
       
      /*
      // Debug the code on jGrasp Viewer to get the full picture
      HashIntSet set = new HashIntSet();
      
      set.add(7);
      set.add(5);
      set.add(1);
      set.add(9);
      
      // test adding duplicates
      set.add(7);
      set.add(7);
      set.add(5);
      
      // test collisions and linked lists
      set.add(45);
      set.add(91);
      set.add(71);
      
      System.out.println(set);
      
      // test rehashing
      set.add(810); // re-hash should occur here (8/10, load = 0.8)
      set.add(62);
      set.add(1238);
      set.add(-99);
      set.add(42);
      set.add(49857);
            
      // test removal
      set.remove(7);
      
      for(int n: new int[] {1520, 99, 2, 42})
      {
         System.out.println("contains " + n + "? " + set.contains(n));
      }
      
      System.out.println(set + ", size " + set.size());
      
      */
      
      
   }   
}