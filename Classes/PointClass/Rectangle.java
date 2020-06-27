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
   
   // Returns whether the given Point or coordinates lie inside the bounds of this Rectangle. 
   // The edges are included; for example, a rectangle with [x=2,y=5,width=8,height=10] will return true for any point from (2, 5) through (10, 15) inclusive.
   public boolean contains(Point p)
   {
       return contains(p.getX(), p.getY());
   }
   
   public boolean contains(int x, int y)
   {
     return (x >= this.x && x <= this.x + this.width) && (y >= this.y && y <= this.y + height);  
   }
   
   // Returns a new Rectangle that represents the area occupied by the tightest bounding box that contains both this Rectangle and the given other Rectangle. 
   // Your method should not modify the current Rectangle or the one that is passed in as a parameter; you should create and return a new rectangle.
   public Rectangle union(Rectangle rect)
   {
       int left = Math.min(this.x, rect.x);
       int top = Math.min(this.y, rect.y);
       int right = Math.max(this.x + this.width, rect.x + rect.width);
       int bottom = Math.max(this.y + this.height, rect.y + rect.height);
        
       return new Rectangle(left, top, right - left, bottom - top);
   }
   
   @Override
   public String toString()
   {
      return "Rectangle[x=" + this.getX() + ",y=" + this.getY() + ",width=" + this.getWidth() + 
              ",height=" + this.getHeight() + "]"; 
   }  
}