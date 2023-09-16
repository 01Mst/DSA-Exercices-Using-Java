package recursion;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,3,5,6,7};
		int search=7;
		int index=0;
		System.out.println(search(arr,index,search));
		

	}
	static boolean search(int arr[], int index,int search) {
		if(index==arr.length) {
			return false;
			}
		if (arr[index]==search){
			return true;
			
		}
		
		return search(arr,index+1,search);
	}}
/*	static boolean search(int arr[], int index,int search) {
		if(arr[index]==search) {
			return true;
			
		}
		return arr[index]!=search&&search(arr,index+1,search);
	}
}*/


