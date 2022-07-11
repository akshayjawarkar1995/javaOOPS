package J_FinalConcept;

public class finalizeConcept {
	
	public static void main(String[] args) {
		
		//finalize is the method in java which is used to perform cleanup processing just 
		//before object is garbage collected.

		finalizeConcept f1 = new finalizeConcept();
		
	    f1=null;

		System.gc();
	}
	
	public void finalize() {
		
		System.out.println("finalize method executed");
	}

}