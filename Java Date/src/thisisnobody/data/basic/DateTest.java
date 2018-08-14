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
 *         java.sql.Date �̳���java.util.Date
 * 
 *         java.text.DateFormat ������
 * 
 *         java.text.SimpleDateFormat �����˴�����ת����ʽ�����Կ�JavaDoc
 * 
 *         java.util.GregorianCalendar
 * 
 *         java.util.Calendar ������
 *         https://www.tutorialspoint.com/java/java_date_time.htm
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();// ��ǰʱ��
		System.out.println("======Date=====");
		System.out.println(String.format("Date: %tc\n", date));
		System.out.printf(String.format("Date: %tc\n", date));

		System.out.println(
				"\nLong Millisec: \n" + date.getTime() + "\n\nCentral Standard Time: \n" + date.toString() + "\n");

		System.out.println("======SimpleDateFormat=====");
		SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String fDate = frmt.format(date);// ��Date��ʽ��Ϊ�ַ���
		System.out.println(fDate);

		String s = "2018-01-01 01:01:01";
		Date d = frmt.parse(s);// �����ϸ�ʽ���ַ���תΪDate
		System.out.println(d);

		System.out.println("=========GregorianCalendar=======");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);// DateתΪGregorianCalender��֮����Ե���GC�ķ��������ֶη���Date
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));

	}

}
