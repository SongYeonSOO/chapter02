package chapter02;

public class Student extends Person{

	public Student(){
		super(10); // call Person(int) constructor
		System.out.println("Student called");		
	}
	public Student(int i) {
		// call Person(int) constructor
		// since we remove the default constructor of Person, we have to call Person(int) to avoid Error
		super(10);		
		
		System.out.println("Student(int i) called");
	}
	public void showInfo(){
		age = 14;
		name = "물리";
		height = 150;
		//weight = 40;
	}
}