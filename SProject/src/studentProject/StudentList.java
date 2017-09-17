package studentProject;

public class StudentList {
	private Node h;

	public StudentList() {
		h = new Node();// creating node object
		h.next = null;
		h.data = null;
	}

	public boolean insertStudentList(Student std) {
		Node n = new Node();
		n.data = std;
		n.next = h.next;// adding first node
		h.next = n; // header to the end
		return true;
	}

	/*
	 * checking student is exist or not
	 */
	public boolean haveRollNo(String rollNo) {
		Node a = h.next;// get the reference of hte node
		boolean have = false;
		while (a != null) {
			if (rollNo.equals(a.data.getRoll_no())) {
				have = true;
			}
			a = a.next;
		}
		return have;
	}

	/*
	 * fetching the student data
	 */
	public Student fetchData(String rollNo) {
		Student data = null;
		Node p = h.next;
		while (p != null) {
			if (p.data.getRoll_no().equals(rollNo)) {
				data = p.data;
				break;
			}
			p = p.next;
		}
		return data;
	}

	/*
	 * delete function
	 */
	public void deleteStudent(String rollNo) {
		Node p = h;
		Node q = h.next;
		while (q != null && !(q.data.getRoll_no().equals(rollNo))) {
			p = q;
			q = q.next;
		}
		if (q != null) {
			p.next = q.next;
		} else {
			System.out.println("No data found");
		}
	}

	/*
	 * show all the student
	 */
	public void showAll() {
		Node x = h.next;
		while (x != null) {
			System.out.println(x.data);
			x = x.next;
		}
	}

	// nested class
	class Node {
		// two properties
		private Student data;
		private Node next;
	}
}
