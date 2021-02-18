package com.valuemomentum.training.collections;
import java.util.ArrayList;
import java.util.ListIterator;




public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>al=new ArrayList<String>();
		al.add("jim");
		al.add("jerry");
		al.add("john");
		al.add(1,"jim");
		System.out.println("element at 2nd position:"+al.get(2));
		
		ListIterator<String>itr=al.listIterator();
		System.out.println("traversing elements in forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		
		
	}

	}}
