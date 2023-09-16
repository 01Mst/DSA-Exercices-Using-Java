package linked_list;

public class LL_Recursion {
	public static void main(String args[]) {
		LL_Recursion list=new LL_Recursion();
		list.insertFirst(19);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(50);
		list.insertFirst(80);
		list.insertRec(100, 2);
		list.display();
	}
	private Node head;
	private Node tail;
	 
	private int size;
	public LL_Recursion() {
		this.size=0;
	}
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(node==tail) {
			tail=head;
		}
		size=size+1;
	}
	public void insertRec(int value, int index) {
		head=insertRec(value, index, head);
	}
	private Node insertRec(int value, int index, Node node) {
		if(index==0) {
			Node temp=new Node(value, node);
			size++;
			return temp;
		}
		node.next=insertRec(value, index-1, node.next);
		return node;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
	}
	
	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			this.value=value;
		}
		public Node(int value, Node next) {
			this.value=value;
			this.next=next;
		}
	}
}
