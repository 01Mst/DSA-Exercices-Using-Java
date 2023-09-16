package linear_search;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=19;
boolean ans=isHappy(n);
System.out.println(ans);
	}
	public static boolean isHappy(int n) {
        int ans=0;
        int abs=n;
        
       ans=repeat(n);
      while(ans!=abs) {
    	  ans=repeat(ans);
      }
    	
    
       
		return true;
  }
   public static int repeat(int n){
       int ans=0;
       int temp=n;
         while(n!=0){
                 temp=n%10;
                 ans+=Math.pow(temp,2);
                 n=n/10;
        }
        return ans;
        }

}

