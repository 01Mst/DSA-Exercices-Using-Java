package linked_list;



public class LL {
	private Node head;
	private Node tail;
	 
	private int size;
	public LL() {
		this.size=0;
	}
	public void insert(int val, int index) {
		if(index==0) {
			insertFirst(val);
			return;
			}
		if(index==size) {
			insertLast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
		
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
	public int deleteFirst() {
		int value=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
		
		//head=head.next;
		}
	public int  deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int value=tail.value;
		tail=secondLast;
		tail.next=null;
		size--;
		return value;
		
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
	public Node get(int index) {
		// TODO Auto-generated method stub
		Node node=head;
		for(int i=1;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	public static LL merge(LL first, LL second) {
		Node f=first.head;
		Node s=second.head;
		LL ans =new LL();
		while(f!=null&&s!=null) {
			if(f.value<=s.value) {
				ans.insertLast(f.value);
				f=f.next;
			}else {
				ans.insertLast(s.value);
				s=s.next;
			}
		}
		while(f!=null) {
				ans.insertLast(f.value);
				f=f.next;
			}
		while(s!=null) {
			ans.insertLast(s.value);
			s=s.next;
		}
		return ans;
		
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
