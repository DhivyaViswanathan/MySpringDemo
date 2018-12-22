
public class extendsThread {

	public extendsThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
demoSample d=new demoSample();
d.start();
demoSample d1=new demoSample();
d1.start();
//for(int i=0;i<5;i++) {
//	System.out.println(Thread.currentThread().getName());
//}
	}

}

class demoSample extends Thread{
//	@Override
	public void run() {
		for(int i= 0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
	
		}
	}
	
	
}
