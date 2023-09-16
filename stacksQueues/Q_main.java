package stacksQueues;

public class Q_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 Custom_Queue q=new Custom_Queue();
 Circular_Queue cq=new Circular_Queue(5);
 Dynamic_Queue dq=new Dynamic_Queue();
 /*q.insert(1);
 q.insert(2);
 q.insert(3);
 q.insert(4);
 q.display();
 q.remove();
 System.out.println("-----------");
 q.display();
 System.out.println("-----------");
 System.out.println(q.front());*/
 cq.insert(10);
 cq.insert(20);
 cq.insert(30);
 cq.insert(40);
 cq.insert(50);
 System.out.println(cq.insert(60));
 cq.display();
 System.out.println("-------------------------");
 dq.insert(10);
 dq.insert(10);
 dq.insert(10);
 dq.insert(10);
 dq.insert(10);
 System.out.println(dq.insert(10));
 dq.display();
// cq.remove();
// cq.display();
 
	}

}
