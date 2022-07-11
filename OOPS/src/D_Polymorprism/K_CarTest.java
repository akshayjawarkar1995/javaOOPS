package D_Polymorprism;

public class K_CarTest { //main method class
	
	public static void main(String[] args) {
		
	      H_Maruti M=new H_Maruti();
	      M.Start();
	      M.stop();
	      M.refuel();
	      M.Theftsafty();
	      
	      System.out.println();
	      
	      G_Car c=new G_Car();
	      c.Start();
	      c.stop();
	      c.refuel();
	      System.out.println();
	      
	      System.out.println("Top casting/dynamic polymor");
		  G_Car c1= new H_Maruti();  // Top casting/dynamic polymor
		  c1.Start();     //
		  c1.stop();
		  c1.refuel();
		  
		  System.out.println();
		   I_Static S1 = new J_StaticChild();   // Method hiding
		   S1.m1();   // Child class
		   S1.m2();     // child class 
		}


}
