package tree;

public class MainTree {

	public static void main(String[] args) {
		Person p1 = new Person("Mohammed", 35);
		Person p2 = new Person("Chowdhury", 48);
		Person p3 = new Person("Baba", 28);
		Person p4 = new Person("Mozum", 78);
		Person p5 = new Person("Ali", 78);

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);

		bst.showAll(bst.findNode("Mohammed"));

		System.out.println();
		Person p = bst.getData(bst.findParent("Ali"));
		System.out.println("Parent of the person is : " + p.toString());
	}

}
