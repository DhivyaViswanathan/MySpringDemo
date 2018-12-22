
public class ThreadSampleProgram {

	public ThreadSampleProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ThreadSubClass s1=new ThreadSubClass("guru1");
		s1.start();
		ThreadSubClass s2=new ThreadSubClass("guru2");
		s2.start();
	}
}
class ThreadSubClass implements Runnable{
	Thread thread;
	private String threadName;

	public ThreadSubClass(String name) {
		this.threadName=name;
	}

	public void start() {
		System.out.println("Thread started");
		if(thread ==null) {
			thread=new Thread(this, threadName);
			thread.start();
		}
		
	}
//	@Override
//	 public void run() {
//	  System.out.println("Thread running" + threadName);
//	  for (int i = 0; i < 4; i++) {
//	   System.out.println(i);
//	   System.out.println(threadName);
//	   try {
//	    Thread.sleep(1000);
//	   } catch (InterruptedException e) {
//	    System.out.println("Thread has been interrupted");
//	   }
//	  }
//	 }
	@Override
	public void run() {
		System.out.println("Thread running"+threadName);
		for(int i=0;i<4;i++) {
			System.out.println(i);
			System.out.println(threadName);
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException E) {
			System.out.println("Thread has been interrupted");
		}
		
	}
	
}
