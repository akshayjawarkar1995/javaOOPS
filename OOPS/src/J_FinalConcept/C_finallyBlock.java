package J_FinalConcept;

public class C_finallyBlock {
	
public static void main(String[] args) {
		
		/*Finally - Finally is a block in java exception handiling to execute the important code 
		weather the execution occures or not */
             test();
             div();
	}
	public static void test() {
		
		try {
			System.out.println("Test method");
		}
		catch(Exception e) {
			System.out.println("Catch block");
		}
		finally {
			System.out.println("Fianlly block");
	
		}	
	}
	
	//Arithmetic Exception handling using finally keyword
	public static void div() {
		int i=10;
		
		try {
			System.out.println("Div test method");
			int k=i/0;
		}
		catch(ArithmeticException  e) {
			System.out.println("Inside cath block");
			System.out.println("Divided by zero error");
		}
		finally {
			System.out.println("Executed this code even after any execution");
		}
		
	}

}
