
public class AddBiggestTwoNumbers {

	public AddBiggestTwoNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int temp;
		int a[]= {10,12,1,16};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
//				System.out.println(a[i]+"   "+a[j]);
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.println(a[i]+" "+a[j]);
			} 
			}
		}
		System.out.println(a[0]+" "+a[1]);
	}
}