import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayDateSorting {

	public ArrayDateSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		List<Date> l1=new ArrayList<>();
		l1.add(s.parse("2018-06-08"));
		l1.add(s.parse("2017-01-08"));
		l1.add(s.parse("2011-06-08"));
		l1.add(s.parse("2009-06-08"));
		l1.add(s.parse("2020-06-08"));
		Collections.sort(l1);
		for(Date d:l1) {
			System.out.println(s.format(d));
		}

	}

}
