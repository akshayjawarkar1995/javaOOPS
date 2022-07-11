package L_Casting;

public class E_Main {
	
public static void main(String[] args) {
		
		
//		Childclass c=new Childclass();
//		c.automatic();
		
		
		C_Superclass s = new D_Childclass();   // Upcasting
		
		s.start();
		s.Stop();
		s.Refule();
		
		
		//syntax for downcasting
	//	D_Childclass c = (D_Childclass) new C_Superclass();  // downcasting
			
	}

}
