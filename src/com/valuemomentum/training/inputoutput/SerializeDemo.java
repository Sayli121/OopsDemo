package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.name="Michel khan";
		e.address="Castle street,Banglore";
		e.SSN=114343;
		e.number=101;
		try {
			FileOutputStream fileOut = new FileOutputStream("c:/test/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in c:/test/employee.ser");
			
		}
		catch(IOException i) {
			i.printStackTrace();
			
		}

	}

}
