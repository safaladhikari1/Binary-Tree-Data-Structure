public class PointClient
{
   public static void main(String[] args)
   {
      Point a = new Point(2, 9);
      Point b = new Point(3, 2);
      
      System.out.println(a);
      System.out.println(b);
      
      System.out.println(a.distance(b));
      System.out.println(a.distanceFromOrigin());
      
      b.translate(9, 0);
      
      System.out.println(b.super.toString());
      
      
   }   
}