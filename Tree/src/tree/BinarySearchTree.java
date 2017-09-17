package tree;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(Person item) {
		Node n = new Node();
		n.data = item; // adding data to the node
		n.leftChild = null;
		n.rightChild = null;
		if (root == null) {// means if root null we havn't added any node. only
							// parent node there no child ode there
			root = n;
			return true;
		}

		// getting the two reference of the root node
		Node p = root;// p means parent/root node
		Node c = root;// c means child node
		while (c != null) {
			p = c;
			if (item.getName().compareTo(c.data.getName()) < 0) {
				c = c.leftChild;
			} else {
				c = c.rightChild;
			}
		}
		if (item.getName().compareTo(p.data.getName()) < 0) {
			p.leftChild = n;
		} else {
			p.rightChild = n;
		}
		return true;
	}

	public Node findNode(String key) {
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.leftChild;
			} else {
				c = c.rightChild;
			}
		}
		return c;
	}

	public Person getData(Node n) {
		return n.data;
	}

	// recursion function
	public void showAll(Node n) {
		Node p = n;
		if (p != null) {
			System.out.print(" " + p.data);
			showAll(p.leftChild);
			showAll(p.rightChild);
		}
	}

	/*
	 * to check the name belong to which parent.
	 */
	public Node findParent(String key) {
		Node p = root;
		Node c = root;

		do {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.leftChild;
			} else {
				c = c.rightChild;
			}
		} while (c != null);
		System.out.println(" " + p.data.getAge());
		if (c != null) {
			return p;
		} else {
			return null;
		}
	}

	// nested class
	public class Node {
		private Node leftChild;// left child value must be small then right
								// child
		private Person data;
		private Node rightChild;
	}

}
