package recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1,45,67,789,120};
		arr=mergesort1(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] mergesort1(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergesort1(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mergesort1(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left,right);
	}
	static int[] merge(int[] first, int[] second) { 
		int []mix= new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length&&j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
	}

}
