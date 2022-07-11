package E_Abstract;

public class C_concrete extends A_Incomplete_Class{
	
	
	public static void main(String[] args) {//main method
		
		C_concrete s=new C_concrete();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
	}
	
	
	//this is a concrete class where we are going to complete incomplete method
	public void m2() {
		System.out.println("Complete method");
			
		}	
	
		public void m3() {
		System.out.println("Complete method");
			
		}
		
		public void m4() {
			System.out.println("M4 Method");
		}

}