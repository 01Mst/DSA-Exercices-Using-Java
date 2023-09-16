package stacksQueues;

public class CustomStack {

	protected int[] data;
	private static final int Default_Size=10;
	int ptr=-1;
	public CustomStack() {
		this(Default_Size);
	}
	public CustomStack(int size) {
		this.data=new int[size];
	}
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("Stack is full.");
			return false;
		}
		ptr++;
		data[ptr]=item;
		return true;
	}
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Cannot pop from an empty stack!!");
		}
		return data[ptr--];
	}
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Cannot peek from an empty stack!!");
		}
		return data[ptr];
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return ptr==-1;
	}
	public boolean isFull() {
		// TODO Auto-generated method stub
		return ptr==data.length-1;
	}

}
