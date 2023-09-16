package print_Pattern;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	static void pattern(int num) {
		int i=1;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(i+++" ");
			}
			System.out.println();
		}
	}

}
