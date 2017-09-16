package intStack;

public class StackMain {

	public static void main(String[] args) {
		
		/*//creating object of IntStack with empty parameters constructor
		IntStack intStack = new IntStack();
		//if its not full then we can add item
		if(!intStack.isFull()){
			intStack.push(2);
			intStack.push(4);
			intStack.push(5);
			intStack.push(8);
			intStack.push(3);
			intStack.push(9);//this is the top value because it was added last.Stack is about last in first out.
		}
		
		System.out.println(intStack.pop());//this will print 9
		System.out.println(intStack.pop());//this will print 3
		System.out.println(intStack.pop());//this will print 8

*/
		//Creating two person class object
		Person person1 = new Person("Mohammed", "1");
		Person person2 = new Person("Jahangir", "2");
		
		//Creating PersonStack class object
		PersonStack stack = new PersonStack();
		
		stack.push(person1);
		stack.push(person2);//top will be person2 because it was last object
		
		System.out.println(stack.pop().toString());//this will print last item added
		System.out.println(stack.pop().toString());
	}

}
