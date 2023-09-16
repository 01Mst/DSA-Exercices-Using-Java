package linear_search;

public class Max_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,3,2,4,5},
				{45,24,76},
				{1,45,67}};
		int ans=max(arr);
		System.out.println("Maximum Number: "+ans);
		
		}
	static int max(int arr[][]) {
		int max=arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>max) {
					max=arr[row][col];
				}
			}
		}
		return max;
		

	}

}
