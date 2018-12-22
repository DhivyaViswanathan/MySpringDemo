import java.util.Scanner;

public class reverseProgram {

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed:");
		Scanner input=new Scanner(System.in);
//		int number=input.nextInt();
		String stringValue=input.nextLine();
		char[] charValue = stringValue.toCharArray();
		String reverse ="";
		for(int i=stringValue.length()-1;i>=0;i--) {
			reverse=reverse+charValue[i];
		}
//		System.out.println(reverse);
		if(stringValue.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
//		int reverse=0,digits;stringValue
//		while(number!=0) {
//			digits=number%10;
//			reverse=reverse*10+digits;
//			number=number/10;
//		}
//		System.out.println(reverse);
		

	}

}
