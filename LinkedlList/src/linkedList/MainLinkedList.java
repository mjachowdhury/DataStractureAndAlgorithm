package linkedList;

public class MainLinkedList {
	public static void main(String [] args){
		IntLinkedList list = new IntLinkedList(2);
		list.insertItem(5);
		list.insertItem(4);
		list.insertItem(78);
		list.insertItem(89);
		
		list.ShowAllNode();//it will print reverse list
		//anything we entered it be in the lst
	}

}
