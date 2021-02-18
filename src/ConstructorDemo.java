
public class ConstructorDemo {
     int id;
     
     ConstructorDemo()  // default constructor
     {
    	 System.out.println("In constructor");
    	 id=10;
     }
     void display()
     {
    	 System.out.println(id);
     }
     
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj1=new ConstructorDemo();
		ConstructorDemo obj=new ConstructorDemo();
		obj1.display();
		
		
		

	}

}
