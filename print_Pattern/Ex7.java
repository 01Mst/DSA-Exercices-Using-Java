package print_Pattern;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(10);
	}
	static void pattern(int num) {
		for(int row=1;row<=2*num;row++) {
			int totalcolsinrow=row>num?2*num-row:row;
			int spaces=num-totalcolsinrow;
			for(int s=1;s<=spaces;s++) {
				System.out.print(" ");
			}
			for(int col=1;col<=totalcolsinrow;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
