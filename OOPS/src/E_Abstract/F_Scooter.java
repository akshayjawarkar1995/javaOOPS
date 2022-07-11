package E_Abstract;


public class F_Scooter extends D_Vehicle{
	
	public static void main(String[] args) {
		
		F_Scooter s=new F_Scooter();
		s.m1();
		s.starts();
		s.Tires();
	}
	
	@Override
	public void starts () {
		
		System.out.println("Scooter starts with kick");
	}

	@Override
	public void Tires() {
		
		System.out.println("Scooter has 2 tires");
		
	}

}
