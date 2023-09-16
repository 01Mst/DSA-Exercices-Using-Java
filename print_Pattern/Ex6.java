package print_Pattern;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}
	static void pattern(int num) {
		for(int row=1;row<=2*num;row++) {
			int totalcolsinrows=row>num?2*num-row:row;
			for(int col=1;col<=totalcolsinrows;col++) {
				System.out.print("*");
		}
			System.out.println();
	}

	}}
