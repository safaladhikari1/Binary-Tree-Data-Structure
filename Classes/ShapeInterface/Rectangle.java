// Represents rectangular shape

public class Rectangle implements Shape
{
   private double width;
   private double height;
   
   // constructs a new rectangle with the given dimensions
   public Rectangle(double width, double height)
   {
      this.width = width;
      this.height = height;
   }
   
   // returns the area of this rectangle
   public double getArea()
   {
      return this.width * this.height;
   }
   
   // returns the perimeter of this rectangle
   public double getPerimeter()
   {
      return 2.0 * (this.width + this.height);
   }     
}