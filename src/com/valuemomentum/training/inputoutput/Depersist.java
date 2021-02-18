package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/test/f.txt"));
Student s=(Student)in.readObject();
System.out.println(s.id+" "+s.name);
in.close();
	}

}
