package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Student s1=new Student(101,"John");
    
    FileOutputStream fout=new FileOutputStream("c:/test/f.txt");
    ObjectOutputStream out=new ObjectOutputStream(fout);
    
    out.writeObject(s1);
    out.flush();
    System.out.println("success");
	}

}
