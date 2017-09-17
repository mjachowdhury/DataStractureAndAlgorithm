package studentProject;

public class HashTable {

	private StudentList[] arr;
	private int size;
	private int totalStudnet;

	public HashTable() {
		size = 1000;
		arr = new StudentList[size];// instantiate the object with the size
	}

	// student rollNo will be convert to hash code and will be used as an index
	public int toHastCode(String rollNo) {
		int addAsciis = 0;
		int codeValue = 0;
		for (int i = 0; i < rollNo.length(); i++) {
			addAsciis = addAsciis + (int) rollNo.charAt(i);// type casting
															// string to int
		}
		codeValue = addAsciis % arr.length;
		return codeValue;
	}

	/*
	 * checking whether index is null or object exist
	 */
	public boolean insert(int key, Student data) {
		if (arr[key] == null) {// if index os null then it will create the new
								// studentlist in the index
			arr[key] = new StudentList();
		}
		arr[key].insertStudentList(data);
		totalStudnet++;
		return true;
	}

	/*
	 * will return total student in the system
	 */
	public int getTotal() {
		return totalStudnet;
	}

	/*
	 * checking any student is exit in the system or not
	 */
	public Student fetchStdInfo(String rollNo) {
		int key = toHastCode(rollNo);
		if (arr[key] == null) {// it will return null if theres no data exist
			return null;
		} else {
			Student q = arr[key].fetchData(rollNo);
			if (q != null) {
				return q;
			} else {
				return null;
			}
		}
	}// end of function

	/*
	 * deleting student
	 */
	public boolean deleteStd(String rollNo) {
		boolean have = arr[toHastCode(rollNo)].haveRollNo(rollNo);
		if (have) {
			int key = toHastCode(rollNo);
			arr[key].deleteStudent(rollNo);
			totalStudnet--;
			return true;
		}
		return false;
	}

	public void showData() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showAll();
			}
		}
	}
}
