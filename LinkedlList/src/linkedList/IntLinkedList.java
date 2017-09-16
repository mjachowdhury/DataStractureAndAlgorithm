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
	
	/*
	 * This function will delete the item from the linked list
	 */
	public boolean deleteItem(int item){
		if(head.value == item){//if we find the item in the first head then
			head = head.link;//means it will go the fist node and will take to the first link get the address of the second node
			return true;
		} else{//if you don't find it then we have to iterate the whole list
			Node x = head;//getting the address first
			Node y = head.link;
			while(true){
				if(y == null || y.value == item){
					break;//y will be null when it will reach to the last.that means we havan't found any item in the list
				} else{
					x = y;//x will store the address of the y 
					y= y.link;//here y will store the next node address until we find the item
					
				}
			}
			if(y != null){//that means we found the item
				x.link = y.link;
				return true;
			}else{
				return false;
			}
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
