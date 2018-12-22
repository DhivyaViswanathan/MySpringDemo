package InterviewQuestions;

import java.io.*;
import java.util.*;
public class CombinationSum
 {
    static HashSet<ArrayList<Integer>> set = new HashSet<>();
    public static void combination(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> curr, int sum, int i){
        if(sum == 0){
            if(!set.contains(curr)){
                result.add(new ArrayList<>(curr));
                set.add(curr);
            }
            return;
        }
        if(i==arr.size())
            return;
        if(arr.get(i)>sum)
            return;
        
        curr.add(arr.get(i));
        combination(arr, result, curr, sum-arr.get(i), i+1);
        curr.remove(curr.size()-1);
        i++;
        while(i<curr.size() && arr.get(i) == arr.get(i-1))
            i++;
        combination(arr, result, curr, sum, i);
    }
    public static void combinationSum(ArrayList<Integer> arr, int n, int sum){
        // HashSet<Integer> set = new HashSet<>();
        // for(int i =0; i<n; i++)
        //     set.add(arr.get(i));
        // ArrayList<Integer> array = new ArrayList<>(set);
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        combination(arr, result, new ArrayList<Integer>(), sum, 0);
        if(result.size() == 0){
            System.out.print("Empty");
            return;
        }
        for(int i =0; i<result.size(); i++){
            ArrayList<Integer> curr = result.get(i);
            if(curr.size() == 1)
                System.out.print("("+curr.get(0)+")");
            else
                for(int j =0; j<curr.size(); j++){
                    if(j==0)
                        System.out.print("("+curr.get(j)+" ");
                    else if(j==curr.size()-1)
                        System.out.print(curr.get(j)+")");
                    else
                        System.out.print(curr.get(j)+" ");
                }
        }
    }
	public static void main (String[] args)
	 {
            Scanner s = new Scanner(System.in);
//            int t = s.nextInt();
//            while(t-->0){
                int n = s.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for(int i =0; i<n; i++)
                    arr.add(s.nextInt());
                int sum = s.nextInt();
                combinationSum(arr, n, sum);
                System.out.println();
//            }
	 }
}