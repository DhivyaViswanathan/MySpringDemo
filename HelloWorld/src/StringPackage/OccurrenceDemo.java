package StringPackage;

import java.util.Scanner;

public class OccurrenceDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name1=input.nextLine();
        int count[]=new int[256];
		for(int i=0;i<name1.length();i++) {
			count[name1.charAt(i)]++;
		}
		char ch[]=new char[name1.length()];
		for(int i=0;i<name1.length();i++) {
			int find=0;
			ch[i]=name1.charAt(i);
			for(int j=0;j<=i;j++) {
				if(name1.charAt(j)==ch[i])
					find++;
			}
			if(find==1) {
				System.out.println("Occurrence of the character "+ch[i]+" is : "+count[name1.charAt(i)]);
			}
		}
	}

}
