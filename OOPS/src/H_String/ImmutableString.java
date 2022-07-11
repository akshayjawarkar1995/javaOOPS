package H_String;

public class ImmutableString {
	
	public static void main(String[] args) {
		
		String s1= "Java";
		String s2= "Java";
		
		
		/*Once we create an object after that java does not allow to perform changes.
		But if u trying to perform any changes with those changes new object will be created.*/
		
		s2="Python";
		String s3 ="Ruby";
		System.out.println(s1);
		
		
		//2.Security
		//3.Code optimization and performance

}
}