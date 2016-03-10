package chapter02;

public class Car {
	private Car(){}
	private static Car instance = null;
	public static Car getInstance(){
		if(instance == null) instance = new Car();
		return instance;
	}
}
