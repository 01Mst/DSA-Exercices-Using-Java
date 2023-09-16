package print_Pattern;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 pattern(5);
	}
	static void pattern(int num) {
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=num+1-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
