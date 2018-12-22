package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demoException {
	public static void main(String[] args) {
	int i=8;
	int j=0,k=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
		
		j=Integer.parseInt(br.readLine());
		k=i+j;
		if(k<10) {
			throw new ArithmeticException();
		}
		
	}
	catch(IOException e) {
		System.out.println(e);
	}
	catch(ArithmeticException e) {
		System.out.println("Minimum value is");
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("Out Of Bound Exception");
	}
	catch(Exception e) {
		System.out.println("Exception");
	}
	finally {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("bye bye");
	}
	System.out.println(k);
	}
}
