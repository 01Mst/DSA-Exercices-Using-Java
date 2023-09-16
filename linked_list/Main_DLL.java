package linked_list;

public class Main_DLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL list=new DLL();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.display();
		list.insertLast(1000);
		list.display();
		list.insert(1, 19);
		list.display();

	}

}
