package math;
import java.util.ArrayList;

public class Factors_O_ofSqrt_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> list=new ArrayList<>();
      int num=10;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				if(num/i==i) {
					System.out.println(i+" ");
				}else {
			System.out.print(i+" ");
			list.add(num/i);
	}}}
				for(int i= list.size()-1; i>=0;i--) {
					System.out.print(list.get(i)+" ");
				}		}}
