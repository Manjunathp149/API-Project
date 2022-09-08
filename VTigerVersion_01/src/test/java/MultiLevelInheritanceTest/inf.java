package MultiLevelInheritanceTest;


class splendor {
//int a=50000;
void Bike()
{
	System.out.println("Bike price is");
}
}

 class alto extends splendor {
	// int b=450000;
	 	void car()
	 	{
	 		super.Bike();
	 		System.out.println("The car price is:");
	 	}
	 }
 
  class benz extends alto{

	//	int b=100000;
		void truck()
		{
			super.car();
			System.out.println("The truck price is:");
		}
	}
  
 class inf {

	public static void main(String[] args) {
		benz b=new benz();
		b.truck();
				
	}
}
