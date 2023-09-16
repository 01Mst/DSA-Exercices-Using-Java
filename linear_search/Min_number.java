package linear_search;

public class Min_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,2,5,6,1,7,8};

	
		minnumber(a);
		
		

	}
	 static void minnumber(int a[]) {
		int min=a[0];
		
		for(int i:a) {
			if(i<min) {
				min=i;
				
				
			}
			
			
		}
		System.out.println(min);
		
	}

}
