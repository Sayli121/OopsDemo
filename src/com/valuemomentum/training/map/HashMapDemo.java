package com.valuemomentum.training.map;


import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> languages=new HashMap<>();
		languages.put(1, "java");
		languages.put(2, "python");
		languages.put(3, "javaScript");
		System.out.println("hashMap: "+ languages);
		//get methods to get values
		String value = languages.get(1);
		System.out.println("value at index 1: "+value);
		System.out.println("value at index 3: "+languages.get(3));

		 //return set views of keys
		System.out.println("Keys: "+languages.keySet());
		//retun set view of values
		System.out.println("values: "+languages.values());
		
		//return set view of key/value pairs

		System.out.println("key/value mappings: "+languages.entrySet());
	
	languages.replace(2, "c++");
	//iterate through keys only
	System.out.print("keys :");
	for(Integer key: languages.keySet()) {
		System.out.print(key +" - "+ languages.get(key) );
		System.out.print(", ");
	}
	 // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (java.util.Map.Entry<Integer, String> entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
	}
	
	

}
