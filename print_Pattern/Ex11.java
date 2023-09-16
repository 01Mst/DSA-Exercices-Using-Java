package print_Pattern;

public class Ex11 {

	public static void main(String[] args) {
pattern(5);		// TODO Auto-generated method stub

	}
	static void pattern(int num) {
		for(int row=1;row<=2*num;row++) {
	     int colsinrow=row>num?2*num-row:row;
	     int spaces=num-colsinrow;
	     for(int s=1;s<=spaces;s++) {
	    	 System.out.print(" ");
	     }for(int col=colsinrow;col>=1;col--) {
	    	 System.out.print(col);
	     }for(int col=2;col<=colsinrow;col++) {
	    	 System.out.print(col);
	     }
	     System.out.println();
			
		}
	}

}
