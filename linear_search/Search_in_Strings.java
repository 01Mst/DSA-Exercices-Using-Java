package linear_search;

public class Search_in_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Thulasimani";
		char target='o';
		System.out.println(searchstring(name, target));
		

	}
static boolean searchstring(String name, char target) {
	if(name.length()==0) {
		return false;
	}
	for(char ch:name.toCharArray()) {
		if(target==ch) {
		return true;
		
		}
}
	return false;
}
}
