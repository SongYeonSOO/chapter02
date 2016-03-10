package chapter02;

import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
		
        InputStreamReader input = new InputStreamReader( System.in );
				
       BufferedReader reader = new BufferedReader(input);
       String keyboardinput = reader.readLine(); //when we use readLine() method, we have to use Exception

       System.out.print( keyboardinput );
       System.out.println( " has entered." );
  }

}
