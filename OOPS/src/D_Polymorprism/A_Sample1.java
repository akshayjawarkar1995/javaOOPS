package D_Polymorprism;

public class A_Sample1 {
	
	public static void main(String[] args) {
		A_Sample1 s=new A_Sample1();
		//s.m1();	
		s.demo();
	}
	public void m1() {
		System.out.println("Non static method");
	}
	public void demo() { //run time error
		int i=10;
		int j=0;
		int k=i/j;
		System.out.println(k);
	}

}
