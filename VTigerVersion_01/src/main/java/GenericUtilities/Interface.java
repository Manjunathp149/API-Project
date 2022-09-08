package GenericUtilities;

 interface bikooo {
	 void bike();
	 void car();
}

class Vehicles implements bikooo
{

	public void bike() {
		System.out.println("Bike");
		
	}

	public void car() {
		System.out.println("car");
		
	}
	
}

class Interface
{
public static void main(String[] args) {
	Vehicles v=new Vehicles();
	v.bike();
	v.car();
}
}
