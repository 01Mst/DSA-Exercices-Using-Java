package binary_search;

public class Bs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letters[]= {'a','g','j','m','p','y'};
		char target='y';
		char ans=binarysearch(letters, target);
		System.out.println(ans);
		

	}
 static char binarysearch(char letters[], char target) {
	 int start=0;
	 int end=letters.length-1;
	 while(start<=end) {
		 int mid=start+(end-start)/2;
		 if(target<letters[mid]) {
			 end=mid-1;
		 }else {
			 start=mid+1;
		 }
	 }
	 return letters[start%letters.length];
 }
}
