package UnPack;

class NestedException {
	 public static void main(String args[]) {
	  try {
	   int d = 2;
	   int n = 20;
	   int fraction = n / d;
	   int g[] = {1};
	   g[0] = 100;
	  }
	  catch(Exception e){
	  	System.out.println("In the catch clock due to Exception = "+e);
	  }
//	  catch (ArithmeticException e) {
//	   System.out.println("In the catch clock due to Exception = " + e);
//	  } catch (ArrayIndexOutOfBoundsException e) {
//	   System.out.println("In the catch clock due to Exception = " + e);
//	  }
	  finally{
		  
		  System.out.println("End Of Finally");
	  }
	 }
	}