// Represents triangular shapes.

public class Triangle implements Shape
{
   private double a;
   private double b;
   private double c;
   
   // constructs a new triangle with the given side lengths
   public Triangle(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   // returns this triangle's area using Heron's formula
   public double getArea()
   {
      double s = (a + b + c) / 2.0;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
   }
   
   // returns the perimeter of this triangle
   public double getPerimeter()
   {
      return this.a + this.b + this.c;
   }   
}