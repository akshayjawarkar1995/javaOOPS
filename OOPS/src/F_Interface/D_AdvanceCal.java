package F_Interface;

public class D_AdvanceCal implements B_Calculator,C_Casio{
	/* this is implementation class in which we are 
		going to complete incomplete interface methods*/

	@Override
	public void addition()  {
		
		System.out.println("i am in addition method");
	}
	@Override
	public void Substraction() {	
		
		System.out.println("i am in sub method");
	}
	@Override
	public void multiplication() {
		
		System.out.println("i am in mul method");
	}

	@Override
	public void log() {
		System.out.println("Casio interface : log");
		
	}
	@Override
	public void Tan() {
	System.out.println("Casio interface : Tan");
		
	}
	public void cos() {
		System.out.println("AdvanceCal class : Cos");
	}
	public void sin() {
		System.out.println("AdvanceCal class : Tan");
	}
	
	public static void main(String[] args) {// main method
		
		D_AdvanceCal AC =new D_AdvanceCal ();
		AC.addition();
		AC.Substraction();
		AC.multiplication();
		AC.log();
		AC.sin();
		AC.Tan();
	}

}
