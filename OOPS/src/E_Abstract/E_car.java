package E_Abstract;

public class E_car extends D_Vehicle{
	
	public static void main(String[] args) {
		
		E_car c = new E_car ();
		
		c.m1();
		c.starts();
		c.Tires();
	}

	@Override
	public void starts() {/* this is a incomplete method from vehicle class
							which we are completed in this class */
		
		System.out.println("Car is starts with key");
	}

	@Override
	 public void Tires() { /* this is a incomplete method from vehicle class
	 						which we are completed in this class */
		 
		System.out.println("Car ha 4 tires");
		
	}

}
