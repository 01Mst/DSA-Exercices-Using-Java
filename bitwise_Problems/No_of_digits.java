package bitwise_Problems;

public class No_of_digits{
	public static void main(String args[])
	{
	int a=20;
	int count=0;
	while(a>0){
		count++;
		a=a>>1;
		
		
	}
	System.out.println(count);

}}
