package sorting;

public class CycleSortDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,2,4,3,3};
		int ans=sort(arr);
		System.out.println(ans);

	}
	static int sort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i) {
				int correct=arr[i];
				if(arr[i]!=arr[correct]) {
			 		swap(arr,i,correct);
				}else {
					return arr[i];
			}}else{i++;}}
				return -1;
			}
			static void swap(int arr[], int first, int second) {
				int temp=arr[first];
				arr[first]=arr[second];
				arr[second]=temp;
			}
		
	}

