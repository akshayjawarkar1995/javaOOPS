package G_Generalization;

public class Airtel implements SIMCard {

	public static void main(String[] args) {
		
		   Airtel A =new Airtel();
		     A.Audiocalling();
		     A.Internet();
		     A.SMS();
		     A.Hotstar();
		
		   System.out.println();
		     BSNL b=new BSNL();
		     
		     b.Audiocalling();
		     b.SMS();
		     b.Internet();
		     b.Netflix();
		     
		   System.out.println();
		     Jio j=new Jio();
				
				j.Audiocalling();
				j.Internet();
				j.SMS();
				j.AmazonePrime();
					
	}
	@Override
	public void SMS() {
		System.out.println("Airtel -- SMS");
		
	}

	@Override
	public void Audiocalling() {
        System.out.println("Airtel --AudioCalling");		
	}

	@Override
	public void Internet() {

		System.out.println("Aiterl Internt");
	}
	public void Hotstar() {
		System.out.println("Aiterl-- Hotstar");
	}

}
