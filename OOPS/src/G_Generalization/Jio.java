package G_Generalization;

public class Jio implements SIMCard{

	public static void main(String[] args) {
		Jio j=new Jio();
		
		j.Audiocalling();
		j.Internet();
		j.SMS();
		j.AmazonePrime();
		
	}

	@Override
	public void SMS() {
         System.out.println("Jio --SMs");		
	}

	@Override
	public void Audiocalling() {
     System.out.println("Jio-- AudioCalling");		
	}
  
	@Override
	public void Internet() {
         System.out.println("Jio -- Internet");		
	}
	public void AmazonePrime()
	{
		System.out.println("Jio-- Amazone prime");
	}

}
