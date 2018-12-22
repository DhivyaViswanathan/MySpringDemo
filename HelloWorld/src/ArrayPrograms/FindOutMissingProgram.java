package ArrayPrograms;

public class FindOutMissingProgram{ 
public static void main(String[] args) {

    // given input
    int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };


    int[] register = new int[input.length];


    for (int i : input) {
    	System.out.println(i);
    	register[i]=1;
    }

    System.out.println("missing numbers in given array");
  }

}


