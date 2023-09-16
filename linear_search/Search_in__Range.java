package linear_search;

public class Search_in__Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int target=4;
		int start=1;
		int end=4;
		System.out.println(searchrange(arr,target,start,end));
		}
	static boolean searchrange(int arr[],int target,int start, int end) {
		if(arr.length==0) {
			return false;
		}
		for(int i=start;i<=end;i++) {
			if(target==arr[i]) {
				return true;
				
			}
		}
		return false;
	}
	

	

}
