public class ListClient
{
   public static void main(String[] args)
   {
      List<Integer> list1 = new ArrayList<>();
      List<Integer> list2 = new LinkedList<>();
      
      processList(list1);
      processList(list2);
      
   }
   
   public static void processList(List<Integer> list)
   {
      list.add(18);
      list.add(27);
      list.add(93);
      
      System.out.println(list);
      list.remove(1);
      
      System.out.println(list);
   }   
}