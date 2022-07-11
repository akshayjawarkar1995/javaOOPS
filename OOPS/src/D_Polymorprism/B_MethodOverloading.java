package D_Polymorprism;

public class B_MethodOverloading {
	
	/*Method overloading  - When the method name is same with different argument or input parameter with different
	data within the same class is called as method overloading */
	
	public void m1() {
		System.out.println("No argument method");
	}

	public void m1(int a) {
		System.out.println("int argument method");
	}
	public void m1(long j) {
		System.out.println("Long argument method");
	}
	public void m1(double d) {
		System.out.println("Double argument method");	
	}
   public static void main(String[] args) {
	   	  	
	   B_MethodOverloading Mo=new B_MethodOverloading();     
	   Mo.m1();
	   Mo.m1(10);
	   Mo.m1(14.5);
	   Mo.m1(222224444l);
	}	

}
