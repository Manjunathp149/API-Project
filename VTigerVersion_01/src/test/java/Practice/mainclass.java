package Practice;



	interface Access
	{
		 void bike();
		 void car();
	}

	class Vehicles implements Access
	{

		public void bike() {
			System.out.println("Hiii");
			
		}

		public void car() {
			System.out.println("Byeeee");
			
		}
		
	}

	class mainclass
	{
	public static void main(String[] args) {
		Vehicles v=new Vehicles();
		v.bike();
		v.car();
	}
	}
