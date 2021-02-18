abstract class Animal5{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat.");
	}
}
   class Dog3 extends Animal5{
	// provide implememtation of abstract method
	public void makesound() {
		System.out.println("Bark Bark");
		
	}

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}
}




public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Dog3 d1=new Dog3();
 d1.makesound();
 d1.eat();
	}

}
