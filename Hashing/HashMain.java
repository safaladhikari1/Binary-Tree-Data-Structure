// This client program tests our hash set of integers
// by adding and removing several elements from it.
public class HashMain
{
   public static void main(String[] args)
   {
      // Debug the code on jGrasp Viewer to get the full picture
      HashIntSet set = new HashIntSet();
      
      set.add(7);
      set.add(5);
      
      // test adding duplicates
      set.add(7);
      
      // test collisions and linked lists
      set.add(77);
      
      System.out.println(set);
      
      // test removal
      set.remove(7);
      System.out.println(set);
      
      
      
      
   }   
}