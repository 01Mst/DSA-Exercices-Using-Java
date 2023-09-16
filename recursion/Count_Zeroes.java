package recursion;

public class Count_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count0(101010100));

	}
	static int count0(int num) {
		return helper(num,0);
	}
	static int helper(int num, int count) {
		
		if(num==0) {
			return count;
		}
		int rem=num%10;
		
		if(rem==0) {
			return helper(num/10,count+1);
		}
		return helper(num/10,count);
	}
		
		}

