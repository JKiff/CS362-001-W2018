package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar day = new GregorianCalendar(2000, 1, 25);
			CalDay calDay1 = new CalDay(day);
			CalDay calDay2 = new CalDay();
			Appt appt0 = new Appt(13, 1, 1, 1 , 2000, "eh", "thingy");

			Appt appt1 = new Appt(11, 1, 1, 1 , 2001, "eh", "thingy");
			Appt appt2 = new Appt(12, 1, 1, 1 , 1999, "eh", "thingy");
			Appt appt3 = new Appt(-1, 1, 1, 1 , 1999, "eh", "thingy");
			int[] array = new int[1];
			array[0] = 1;
			appt0.setRecurrence(array, 1, 1, 1);
			calDay1.addAppt(appt0);
			calDay1.addAppt(appt1);
			calDay1.addAppt(appt2);
			calDay1.addAppt(appt3);
			calDay1.isValid();
			calDay1.toString();
			calDay2.toString();
			calDay1.getSizeAppts();
			calDay1.getDay();
			calDay1.getMonth();
			calDay1.getYear();
			calDay1.iterator();
			calDay2.iterator();
	 }
	 @Test
	  public void test02()  throws Throwable  {

	 }
//add more unit tests as you needed
}
