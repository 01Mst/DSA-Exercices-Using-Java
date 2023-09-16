 package linked_list;

public class DLL {

	private Node head;
	private Node tail;
	private int size;
	private Node last;
	public DLL() {
		this.size=0;
	}
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
		
	}
	public void insertLast(int value) {
		Node node=new Node(value);
		node.next=null;
		last=head;
		//node.next=null;
		//last.next=node;
		//node.prev=last;
		if(head==null) {
			node.prev=null;
			head=node;
			return;
			//node.prev=null;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
		
	}
	
	public Node find(int value) {
	Node node=head;
	while(node!=null) {
		if(node.value==value) {
			return node;
		}
		node=node.next;
	}
	return null;
	}
	
	public void insert(int after, int value) {
		Node p=find(after);
		if(p==null) {
			System.out.println("Does not exist");
			return;
		}
		Node node=new Node(value);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node!=null) {
			node.next.prev=node;
		}
		
	}
	public void display() {
		Node temp=head;
		Node last=null;
		while(temp!=null) {
			System.out.print(temp.value+" -> ");
			last=temp;
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
		System.out.println("REVERSE ORDER:");
		while(last!=null) {
			System.out.print(last.value+" -> ");
			last=last.prev;
		}
		System.out.print("START");
		System.out.println();
		System.out.println();
	}
	
	
	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value=value;
		}
		
		public  Node(int value, Node next, Node prev ) {
			this.value=value;
			this.prev=prev;
			this.next=next;
		}
	}

}
