package linked_list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	LL list=new LL();
		//list.insertLast(1);
		//list.insertLast(2);
		//list.insertLast(2);
		///list.insertLast(3);
		//list.display();
       // System.out.println(list.deleteFirst());
		//list.rem_dup();
       // list.display();
     //   System.out.println(list.deleteLast());
       // list.display();
		LL first=new LL();
		LL second=new LL();
		first.insertFirst(1);
		first.insertFirst(2);
		first.insertFirst(3);
		
		second.insertFirst(1);
		second.insertFirst(2);
		second.insertFirst(9);
		second.insertFirst(14);
		first.display();
		second.display();
		System.out.println();
		LL ans=LL.merge(first, second);
		ans.display();
	}

}
