package linear_search;

public class Ls1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5,6,7};
		int target=1;
		System.out.println(linearSearch(num, target));
		
		}
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
	return -1;
		}
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(element==target) {
		return i;
			}
		}
		return -1;
		
	}

}
