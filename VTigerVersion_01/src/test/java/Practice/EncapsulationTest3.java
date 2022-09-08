package Practice;



	class Bank {
		private int Atm=1234;

		public int getAtm() {
			return Atm;
		}

		public void setAtm(int atm) {
			Atm = atm;
		}

		
	}
		public class EncapsulationTest3 {
		
		public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.getAtm());
		b.setAtm(4584);
		System.out.println(b.getAtm());
		}
	}
	

