package doublyLinkedList;

public class dList {
	// field of the class its global
	private Node head;

	// changing parameter cause when we will work with object then object will
	// not work with primitive
	public dList(int item) {
		head = new Node();// instantiate the Node
		head.value = item;// this is the first and last node
		head.next = null; // first node and previous node does not have any
							// address so its null
		head.prev = null;
	}

	/*
	 * This function will adding the item inside the linked list inserting the
	 * item start of the list
	 */
	public boolean insertItem(int item) {
		Node n = new Node(); // creating first object of Node
		n.value = item;// set the value item
		n.prev = null;// its prev. node address is null
		head.prev = n;// set previously node already first node to the new node
		n.next = head;// set the address of out new node
		head = n;// taking the address and set it to the new nde
		return true;
	}

	/*
	 * This function will show all the item inside the linked list
	 */
	public void ShowAllNode() {
		// first get the address of the first node from the head
		Node z = head;// it will call the second node
		while (z != null) { // looping until its not null
			System.out.println(z.value);
			z = z.next;
		}
	}

	/*
	 * This function will delete the item from the linked list
	 */
	public boolean deleteItem(int item) {
		if (head.next.value == item) {// if we find the item in the first head
										// then
			head.next = head.next.next;// means it will go the fist node and
										// will take to the first link get the
										// address of the second node
			return true;
		} else {// if you don't find it then we have to iterate the whole list
			Node x = head;// getting the address first
			Node y = head.next;
			while (true) {
				if (y == null || y.value == item) {
					break;// y will be null when it will reach to the last.that
							// means we havan't found any item in the list
				} else {
					x = y;// x will store the address of the y
					y = y.next;// here y will store the next node address until
								// we find the item

				}
			}
			if (y != null) {// that means we found the item
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}

	}

	// this nested classes
	// this Node will work within this LinkedList class

	// child class of parent class of IntLinkedList
	class Node {
		private Node prev;// previous node address
		private int value;
		private Node next;// next node address
	}

}
