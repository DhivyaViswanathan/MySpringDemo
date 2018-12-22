import java.util.Scanner;

public class PowerOfSample { 
  public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  if(powerOf3(n)) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
  }

private static boolean powerOf3(int n) {
	if(n==0) {
		return false;
	}
	while(n!=1) {
		if(n%3!=0)
			return false;
		n=n/3;
	}
	return true;
}
} 