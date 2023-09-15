package c230901;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void test() {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ HH:ss");
		System.out.println(sdf.format(now));
		
		
		
//		Calendar
		
		
		
		
	}
}