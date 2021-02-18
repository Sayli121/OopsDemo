import java.util.Scanner;
public class Person {
	private String name;
    private int age;
    private String constituency;
    Scanner s;
     
    Person(String n,int a) //default condtructor
    {
    	name=n;
    	age=a;
        
    }
     Person() {
		// TODO Auto-generated constructor stub
    	System.out.println("Voter  Eligibility app");
    	age=0;
    	name=" ";
    	constituency="Bengaluru";
    	s= new Scanner(System.in);

    	
	}
	 public void input() {
        System.out.println("Enter Your Name:");
       name=s.next();
       System.out.println("Enter Your age:");
        age=s.nextInt();
       }
    public void print()
      {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Constituency is: " + constituency);
        }

    
    
    
  
    	
    	
    
    

}
