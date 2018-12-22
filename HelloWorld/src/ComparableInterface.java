import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableInterface {
	

	public ComparableInterface() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
//		userAccount s=new userAccount(10, "name01", "FEMALE", 1, 9000);
//		userAccount s1=new userAccount(1, "name02", "MALE", 1, 3000);
//		userAccount s2=new userAccount(2, "name03", "MALE", 1, 7000);
//		userAccount s3=new userAccount(17, "name04", "FEMALE", 1, 5000);
//		userAccount s4=new userAccount(4, "name05", "FEMALE", 1, 9000);
//		userAccount s5=new userAccount(5, "name06", "FEMALE", 1, 10000);
//		userAccount s6=new userAccount(8, "name07", "MALE", 1, 8000);
//		userAccount s7=new userAccount(7, "name08", "FEMALE", 1, 11000);
//		userAccount s8=new userAccount(11, "name09", "FEMALE", 1, 4000);
//		userAccount s9=new userAccount(9, "name10", "MALE", 1, 33000);
//		
	addAccountDetails details=new addAccountDetails();
	details.addAccountDetailList();

}
}
 class userAccount implements Comparable<userAccount>{
	private int id;
	private String name;
	private String sex;
	private int age;
	private int salary;
	
	userAccount(int id,String name,String sex,int age,int salary){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(userAccount target) {
		int d=target.id-this.id;
		return d;
	}
	 
	@Override
	public String toString() {
		StringBuffer stringbuffer=new StringBuffer();
		stringbuffer.append("Id :");
		stringbuffer.append(this.id);
		stringbuffer.append(" ,Name :");
		stringbuffer.append(this.name);
		stringbuffer.append(",sex:");
		stringbuffer.append(this.sex);
		stringbuffer.append(",age :");
		stringbuffer.append(this.age);
		stringbuffer.append(",salary :");
		stringbuffer.append(this.salary);
		return stringbuffer.toString();
		
	}
}
 
 class addAccountDetails{
	 void addAccountDetailList() {
			List<userAccount> l1=new ArrayList<>();
			
			l1.add(new userAccount(10, "name01", "FEMALE", 1, 9000));
			l1.add(new userAccount(1, "name02", "MALE", 2, 3000));
			l1.add(new userAccount(2, "name03", "MALE", 3, 7000));
			l1.add(new userAccount(17, "name04", "FEMALE", 9, 5000));
			l1.add(new userAccount(4, "name05", "FEMALE", 5, 9000));
			l1.add(new userAccount(5, "name06", "FEMALE", 8, 10000));
			l1.add(new userAccount(8, "name07", "MALE", 4, 8000));
			l1.add(new userAccount(7, "name08", "FEMALE", 6, 11000));
			l1.add(new userAccount(11, "name09", "FEMALE", 7, 4000));
			l1.add(new userAccount(9, "name10", "MALE", 10, 33000));
//			
//			for(int i=0;i<21;i++) {
//				if(i<10) {
//					l1.add(new userAccount(i, "user"+i, "Female", 1+i, 3000+i));
//					
//				}
//				else if(i<20) {
//					l1.add(new userAccount(i, "user"+i, "Male", 1+i, 2000+i));
//				}
//			}
			Collections.sort(l1);
			for(userAccount a:l1) {
				System.out.println(a);
			}
			System.out.println(" ");
			Collections.sort(l1,new userSalaryAccount());
			for(userAccount b:l1) {
				System.out.println(b);
			}
			System.out.println(" ");
			Collections.sort(l1,new userAgeAccount() );
			for(userAccount c:l1) {
				System.out.println(c);
			}
			System.out.println(" ");
		}
 }
 
 class userSalaryAccount implements Comparator<userAccount>{

	@Override
	public int compare(userAccount o1, userAccount o2) {
		// TODO Auto-generated method stub
		int salary=o1.getSalary()-o2.getSalary();
		return salary;
	}

 }
 class userAgeAccount implements Comparator<userAccount>{

	@Override
	public int compare(userAccount o1, userAccount o2) {
		int age=o1.getAge()-o2.getAge();
		return age;
	}
	 
 }
 
