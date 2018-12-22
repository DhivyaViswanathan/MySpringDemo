
public class ThisKeyword {
	int a;
	int b;
	void setData(int c,int d) {
		a=c;
		b=d;
	
	}
void display() {
	System.out.println(a+b);
}
	public ThisKeyword() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ThisKeyword s=new ThisKeyword();
		s.setData(1, 2);
		s.display();
		ThisKeyword s1=new ThisKeyword();
		s1.setData(3, 4);
		s1.display();

	}

}
