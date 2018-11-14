
public class InsertionSort {

	public static void main(String[] args) {
		 double[] w = {1.2, 2.3, 3.4, 4.5, 5.6} ;  
	        
	        System.out.println("SEBELUM INSERTION SORT");  
	        printArray(w);    
	        InsertionSort(w);    
	        System.out.println("SETELAH INSERTION SORT");  
	        printArray(w);   
	    }    
	    public static void InsertionSort(double arr[]) 
		{  
	        int p = arr.length;  
	        for (int i = 1; i < p; i++)
	    {	System.out.println("NOMOR SORT PASS "+(i));
	        int key = (int) arr[i];  
	        int y = i-1;            
	        while ( (y > -1) && ( arr [y] > key ) ) 
	    {  
	        System.out.println("COMPARING "+ key  + " and " + arr [y]); 
	        arr [y+1] = arr [y]; 
	        y--;  
	    }  
	        arr[y+1] = key; 
	        System.out.println("SWAPPING ELEMENTS: NEW ARRAY SETELAH SWAP");
	        printArray(arr);
	        }  
	    }
	    	static void printArray(double[] array){
		    for(int i=0; i < array.length; i++)
			{  
		    System.out.print(array[i] + " ");  
			} 
		    System.out.println();
		    
		}

	}
