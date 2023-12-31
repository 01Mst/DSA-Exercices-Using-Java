package stacksQueues;

public class Dynamic_Queue extends Circular_Queue {
	public Dynamic_Queue() {
		super();
	}
	public Dynamic_Queue(int size) {
		super(size);
	}
	public boolean insert(int item) {
		if(isFull()) {
			int[] temp=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[(front+i)%data.length];
			}
			front=0;
			end=data.length;
			data=temp;
		}
		return super.insert(item);
	}

}
