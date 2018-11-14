import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Enumeration names;
		   String key;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","WIRA PRAYANA");
		   hashtable.put("Key2","ANNISA JAWAS");
		   hashtable.put("Key3","MUFLI TAQWA");
		   hashtable.put("Key4","ZULIN");
		   hashtable.put("Key5","DZ");
		 
		   names = hashtable.keys();
		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +
		      hashtable.get(key));
		   }
		 }

	}


