package stacksQueues;

public class Dynamic_Stack extends CustomStack {
	public Dynamic_Stack() {
	super();
	}
	public Dynamic_Stack(int size) {
		super(size);
	}
	public boolean push(int item) {
		if(isFull()) {
			int temp[]=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		return super.push(item);
	}

}
