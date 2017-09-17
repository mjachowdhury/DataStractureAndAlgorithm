package linkedList;

public class MainLinkedList {
	public static void main(String[] args) {
		/*IntLinkedList list = new IntLinkedList();

		list.insertItem(4);
		list.insertItem(78);
		list.insertItem(89);
		list.insertItem(5);

		list.ShowAllNode();// it will print reverse list
		// anything we entered it be in the lst

		System.out.println();

		// list.deleteItem(5);
		// list.ShowAllNode();

		// calling the sort list function
		System.out.println();
		list.sortList();
		list.ShowAllNode();// will print the descending order
	*/
		//Creating person object
		Person person1 = new Person("Mohammed","123");
		Person person2 = new Person("Chowdhury", "456");
		
		// Creating PersonLinkedList object
		PersonLinkedList list = new PersonLinkedList(person1);
		
		list.insertItem(person2);//inserting person2 in the last node
		
		list.ShowAllNode();
	}

}
