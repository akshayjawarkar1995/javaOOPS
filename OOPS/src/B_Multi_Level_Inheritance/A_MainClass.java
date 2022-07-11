package B_Multi_Level_Inheritance;

public class A_MainClass {
	
	public static void main(String[] args) {
		
		WhatsAppV1 v1=new WhatsAppV1();
		v1.TextMsg();
		
		WhatsAppV2 v2 = new WhatsAppV2();
		v2.AudioCalling();
		
		WhatsAppV3 v3 = new WhatsAppV3();
		v3.VideoCalling();
		
	}
	
}
