package studentProject;

public class Student {
	// properties
	private String name;
	private String roll_no;
	private double cgpa;

	/**
	 * @param name
	 * @param roll_no
	 * @param cgpa
	 */
	public Student(String name, String roll_no, double cgpa) {
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cgpa;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roll_no
	 */
	public String getRoll_no() {
		return roll_no;
	}

	/**
	 * @param roll_no
	 *            the roll_no to set
	 */
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa
	 *            the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String toString() {
		return "Student Name : " + name + " . Roll No :" + roll_no + " . CGPA : " + cgpa + "\n";
	}

}
