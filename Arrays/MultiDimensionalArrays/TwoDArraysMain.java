public class TwoDArraysMain
{
   public static void main(String[] args)
   {
      /*
      double[][] temps = new double[3][5];
      
      temps[0][0] = 10.0;
      temps[1][3] = 98.0;
      
      TwoDArrays.print(temps);
      */
      
      /*
         10.0     0.0      0.0      0.0      0.0
         0.0      0.0      0.0      98.0     0.0
         0.0      0.0      0.0      0.0      0.0    
      */
      
      
      // jagged arrays
      
      
      double[][] jagged = new double[3][];
      jagged[0] = new double[2];
      jagged[1] = new double[4];
      jagged[2] = new double[3];
      
      TwoDArrays.print(jagged);
      
      /*
         0.0      0.0
         0.0      0.0      0.0      0.0
         0.0      0.0      0.0      
      */     
   }
}  