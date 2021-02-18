
public class ContactNo {
	 void createContact(String name,long num)
	 {
		 
		
		 System.out.println("Name: "+name+" " +"number "+num);
	}
	 

	 void createContact(String name,long num1,long num2)
	 {
		 System.out.println("name: "+name +" "+"number1: "+num1+ "number2: "+num2);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ContactNo obj=new ContactNo();
    obj.createContact("sayli", 9754875744l);
    obj.createContact("sayli", 4456789056l, 4675849405l);
    
	}

}
