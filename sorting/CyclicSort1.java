package sorting;

import java.util.Arrays;

public class CyclicSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {3,5,2,1,0};
			int ans=sort(arr);
			System.out.println(ans);
	}
		static int sort(int[] arr) {
			int i=0;
			while(i<arr.length) {
				int correct=arr[i];
				if(arr[i]<arr.length&&arr[i]!=arr[correct]) {
					swap(arr,i,correct);
				}else {
					i++;}}
			for(int index=0;index<arr.length;index++) {
				if(arr[index]!=index) {
					return index;
				}
				
			}
			return -1;
			}
			static void swap(int arr[],int first, int second) {
				int temp=arr[first];
				arr[first]=arr[second];
				arr[second]=temp;

	}

}
