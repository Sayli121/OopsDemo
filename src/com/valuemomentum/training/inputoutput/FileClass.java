package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("hello.txt");
try {
	
	
	if(f.createNewFile())
	{
		System.out.println("New file created");
	}
	else 
	{
		System.out.println("The file alreay exists");
	}
}
catch(IOException e) {
	e.printStackTrace();
}

System.out.println("Name of the file: "+f.getName());
System.out.println("Path of file: "+f.getPath());
System.out.println("FIle last modified: "+new Date(f.lastModified()));
System.out.println("Parent Directory: "+f.getParent());
System.out.println("size of file: "+f.length()+"Bytes");


	}

}
