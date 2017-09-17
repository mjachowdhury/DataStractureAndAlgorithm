package linkedList;

public class Person {

	private String name;
	private String rollNo;
	
	public Person(String name, String rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName(){
		return name;
	}
	public String toString(){
		return "Name : " + this.name + " RollNo : " + this.rollNo;
	}
}
