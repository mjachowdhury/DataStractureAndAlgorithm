package linkedList;

public class MainLinkedList {
	public static void main(String[] args) {
		IntLinkedList list = new IntLinkedList();

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
	}

}
