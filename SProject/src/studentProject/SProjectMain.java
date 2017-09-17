package studentProject;

public class SProjectMain {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();

		Student std1 = new Student("Mohammed", "1478", 4.2);
		Student std2 = new Student("Jahangir", "2589", 4.2);
		Student std3 = new Student("Chowdhury", "3698", 4.2);
		Student std4 = new Student("Opi", "1234", 4.2);
		Student std5 = new Student("Amena", "4178", 4.2);

		int std1key = hashTable.toHastCode(std1.getRoll_no());
		int std2key = hashTable.toHastCode(std2.getRoll_no());
		int std3key = hashTable.toHastCode(std3.getRoll_no());
		int std4key = hashTable.toHastCode(std4.getRoll_no());
		int std5key = hashTable.toHastCode(std5.getRoll_no());

		hashTable.insert(std1key, std1);
		hashTable.insert(std2key, std2);
		hashTable.insert(std3key, std3);
		hashTable.insert(std4key, std4);
		hashTable.insert(std5key, std5);

		// hashTable.showData();
		/*
		 * Student new_std2 = hashTable.fetchStdInfo(std2.getRoll_no());
		 * if(new_std2.getName().equals(std2.getName())){
		 * System.out.println("Equal"); }
		 */

		// delete std
		hashTable.deleteStd(std2.getRoll_no());
		hashTable.showData();
	}

}
