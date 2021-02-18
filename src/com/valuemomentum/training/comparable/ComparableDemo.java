package com.valuemomentum.training.comparable;
import java.util.ArrayList;

import java.util.Collections;

public class ComparableDemo {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student>al=new ArrayList<Student>();
al.add(new Student(111,"john",29));
al.add(new Student(222,"john",21));
al.add(new Student(555,"john",26));
Collections.sort(al);
for(Student st:al);
	System.out.println(st.rollno+" "+st.name+" "+st.age);

	}

}
