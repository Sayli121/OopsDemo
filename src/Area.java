import java.util.Scanner;
public class Area {
	float length,breadth,area;
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		
		length=s.nextInt();
		breadth=s.nextInt();
		
		
	}
	void cal() {
		area=length*breadth;
	}
	
	void display() {
		System.out.println("area: "+area);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     Area a1=new Area();
     Area a2=new Area();
     a1.input();
     a1.cal();
     a1.display();
     
     
     
	}

}
