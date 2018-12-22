package Collection;

public class UserDefinedException {

	public static void main(String[] args) {
int i=1,j=2;
int k=i+j;

	try {
		if(k<5) {
		throw new myException("lowerValue");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	
	}

}

class myException extends Exception{

	public myException(String string) {
		super(string);
	}
	
	
}
