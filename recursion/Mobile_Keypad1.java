package recursion;

public class Mobile_Keypad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 per("","12");
	}
 static void per(String p, String Up) {
	 if(Up.isEmpty()) {
		 System.out.println(p);
		 return;
	 }
	 int digit=Up.charAt(0)-'0';
	 for(int i=(digit-1)*3;i<digit*3;i++) {
		 char ch=(char) ('a'+i);
		 per(p+ch,Up.substring(1));
	 }
 }
}
