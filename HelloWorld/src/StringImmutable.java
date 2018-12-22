
public class StringImmutable {

	public StringImmutable() {
	}

	public static void main(String[] args) {
String s1="helloJava";
concat(s1);
	}

	private static void concat(String s1) {
		String s2=null;
	s2=s1.concat("program");
		System.out.println(s2);
	}

}
