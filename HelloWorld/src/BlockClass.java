
public class BlockClass {
	
	
	static {
		System.out.println("static block");
	}
	

	public BlockClass() {
		System.out.println("constructor");
	}
	
	{
		System.out.println("normal block");
	}
	
	public static void main(String[] args) {
		BlockClass b=new BlockClass();
		
	}


}
