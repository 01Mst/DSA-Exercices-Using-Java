package linked_list;

public class Mail_CLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLL list=new CLL();
		list.insert(12);
		list.insert(24);
		list.insert(36);
		list.insert(45);
		list.insert(80);
		list.display();
		list.delete(45);
		list.display();

	}

}
