package com.valuemomentum.training.collections;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<String> s=new Stack<String>();
  s.push("java");
  s.push("c++");
  s.push("c#");
  s.push("python;");
  
  System.out.println(s);
  s.pop();
  Iterator<String> itr=s.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
		System.out.println("peek" +s.peek());
	}

}
