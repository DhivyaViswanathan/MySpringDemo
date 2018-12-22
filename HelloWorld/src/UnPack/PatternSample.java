package UnPack;

import java.util.Scanner;

public class PatternSample {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int n=input.nextInt();
pattern(n);
	}

	private static void pattern(int n) {
		int temp=n;
		int pow=(int) Math.pow(10, String.valueOf(temp).length()-1);
for(int i=0;i<String.valueOf(temp).length()-1;i++){
	temp=calculate(temp,pow);
	System.out.println(temp);
}
	}

	private static int calculate(int temp,int pow) {
		int temp2,temp1;
		temp1=temp/pow;
		temp2=temp%pow;
		temp2=temp2*10;
		temp=temp2+temp1;
		return temp;
	}
}
