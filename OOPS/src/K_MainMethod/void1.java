package K_MainMethod;

public class void1 {
	
	public static void main(String[] args) {
		
		int num= addition(20,40);
		 System.out.println(num);
		
	}
	
	public static int addition(int a,int b) {
		
		int sum = a+b;
		System.out.println(sum);
		
		return sum;
		/*If u want a method to return a value, you can a primitive data types such int ,char etc)
		insted of void  and use return keyword inside the method.*/
		
	}
	public static void m1() {
		
		System.out.println(addition(10,30));
	}

}
