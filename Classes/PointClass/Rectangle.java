public class Rectangle
{
   // Fields
   private int x;
   private int y;
   private int width;
   private int height;
   
   private Point p;
   
   // Constructor
   public Rectangle(int x, int y, int width, int height)
   {
      if( width < 0 || height < 0)
      {
         throw new IllegalArgumentException();
      }
      
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
   
   public Rectangle(Point p, int width, int height)
   {
      this(p.getX(), p.getY(), width, height);
   }
   
   // Methods
   public int getHeight()
   {
      return this.height;
   }
   
   public int getWidth()
   {
      return this.width;
   }
   
   public int getX()
   {
      return this.x;
   }
   
   public int getY()
   {
      return this.y;
   }
   
   @Override
   public String toString()
   {
      return "Rectangle[x=" + this.getX() + ",y=" + this.getY() + ",width=" + this.getWidth() + 
              ",height=" + this.getHeight() + "]"; 
   }  
}