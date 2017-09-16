package intStack;

public class Person {

	private String name;
	private String rollNo;
	
	public Person(String name, String roolNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString(){
		return "Name : " + this.name + "RollNo : " +this.rollNo;
	}
}
