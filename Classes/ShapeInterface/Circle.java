// Represents circular shapes.

public class Circle implements Shape
{
   private double radius;
   
   // constructs a new circle with the given radius
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   // returns the area of this circle
   public double getArea()
   {
      return Math.PI * this.radius * this.radius;
   }
   
   // returns the perimeter of this circle
   public double getPerimeter()
   {
      return 2.0 * Math.PI * this.radius;
   }   
}