package linkedList;

public class IntLinkedList {
	//field of the class its global
	private Node head;
	
	public IntLinkedList(int item){
		head = new Node();//instantiate the Node 
		head.value = item;//this is the first and last node
		head.link = null;
	}
	
	/*
	 * This function will adding the item inside the linked list
	 */
	public boolean insertItem(int item){
		Node n = new Node();//creating new node
		n.value = item;  
		n.link = head; 
		head = n;
		return true;
	}
	
	/*
	 * This function will show all the item inside the linked list 
	 */
	public void ShowAllNode(){
		//first get the address of the first node from the head
		Node z = head;
		while(z!=null){ //looping until its not null
			System.out.println(z.value);
			z = z.link;
		}
	}
	//this nested classes
	//this Node will work within this LinkedList class
	
	//child class of parent class of IntLinkedList
	class Node{
		private int value;
		private Node link;
	}

}
