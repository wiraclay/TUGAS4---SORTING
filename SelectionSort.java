import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {
		//DATA INPUT
		ArrayList<Double> input 	= new ArrayList<Double>();
		//DATA INPUT: [1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.10, 10.11, 11.12]
		input.add(1.2);
		input.add(2.3);
		input.add(3.4);
		input.add(4.5);
		input.add(5.6);
		input.add(6.7);
		input.add(7.8);
		input.add(8.9);
		input.add(9.10);
		input.add(10.11);
		input.add(11.12);
		//MENCETAK DATA INPUT
		System.out.println("DATA INPUT   : "+input.toString());
		//MEMANGGIL METHOD SORT( )
		ArrayList<Double> output	= sort(input);	
		//CETAK HASIL SORTING 
		System.out.println("HASIL SORTING: "+output.toString());		
		}
		public static ArrayList<Double>sort(ArrayList<Double> data){
			int n	= data.size();
			for(int i=0;i<n-1;i++){			
			int min	= i;
			for(int j=1+i;j<n;j++){
			if(data.get(j)<data.get(min)){
			min = j;
						}
					}
			if(min != i){
			Double tempData = data.get(i);
			data.set(i, data.get(min));
			data.set(min, tempData);
					}
			//MENCETAK HASIL DARI SETIAP LANGKAH dan OPERASI SWAPnya
			System.out.println("LANGKAH KE-"+i+", min = "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
				}
			return data;		
			}
	}


