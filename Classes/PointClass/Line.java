public class Line
{
   // fields
   private Point p1;
   private Point p2;
   
   // constructor
   public Line(Point p1, Point p2)
   {
      this.p1 = p1;
      this.p2 = p2;
   }
   
   public Line(int x1, int y1, int x2, int y2)
   {
      this.p1 = new Point(x1, y1);
      this.p2 = new Point(x2, y2);
   }
   
   // methods
   public Point getP1()
   {
      return this.p1;
   }
   
   public Point getP2()
   {
      return this.p2;
   }
   
   @Override
   public String toString()
   {
      return "[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]";
   }
   
   public double getSlope()
   {
      if(this.p1.getX() == this.p2.getX())
      {
         throw new IllegalStateException();
      }
      
      return (double)(this.p2.getY() - this.p1.getY())/(this.p2.getX() - this.p1.getX());
   }
   
   public boolean isCollinear(Point p)
   {
      double slope1 = (double)(this.p2.getY() - p.getY())/(this.p2.getX() - p.getX()); 
      double slope2 = (double)(this.p1.getY() - p.getY())/(this.p1.getX() - p.getX());
      
      return slope1 == slope2; 
   }  
}  