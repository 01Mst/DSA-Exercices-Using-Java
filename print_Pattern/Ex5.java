package print_Pattern;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	static void pattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
