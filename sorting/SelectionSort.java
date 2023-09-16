package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,3,5,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int max=getmaxIndex(arr,0,last);
			swap(arr,max,last);
		}
	}
	static void swap(int arr[], int first,int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
	static int getmaxIndex(int arr[],int start,int last) {
		int max=start;
		for(int i=start;i<=last;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
		
	}