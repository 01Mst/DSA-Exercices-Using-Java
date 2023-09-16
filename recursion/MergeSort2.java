package recursion;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,45,32,49,76};
		merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	static void merge(int arr[], int start, int end) {
		if(end-start==1) {
			return;
		}
		int mid=(start+end)/2;
		merge(arr, start, mid);
		merge(arr, mid, end);
		
		mergeinplace(arr,start,mid,end);
	}
	static void mergeinplace(int arr[], int start, int mid, int end) {
		int mix[]=new int [end-start];
		int i=start;
		int j=mid;
		int k=0;
		while(i<start&&j<end) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
			}else {
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<start) {
			mix[k]=arr[i];
			i++;
			k++;
			}
		while(j<start) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;j<mix.length;l++) {
			arr[start+l]=mix[l];
		}
		
	}

}
