
public class BinarySearch {
	public static int BinarySearch(int[] sortedArray, int start, int end, int key) {
		 
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return BinarySearch(sortedArray, start, mid, key);
 
            } else if (key > sortedArray[mid]) {
                return BinarySearch(sortedArray, mid+1, end , key);
 
            } else {
                return mid;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
 
        int[] arr1 = {1,22,333,444,555,666,777,888,999};
        int index = BinarySearch(arr1,0,arr1.length,45);
        if(index != -1){
            System.out.println("FOUND 22 AT 2"+index+" index");
        }
        else{
            System.out.println("TIDAK DITEMUKAN");
        }
 
        index = BinarySearch(arr1,0,arr1.length,99);
        if(index != -1){
             System.out.println("FOUND 999 AT "+index+" index");
        }else{
            System.out.println("ELEMENT TIDAK DITEMUKAN");
        }
    }
}
