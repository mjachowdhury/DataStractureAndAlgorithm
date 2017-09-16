package intQueue;

public class QueueMain {

	public static void main(String[] args) {
		 
		//Creating IntQueue Object
		IntQueue intQueue = new IntQueue();
		
		//calling function
		intQueue.enqueue(9);
		intQueue.enqueue(8);
		intQueue.enqueue(12);
		
		System.out.println(intQueue.dequeue());//value what is enqueued displayed first dequeued
		System.out.println(intQueue.dequeue());
		System.out.println(intQueue.dequeue());
		
		
	}

}
