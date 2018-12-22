public class StrigBufferBuilder {
    public static void main(String[] args) {
        int N = 77777777;
        long t;
 
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            System.out.println(t);
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis());
//            System.out.println(System.currentTimeMillis() - t);
        }
 
        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            System.out.println(t);
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis());
//            System.out.println(System.currentTimeMillis() - t);
        }
    }
}