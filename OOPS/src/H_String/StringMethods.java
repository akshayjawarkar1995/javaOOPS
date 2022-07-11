package H_String;

public class StringMethods {

	public static void main(String[] args) {
		
		//1. CharAt  - it returns char value for the particular index
		
		String s1="Velocity";
		System.out.println("Index :"+s1.charAt(3));
		//System.out.println(s1.charAt(5));
		
		//2. length();  - it return string length/size   
		System.out.println("String Length :"+s1.length());
		
		//3. equal  - it check the equality of string with gievn object.
		String s2="Velocity";
		String s3="Velocity";
		String s4=new String("Velocity");
		System.out.println(s2.equals(s3));  // True
		System.out.println(s2.equals(s4));  // True
		
		//4. isempty  - To check weather the string is empty or not
		 String s5="Java";
		 System.out.println(s5.isEmpty());  // false
		 String s6="";
		 System.out.println(s6.isEmpty());
		 
		 //5.Replace
		 String s7="Velocity";
		 System.out.println(s7.replace('e', 'R'));
		 System.out.println(s7.replace('l', 'D'));
		 
		 String s8="04-05-2020";
		 System.out.println(s8.replace("-", "/"));
		 
		 //6. Replace all
		 String s9 ="Python Java class";
		 System.out.println(s9.replaceAll("Java", "Ruby"));
		 System.out.println(s9.replaceAll(" ", ""));
		 
		 //7.Substring  - It returns substring for given string
		   //start index is included and end index is excluded
		 String s10="Velocity Classes";
		 System.out.println(s10.substring(4, 8));
		 System.out.println(s10.substring(2));
		 System.out.println(s10.substring(9, 14));
		 
		 //8.index of char - to find char at particular index
		 String s11="Pythtn tuby Python";
		 System.out.println("Index : "+s11.indexOf('t'));  //1st occurrence
         System.out.println("Index : "+s11.indexOf('t',s11.indexOf('t')+1));  // 2nd occurrence
         System.out.println("Index : "+s11.indexOf('t',s11.indexOf('t',s11.indexOf('t')+1)+1)); // 3rd  occurance
		 
		 //9.Lastindexof
         String s12="Python";
         System.out.println(s12.lastIndexOf('n'));
         
         //10.ToLowercase
         String s13="WELCOME";
         System.out.println(s13.toLowerCase());

         //11. To uppercase
         String s14 ="welcome";
         System.out.println(s14.toUpperCase());
         
        //12. trim - It removes begining and ending spaces of the string.
         String s15="  Good Morning   ";
         System.out.println(s15.trim());
         
        // 13. Split 
         String s16 ="Hello/world/Test/Selenium";
        // System.out.println(s16.split("/"));   // Wrong
         
           String s17[] =s16.split("/");
           for(int i=0;i<s17.length;i++) {
        	   System.out.println(s17[i]);
        	   
           }
           String s18= "Good Morning";
           
                   String s19[]=s18.split(" ");
                   for(int i=0;i<s19.length;i++) {
                	   System.out.println(s19[i]);
                   }
                
             String s20= "14-05-1994"; 
                String []s21=s20.split("-");
                for(int i=0;i<s21.length;i++) {
                	System.out.println(s21[i]);
                }
           
      //14. Concat - It concatenates the specified string.
            String S22="Hello";
            System.out.println(S22.concat("Java"));
            
            String x = "Hello";
            String y = "World";
            
            int a=10;
            int b=20;
            
            System.out.println(x+y);      //HelloWorld
            System.out.println(a+b);       //30
            System.out.println(x+y+a+b);   //Helloworld1020
            System.out.println(a+b+x+y);    //30Helloworld
            System.out.println(x+y+(a+b));   // HelloWorld30
            
         //15. Reverse String 
            StringBuffer sb=new StringBuffer("Selenium");
            sb.reverse();
            System.out.println(sb);
                  
	}
}
