
public class ThreadClass implements Runnable{

	public ThreadClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread s1=new Thread("guru1");
		s1.start();
		try {
			s1.sleep(1000);
		}
		catch(Exception E) {
		System.out.println(E);
		}
		s1.setPriority(1);
		System.out.println(s1.getPriority());
		System.out.println("Threa Running");
//		Thread s2=new Thread("guru2");
//		s2.start();
////		System.out.println(s2.getName());
//		System.out.println(s1.getName());
//        System.out.println(s1.getState());
//        System.out.println(s2.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
