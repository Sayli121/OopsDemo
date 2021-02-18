import java.util.Scanner;

class Trainee         //class declaration
{
	int tId;           //define properties
	String tName;
	String technology;
	float salary,stipend;
	
	//define methods
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id,Name,technology and Salary");
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();

	}
	
	float calculate()
	{
		stipend=salary-200;
		return stipend;
		
	}
	
	void display()
	{
		System.out.println("*******Trainee Details********");
		System.out.println(" Trainee Id   : "+tId);
		System.out.println(" Trainee Name : "+tName);
		System.out.println(" Technology   : "+technology);
		//System.out.println(" salary       : "+salary);
		
	}
		
	}

public class TestTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Trainee t1=new Trainee(); //defining object
			Trainee t2=new Trainee();
			
			t1.input();    //method call
			t2.input();
			
			float s1=t1.calculate();
			float s2=t2.calculate();
			
			
			t1.display();
			System.out.println("stipend   : "+s1);
			
			t2.display();
			System.out.println("stipend   : "+s2);
			
		}

	}

}
