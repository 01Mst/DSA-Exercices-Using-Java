package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,10,6,7,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}
	static void swap(int arr[],int first,int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

}
