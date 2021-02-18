
public class Calculate {

	void sum() {
		System.out.println("method overloading");
	}
	void sum(int a,int b)
	{
		System.out.println("sum is "+(a+b));
	}
	void sum(float a,float b) 
	{
		System.out.println("sum is "+(a+b));
	}
	void sum(String a,String b) 
	{
		System.out.println("sum is "+(a+b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculate cal=new Calculate();
    cal.sum();
    cal.sum(3, 6);
    cal.sum(5.6f ,4.6f);
    cal.sum("hello", "world");
	}

}
