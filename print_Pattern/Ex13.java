package print_Pattern;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class Ex12 {
//ated method stub
	  pattern(4);
		}
		static void pattern(int num) {
			int org=num;
			num=2*num-1;
			for(int row=0;row<num;row++) {
				for(int col=0;col<num;col++) {
					int ateveryindex=org-Math.min(Math.min(row,col),Math.min(num-col-1, num-row-1));
					System.out.print(ateveryindex+" ");
					}
				System.out.println();
			}
		}

	


	}


