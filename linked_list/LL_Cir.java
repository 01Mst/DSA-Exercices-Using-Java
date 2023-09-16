package linked_list;



public class LL_Cir {
private Node head;
private Node tail;
private int size;
public LL_Cir() {
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
public boolean hasCircle() {
	Node fast=head;
	Node slow=head;
	while(fast!=null&&slow!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(fast.value==slow.value) {
			return true;
		}
	}
	
	return false;
	
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
