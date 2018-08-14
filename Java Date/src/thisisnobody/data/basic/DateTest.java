package thisisnobody.data.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author ZLP
 *
 *         java.util.Date
 * 
 *         java.sql.Date 继承了java.util.Date
 * 
 *         java.text.DateFormat 抽象类
 * 
 *         java.text.SimpleDateFormat 包含了大量的转换格式，可以看JavaDoc
 * 
 *         java.util.GregorianCalendar
 * 
 *         java.util.Calendar 抽象类
 *         https://www.tutorialspoint.com/java/java_date_time.htm
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();// 当前时间
		System.out.println("======Date=====");
		System.out.println(String.format("Date: %tc\n", date));
		System.out.printf(String.format("Date: %tc\n", date));

		System.out.println(
				"\nLong Millisec: \n" + date.getTime() + "\n\nCentral Standard Time: \n" + date.toString() + "\n");

		System.out.println("======SimpleDateFormat=====");
		SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String fDate = frmt.format(date);// 将Date格式化为字符串
		System.out.println(fDate);

		String s = "2018-01-01 01:01:01";
		Date d = frmt.parse(s);// 将符合格式的字符串转为Date
		System.out.println(d);

		System.out.println("=========GregorianCalendar=======");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);// Date转为GregorianCalender，之后可以调用GC的方法或者字段分析Date
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));

	}

}
