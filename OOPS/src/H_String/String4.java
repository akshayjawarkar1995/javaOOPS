package H_String;

public class String4 {
	
public static void main(String[] args) {
		
		// Difference b/w == operator and .equal method
		
		String s1= new String("Java");
		String s2 =new String("Java");
		
		System.out.println(s1==s2);                  //-- Fasle
		System.out.println(s1.equals(s2));           //-- True
		
		String s5 ="Java";
		String s6 = "Java";
		
		System.out.println(s5==s6);               // True
		System.out.println(s5.equals(s6));        // true
		
		/* ==  always compare reference  comparison/address comparison
		ref comparison means if both ref. point into the same obj then it will give true.*/
		
		/* .equal = Content comparison means compares the two given strings based on the content of the string. 
		If any character is not matched, it returns false. If all characters are matched, it returns true.*/	
	}

}
