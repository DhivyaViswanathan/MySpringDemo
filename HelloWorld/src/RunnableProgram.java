
public class RunnableProgram {

	public RunnableProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new threadProgram("thread1");
		new threadProgram("thread2");
		new threadProgram("thread3");
		System.out.println("Main Thread");
		
//t.start();
	}

}

class threadProgram implements Runnable{
	String threadName;

	public threadProgram(String string) {
		this.threadName=string;
		Thread t=new Thread(this, threadName);
		t.start();
	}

	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println(threadName +i);
				Thread.sleep(1000);
			}	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
