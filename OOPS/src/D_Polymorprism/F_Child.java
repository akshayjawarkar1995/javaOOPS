package D_Polymorprism;

		//method override

public class F_Child extends E_Parent {

	@Override
	public void money() {	
		System.out.println("Money : 2lakh");
	}
	@Override
	public void Car() {
		System.out.println("Car : Tata");
	}
	@Override
	public void m1() {
		System.out.println("Child Non static metho :m1");
	}
	public void mobile() {
		System.out.println("Mobile -- iphone");
		
	}
	public void m2() {
		System.out.println("Child Non static metho :m1");
	}
	
	//main method
    public static void main(String[] args) {
    	E_Parent p=new E_Parent();
    	p.home();   //2BHK   // static
    	p.m1();
    	p.Car();
    	p.money();
  
    	System.out.println();
    	
    	F_Child c=new F_Child();
    	c.Car();
    	c.home();
    	c.mobile();
    	c.money();
    	
    	System.out.println();
    	
      E_Parent p1 = new F_Child();    // Top casting /dynamic poly
        p1.Car();
        p1.m1();
      //p1.money();
        p1.home();
        
        //syntax of downcasting
       // F_Child c1 =(F_Child)new E_Parent(); //down casting which is not allowed or used 
  
	}

}
