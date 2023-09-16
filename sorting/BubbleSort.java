package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,45,67,3,2567,19};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void sort(int arr[]) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
		//	swapped=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			//if(swapped==false) {
			//	break;
			//}
		}
	}

}
