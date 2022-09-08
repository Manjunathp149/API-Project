package Practice;


abstract class Vehicle
{
	abstract void bike();
	abstract void car();
}

 class manju extends Vehicle
{

	@Override
	void bike() {
		System.out.println("Bike");
	
		
	}

	@Override
	void car() {
		System.out.println("car");
		
		
	}

	
	
}


public class AbstractClass {
	public static void main(String[] args) {
		manju m=new manju();	
		m.bike();
		m.car();
	}


}
