package recursion;

import java.util.ArrayList;

public class Mobile_Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subseq("","12"));

	}
	static ArrayList<String> subseq(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit=up.charAt(0)-'0';
		ArrayList<String> list=new ArrayList<>();
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			list.addAll(subseq(p+ch,up.substring(1)));
		}
		return list;
		
	}
	

}
