import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// DATA
		ArrayList<Double> data = new ArrayList<Double>();
		// INPUTAN DATA: [1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.10, 10.11, 11.12]
		data.add(1.2);
		data.add(2.3);
		data.add(3.4);
		data.add(4.5);
		data.add(5.6);
		data.add(6.7);
		data.add(7.8);
		data.add(8.9);
		data.add(9.10);
		data.add(10.11);
		data.add(11.12);

		// MENCETAK INPUTAN DATA
		System.out.println("Data : " + data.toString());		
				
		Scanner s = new Scanner(System.in);
		System.out.print("SILAHKAN MASUKAN KUNCI PENCARIAN: ");
		double key	= s.nextDouble();
				
		int posisi = -1;//jika setelah proses pencarian posisi tetap = -1 berarti key tidak ditemukan pada data
				
		//BEGIN PENCARIAN LINEAR
		for(int i=0;i<data.size();i++){
			if(key==data.get(i)){
			posisi = i;
			break;
					}
				}
				//END OF PENCARIAN LINEAR
				
				//TAMPILKAN HASIL PENCARIAN
				if(posisi!=-1){//Jika nilai posisi tidak sama dengan -1 berarti data ditemukan
					System.out.println("KEY: "+key+" BERADA DI INDEX ARRAY LIST: "+posisi);
				}else{
					System.out.println("KEY TIDAK DITEMUKAN");
				}	

			}
	}


