package J_FinalConcept;

public class A_finalconcept {
	
public static void main(String[] args) {
		
		
		/*fianl - final is the keyword and access modofier which is used to restrications on  avariables 
		,class and methods
		Final clss can not be inherited to child class.
		Final method means can not be overriden by sub class
		once we declare as a final variable we can not be modofied.
		*/
				
		int i=100;
		System.out.println(i);
		i=200;
		System.out.println(i);
		
		final int j=300;
		System.out.println(j);
		//j=400;
	}
	public  void finalmethod() {
		System.out.println("Final method");
	}


}
