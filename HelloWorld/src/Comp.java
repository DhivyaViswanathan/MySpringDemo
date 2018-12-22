import java.util.*;

class Comp implements Comparator<Integer> 
{
public int compare(Integer obj1, Integer obj2)  //Implementing Comparator's compare() method to give a descending ordering
{
return obj2.compareTo(obj1);
}

 

public static void main(String... ar)
{
TreeSet<Integer> pq= new TreeSet<Integer>(new Comp()); //Passing an object of implementer of Comparator Interface
pq.add(17);
pq.add(40);
pq.add(72);
pq.add(39);  
pq.add(234);
pq.add(24);
pq.add(22);

System.out.println("TreeSet with descending ordering" + pq);
System.out.println("Size of TreeSet = "+ pq.size());
}

}