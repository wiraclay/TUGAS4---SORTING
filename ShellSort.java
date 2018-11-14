import java.util.Arrays;

public class ShellSort {
	void sort(double A[])
    {
        int n = A.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i+=1) { 
                double temp = A[i]; 
                int j; 
                for (j = i; j >= gap && A[j - gap] > temp; j -= gap)
                    A[j] = A[j - gap];
                A[j] = temp;
                 System.out.println("LANGKAH KE-"+i+", Gap = "+gap+" SWAP("+i+","+gap+")"+" -> "+Arrays.toString(A));
                 System.out.println(Arrays.toString(A) );
                
            }
        }
    }
  
    public static void main(String [] args)
    {
        double [] arr = {1.5,4.6,9.7,3.2};
        System.out.print("UNSORTED ARRAY: ");
        System.out.println(Arrays.toString(arr));
        ShellSort ob = new ShellSort();
        ob.sort(arr);
        System.out.print("SORTED ARRAY: ");
          System.out.println(Arrays.toString(arr)); 
}
}
