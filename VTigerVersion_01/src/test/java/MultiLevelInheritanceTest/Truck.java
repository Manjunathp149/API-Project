package MultiLevelInheritanceTest;

public class Truck extends Car{

	int b=100000;
	void truck()
	{
		super.car();
		System.out.println("The truck price is:"+b);
	}
}
