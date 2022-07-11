package D_Polymorprism;

public class D_mainmethodoverload {
	
	/*we can overload the main method but 
	 * if String argument is present then compiler will only call main method 
	 * with string argument
	 */
	
	public static void main(String[] args) {
		D_mainmethodoverload mm=new D_mainmethodoverload();
		mm.m1();
		mm.m2();
	}
	
  	public static void main(int[]args){
		
  		D_mainmethodoverload mn1=new D_mainmethodoverload();
	  mn1.m1();
	  mn1.m2();
	}
	public void m1() {
		System.out.println("M1 method");
	}
	public void m2() {
		System.out.println("M2 method");
	}

}
