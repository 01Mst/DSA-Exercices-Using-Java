package sorting;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,4,2,2,3,5,6};
		System.out.println(Arrays.toString(sort(arr)));

	}
	static int[] sort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i];
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {i++;
		}
	}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=index) {
				return new int[] {arr[index],index};
			}
		}
 return new int[] {-1,-1};
}
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
