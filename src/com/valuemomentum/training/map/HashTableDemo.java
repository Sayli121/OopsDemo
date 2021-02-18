package com.valuemomentum.training.map;
import java.util.Map;
import java.util.HashMap;



public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Book2> mapBook2=new HashMap<Integer,Book2>();
		
		// TODO Auto-generated method stub
		Book2 b1=new Book2(101,"data communication","foeouzen","Mc grawl",6);

		Book2 b2=new Book2(102,"data communication","foeouzen","Mc grawl",6);

		Book2 b3=new Book2(102,"Let us c","yashwant kanetkar","bpb",7);
            mapBook2.put(1,b1);
            mapBook2.put(2,b2);
            mapBook2.put(3,b3);

       for(Map.Entry<Integer, Book2> e:mapBook2.entrySet())
       {
    	   int key=e.getKey();
    	   Book2 b=e.getValue();
    	   
    	   System.out.println("Book "+key+"Details");
    	   System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
    	   
       }
	}

}
