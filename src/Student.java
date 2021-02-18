import java.util.Scanner;

class StudentInfo      //class declaration
{
	           //define properties
	String name,course;
	int rollno,marks;
	
	
	
	//define methods
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name,rollno course and marks");
		
		name=s.next();
		rollno=s.nextInt();
		course=s.next();
		marks=s.nextInt();

	}
	void sort()
	
	{
	
	}
	
	
	void display()
	{
		

		System.out.println(" Name of student : "+name);
		System.out.println(" Roll no         : "+rollno);
		System.out.println(" course          : "+course );
		System.out.println(" marks           : "+marks);
		
	}
		
	}

public class Student {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		{
			StudentInfo  s1=new StudentInfo (); //defining object
			StudentInfo s2=new StudentInfo ();
			StudentInfo  s3=new StudentInfo ();
			
			s1.input();    //method call
			s2.input();
			
					
		}

	}

}
