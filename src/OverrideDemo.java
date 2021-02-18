class Bank{
	int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}

}
class ICICI extends Bank{
	int getRateOfInterest() {return 6;}

}
class Axis extends Bank{
	int getRateOfInterest() {return 5;}

}


public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SBI s=new SBI();
  ICICI i=new ICICI();
  Axis a=new Axis();
  System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
  System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
  System.out.println("Axix Rate of Interest: "+a.getRateOfInterest());

	}
	

}
