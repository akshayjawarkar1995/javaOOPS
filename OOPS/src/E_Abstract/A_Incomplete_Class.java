package E_Abstract;

public abstract class A_Incomplete_Class {


	//this is a complete method with method body
	public void m1() {
		System.out.println("Method m1 is completed in an abstract clss");
	}  
	
	// this is a incomplete method
	//we add "abstract" keyword to define incomplete method in abstract class
	//incomplete method does not have method body
	public abstract void m2();
	public abstract void m3();

}
