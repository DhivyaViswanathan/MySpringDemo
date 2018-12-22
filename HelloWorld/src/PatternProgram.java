import java.util.Scanner;

public class PatternProgram {

	public PatternProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int n=s.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
