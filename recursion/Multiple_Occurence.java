package recursion;

import java.util.ArrayList;

public class Multiple_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,7,7,3,4,5,5,6,7};
		int target=7;
		int index=0;
		System.out.println(search(arr,target,index));
		}
	static ArrayList<Integer> search(int arr[], int target, int index){
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length) {
			return list;
		}
	if(arr[index]==target) {
		list.add(index);
	}
	ArrayList<Integer> idhuepdiirukkU=search(arr, target, index+1);
    list.addAll(idhuepdiirukkU);
    return list;
		}
	}
	


/*	ArrayList<Integer> list=new ArrayList();
		System.out.println(search(arr, target, index, list));
	}
	static ArrayList<Integer> search(int arr[],int target,int index,ArrayList<Integer> list) {
		if(index==arr.length) {
			return list;
			
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return search(arr,target,index+1,list);
	}
}*/
