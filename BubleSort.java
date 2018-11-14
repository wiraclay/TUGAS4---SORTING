import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		double[] w = {1.2, 2.3, 3.4, 4.5, 5.6} ;

	      System.out.println("Before sort: " + Arrays.toString(w) );
	      System.out.println("After  sort: " + Arrays.toString(w) );
	   }
	}


	class BubbleSort1
	{
	   public static void sort(double[] r)
	   {
	      double help;
	      int x, y;
	      boolean done;

	      System.out.println("----------- STEP SORTING ----------");
	 
	      done = false;
	      x = r.length;

	      while ( ! done )
	      {
	         System.out.print("LANGKAH " + (r.length-x) + ": ");
	         System.out.println(Arrays.toString(r) );

	         done = true;           
	         for ( y = 0 ; y < x-1 ; y ++ )
	         {

	            if ( r[y] > r[y+1] )
	            {
	               help = r[y];
	               r[y] = r[y+1];
	               r[y+1] = help;

	               done = false;   
	            }
	         }

	         x--;
	      }

	      System.out.print("Hasil: ");
	      System.out.println(Arrays.toString(r) );
	   }

}
