package doublyLinkedList;

public class MainDList {

	public static void main(String[] args) {
		dList list = new dList(2);
		list.insertItem(5);
		list.insertItem(8);
		list.ShowAllNode();

		System.out.println();

		list.deleteItem(2);
		list.ShowAllNode();
	}

}
