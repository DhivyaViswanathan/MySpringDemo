package ExceptionHandling;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int flag=0,i=2,m,count=0,k=2;
		do {
//			for(int k=2;k<=10;) {
				flag=0;
				m=k/2;
				for(int j=2;j<=m;j++) {
					if(k%j==0) {
						flag++;
						break;
					}
				}
				if(flag==0) {
					count++;
//					k++;
					System.out.println(k);
				}
				k++;
//			}
		}while(count<=10);
			
		

	}

}
