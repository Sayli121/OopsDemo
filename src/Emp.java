
public class Emp {
	int id;
	String name;
	Address address; //aggregation
	
public Emp(int id,String name,Address address)	
{
	this.id=id;
	this.name=name;
	this.address=address;

	}
	
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+ address.state+ " " +address.country);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("Banglore","Karnataka","India");
		Address address2=new Address("Mumbai","Maharashtra","India");
		Emp e1=new Emp(111,"varun",address1);
		Emp e2=new Emp(112,"singh",address2);
		
		e1.display();
		e2.display();
		
		

	}

}
