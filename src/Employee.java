
	import java.util.Scanner;

	class Employee   // Instance class
	{
	  int emp_Id;          //properties
	  String emp_Name,dept;
	  float basic,hra,tax,totalSal;
	  Scanner s;

	  // methods
	 void input()
	  {
	    s=new Scanner(System.in);
	    System.out.println("Enter Employee Id, Name , Department & Basic Salary");
	    emp_Id=s.nextInt();
	    emp_Name=s.next();
	    dept=s.next();
	    basic=s.nextFloat();
	   }

	   float calculateSal()
	   {
	     hra=basic*.10f;
	     tax=basic*.5f;
	     totalSal=(basic+hra)-tax;
	     return totalSal;
	   }
	   
	   public static void main(String [] args) 
	   {
		   Employee e1=new Employee(); // Object Declaration
		   Employee e2=new Employee();

		   e1.input();    // method call
		   //float s=e1.CalculateSal();
		   e1.calculateSal();
		 //  e1.display();
		  // System.out.println("The total salary displayed from class: "+s);

		   e2.input();
		   float s1=e2.calculateSal();
		 //  e2.display();
		   System.out.println("The total salary displayed from Main: "+s1);		   
	   }


}
