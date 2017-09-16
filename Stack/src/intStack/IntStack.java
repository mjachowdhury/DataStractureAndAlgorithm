package intStack;

public class IntStack {
	
	//fields
	private int [] stack;
	private int top;
	private int size;
	
	/**
	 * @param stack
	 * @param top
	 * @param size
	 * constructor and fixing initializing value
	 */
	public IntStack() {
		top = -1;
		size = 50;
		stack = new int [50];//fixing array size
	}
	//this constructor if you want to increase the Array size
	public IntStack(int size){
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	//Function
	public boolean push(int item){
		if(!isFull()){
			top++;//increasing the top as array do not contain -1 value
			stack[top] = item;
			return true;	
		} else{
			return false;
		}
		 
	}
	//once you pop the top value then need to decrement so top now --
	public int pop(){
		return stack[top--];
	}
	//if pop is empty then we do not need to pop any item 
	//so we need another function
	public boolean isEmpty(){
		return (top == -1);
	}
	
	/*
	 * This function will check can you add another item or not
	 */
	public boolean isFull(){
		return (top == stack.length -1);
	}
	
	
}
