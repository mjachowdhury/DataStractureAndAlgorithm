package intQueue;

public class PersonQueue {

	private Person [] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	//Constructor 1st
	public PersonQueue(){
		size =100;
		total = 0;
		front = 0;
		rear = 0;//to enter the value
		q = new Person [size];
	}
	//2nd Constructor with size parameter if you want to increase the size
	public PersonQueue(int size){
		this.size =size;
		total = 0;
		front = 0;
		rear = 0;//it will handle index of the array
		q = new Person [this.size];
	}

	/*
	 * This function will add item to the queue
	 */
	public boolean enqueue(Person item){
		if(isFull()){//if array is full then it will work
			return false;
		}
		else{
			total++;
			q[rear] = item;
			rear = (rear+1) % size;//this will take to the pointer to first index automatically when its reach to the last index wheather its front or rear 
			return true;
		}
	}
	
	public Person dequeue(){
		Person item= q[front];
		total--;//once item is dequeue then total should be decreasing
		front = (front + 1) % size; //this will take to the pointer to first index automatically when its reach to the last index wheather its front or rear 
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
	
	/*
	 * This function will print all the value inside the array
	 */
	public void showAll(){
		int f = front;//pointer to the front
		if(total !=0){
			for(int i = 0; i< total; i++){
				System.out.println(" " +q[f].toString());
				f= (f+1)%size;
			}
		}
	}
}
