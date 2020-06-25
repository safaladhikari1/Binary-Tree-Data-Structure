// A Point object represents a pair of (x, y) coordinates
public class Point
{
   // Fields
   private int x;
   private int y;
   
   // Constructor
   
   // Constructs a new point at the origin, (0, 0).
   public Point()
   {
      setLocation(0, 0);
   }
   
   // Constructs a new point with the given (x, y) location. 
   public Point(int x, int y)
   {
      setLocation(x, y);
   }
     
   // Methods
   
   // Sets this point's (x, y) location to the given values.
   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   // Sets the x-coordinate of this point to the given value.
   public void setX(int x)
   {
      this.x = x;
   }
   
   // Sets the y-coordinate of this point to the given value.
   public void setY(int y)
   {
      this.y = y;
   }
   
   // Returns the x-coordinate of this point
   public int getX()
   {
      return this.x;
   }
   
   // Returns the y-coordinate of this point.
   public int getY()
   {
      return this.y;
   }
   
   // Returns the distance between this point and the given other Point.
   public double distance(Point p)
   {
      int dx = this.x - p.getX();
      int dy = this.y - p.getY();
      
      return Math.sqrt(dx * dx + dy * dy);
   }
   
   // Returns the distance between this Point and (0, 0).
   public double distanceFromOrigin()
   {
      return distance(new Point());
   }
   
   // Shifts this point's location by the given amount.
   public void translate(int dx, int dy)
   {
      setLocation(this.x + dx, this.y + dy);
   }
   
   // Returns a String representation of this point.
   
   // Override Object's toString() method
   @Override 
   public String toString()
   {
      // return super.toString() if you want to print the memory address
      return "(" + this.x + ", " + this.y + ")";
   }
   
   // Returns whether obj refers to a point with the same (x, y)
   // coordinates as "this" point.   
    
   // Override Object's equals method
   @Override  
   public boolean equals(Object obj) 
   {    
       // convert obj from an Object into a Point, then save it into a variable called other           
       if(obj instanceof Point) 
       {
           Point other = (Point) obj;
           if(this.x == other.getX() && this.y == other.getY())
           {
              return true;
           }           
       } 
        
       // not the point with the same (x , y) 
       return false;
    }    
}