package chapter02;

import java.io.IOException;

public class ThrowsTextTest {

	public static void main(String[] args){
		ThrowsText tt = new ThrowsText();
		try{
		tt.suspiciousMethod();
		}catch(MyException ex){
			ex.printStackTrace();
		}
	}
}
