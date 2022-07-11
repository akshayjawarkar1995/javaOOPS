package D_Polymorprism;

public class C_Moverloading {
	
	public static void main(String[] args) {
	    
		C_Moverloading Mo=new C_Moverloading();
		Mo.addition(15, 10);  //25
		Mo.addition(20, 10 ,5);
		C_Moverloading.m1(); // direct calling
		C_Moverloading.m1(30); // direct calling
	}
  public void addition(int i,int j) {
	  int sum=i+j;
	  System.out.println(sum);
  }
  public void  addition(int i,int j,int k) {
	  int sum =i+j-k;
	  System.out.println(sum);
  }
  public static void m1() {
	  System.out.println("Zero argument static method");
  }
  public static void m1(int i) {
	  System.out.println("One i/p static method");
  }

}
