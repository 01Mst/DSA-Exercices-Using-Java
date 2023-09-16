 package linked_list;

public class RemoveDup_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDup_LL list=new RemoveDup_LL();
		list.insertLast(1);
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(3);
		list.display();
		list.rem_dup();
		list.display();
		}
	private Node head;
	private Node tail;
	private int size;
	
	public RemoveDup_LL() {
		this.size=size;
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
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
public void rem_dup() {
		
		Node temp=head;
		while(temp.next!=null) {
			if(temp.value==temp.next.value) {
				temp.next=temp.next.next;
				size--;
			}else {
				temp=temp.next;
			}
		}
		tail=temp;
		tail.next=null;
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
			this.next=next;
			this.value=value;
		}
	}

}
