package intQueue;

//for primitive type building custom class
public class IntQueue {
	private int [] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	//Constructor 1st
	public IntQueue(){
		size =100;
		total = 0;
		front = 0;
		rear = 0;
		q = new int [size];
	}
	//2nd Constructor with size parameter if you want to increase the size
	public IntQueue(int size){
		this.size =size;
		total = 0;
		front = 0;
		rear = 0;//it will handle index of the array
		q = new int [this.size];
	}

	/*
	 * This function will add item to the queue
	 */
	public boolean enqueue(int item){
		if(isFull()){//if array is full then it will work
			return false;
		}
		else{
			total++;
			q[rear] = item;
			rear++;
			return true;
		}
	}
	
	public int dequeue(){
		int item= q[front];
		total--;//once item is dequeue then total should be decreasing
		front++;//front should be increasing
		return item;
	}
	/*
	 * This function will check array is full or not
	 */
	public boolean isFull(){
		if(size == total){
			return true;
		} else {
			return false;
		}
	}
}
