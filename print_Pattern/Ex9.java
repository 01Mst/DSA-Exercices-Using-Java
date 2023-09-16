package print_Pattern;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	static void pattern(int  num) {
		for(int row=1;row<=num;row++) {
			for(int space=1;space<=num-row;space++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
