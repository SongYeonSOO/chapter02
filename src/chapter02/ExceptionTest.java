package chapter02;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 1;
		try {
			double b = 100 / a;
			System.out.println("some more codes");
			return;									//**********************return!
		} catch (ArithmeticException ex) {
			System.out.println("Error Occours: " + ex); // ex : toString ->
														// override
		} 
		// since we used 'finally', 
		//whether the return exist or not , 
		//finally statement will be running 
		finally {
			System.out.println("Clean-up code");

		}

	}
}
