package chapter02;

public class Person {
	public int age;
	String name;
	protected int height;
	private int weight;

	/*
	 * 
	 * since we made Person(int), the default constructor doesn't exist anymore.
	public Person() {
		System.out.println("Person() called");
	}
	*/
	public Person(int i) {
		System.out.println("Person(int i) called");
	}
}
