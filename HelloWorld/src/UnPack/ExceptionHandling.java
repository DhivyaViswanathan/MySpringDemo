package UnPack;

public class ExceptionHandling {

	public ExceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        int a=0;
        int b=12;
        try {
        	int c=b/a;
        	System.out.println(c);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
System.out.println(a);
	}

}
