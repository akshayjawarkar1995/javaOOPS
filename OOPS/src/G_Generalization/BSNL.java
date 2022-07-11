package G_Generalization;

public class BSNL implements SIMCard{

	public static void main(String[] args) {
     BSNL b=new BSNL();
     
     b.Audiocalling();
     b.SMS();
     b.Internet();
     b.Netflix();
  
	}

	@Override
	public void SMS() {
	 System.out.println("BSNL -- SMS");
	}

	@Override
	public void Audiocalling() {
    System.out.println("BSNL -- Audiocalling");		
	}

	@Override
	public void Internet() {
        System.out.println("BSNL -- Internet");		
	}
	public void Netflix() {
		System.out.println("BSNL -- Netflix");
		
	}

}
