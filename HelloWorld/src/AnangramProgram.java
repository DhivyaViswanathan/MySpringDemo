import java.util.Scanner;

public class AnangramProgram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first String");
		String name1=input.nextLine();
		System.out.println("Enter the second String");
		String name2=input.nextLine();
		int count=0;
		char string1[]=name1.toCharArray();
		char string2[]=name2.toCharArray();
		if(string1.length!=string2.length) {
			System.out.println("Given string is not anagram");
		}
		for(int i=0;i<string1.length;i++) {
			for(int j=0;j<string2.length;j++) {
				if(string1[i]==string2[j]) {
					string2[j]='\0';
					count++;
					break;
				}
			}
		}
		if(count==string1.length) {
			System.out.println("Two words are anagram");
		}
		else {
			System.out.println("Two words are  not anagram");
		}
	}

}
