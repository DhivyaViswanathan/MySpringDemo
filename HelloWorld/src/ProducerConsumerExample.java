import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProducerConsumerExample {

   /* Create common List of Integer. */
   private static List<Integer> listIntegers = new ArrayList<Integer>();
 
   public static void main(String[] args) {
      /* Start Producer Thread */
      new ProducerThread().start();
      /* Start Consumer Thread */
      new ConsumerThread().start();
   }
 
   /* Producer thread that will add/remove records to `listIntegers` */
   public static class ProducerThread extends Thread{
  
      @Override
      public void run() {
         int index = 0; 
//         int i=0;
         while(true){
//            try {
//               /* Put thread in sleep for `1 milliseconds` */
//               Thread.sleep(1);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
    
            if(listIntegers.size() < 1){
               /* Add record to List */
               listIntegers.add(index);
               /* Print the records of List */
               System.out.println("Producer Thread: \n" + listIntegers);
               System.out.println(listIntegers.size());
               index++;
//               i++;
            }else{
               /* Remove 1st element from List */
               listIntegers.remove(0);
            }
         }
      }
   }

   /* Consumer thread that will iterate records of `listIntegers` */
   public static class ConsumerThread extends Thread{
//	   int i=0;
  
      @Override
      public void run() {
         while(true){
//            try {
//               /* Put thread in sleep for `1 milliseconds` */
//               Thread.sleep(1);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
            System.out.println("Consumer Thread iterator list: ");
            /* Get iterator of List */
            Iterator<Integer> iterator = listIntegers.iterator();
            /* Iterate List until last element */
            while(iterator.hasNext()){
               /* Print the element */
               System.out.print(iterator.next() + ", ");
               if(!iterator.hasNext()){
                  System.out.println("");
               }
            }
//            i++;
         }
      }
   }
}