package stacksQueues;

public class CS_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomStack cs=new CustomStack(5);
		Dynamic_Stack ds=new Dynamic_Stack(5);
		cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(40);
		cs.push(50);
		cs.push(60);
	//	System.out.println(cs.push(10));
		System.out.println(cs.pop());
		System.out.println(cs.peek());
		System.out.println("------------------------");
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		System.out.println(ds.push(10));

	}

}
