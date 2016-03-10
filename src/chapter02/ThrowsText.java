package chapter02;

import java.io.IOException;

public class ThrowsText {
	public void suspiciousMethod() throws MyException {

		System.out.println("예외 발생 전");

		if (true) {
			// throw new IOException(); //강제로 예외 발생
			throw new MyException(" "); // 강제로 예외 발생
		}

		System.out.println("예외 발생 후");

	}

}
