package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable tt = new TimeTable();
		 LinkedList<Appt> nullAppts = null;
		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 Appt appt0 = new Appt(13, 1, 1, 1 , 2000, "eh", "thingy");
		 Appt appt1 = new Appt(11, 1, 1, 1 , 2001, "eh", "thingy");
		 Appt appt2 = new Appt(12, 1, 1, 1 , 1999, "eh", "thingy");
		 Appt appt3 = new Appt(-1, 1, 1, 1, 2000, "eh", "thingy");
		 Appt appt4 = new Appt(12, 1, 1, 1 , 2003, "eh", "thingy");
		 Appt appt5 = new Appt(10, 1, 1, 1 , 2003, "eh", "thingy");
		 Appt appt6 = new Appt(12, 1, 1, 1 , 2010, "eh", "thingy");
		 int[] array1 = new int[1];
		 array1[0] = 1;
		 int[] array2 = new int[0];
		 int[] array3 = new int[1];
		 array3[0] = 12;
		 appt0.setRecurrence(array1, 1, 1, 1);
		 appt1.setRecurrence(array2, 1, 1, 1);
		 appt2.setRecurrence(array1, 2, 1, 1);
		 appt3.setRecurrence(array1, 3, 1, 1);
		 appt4.setRecurrence(array1, 3, 1, 1);
		 appt5.setRecurrence(array1, 4, 1, 1);
		 appt6.setRecurrence(array3, 3, 1, 1);
		 appts.add(appt0);
		 appts.add(appt1);
		 appts.add(appt2);
		 appts.add(appt3);
		 appts.add(appt4);



		 int[] pArray = new int[2];
		 pArray[0] = 1;
		 pArray[1] = 2;
		 int[] pArray2 = new int[5];
		 pArray2[0] = 2;
		 pArray2[1] = 1;
		 pArray2[2] = 3;
		 pArray2[3] = 0;
		 pArray2[4] = 4;
		 tt.permute(appts, pArray2);
		 tt.permute(appts, pArray);

 		 GregorianCalendar day = new GregorianCalendar(1998, 1, 25);
		 GregorianCalendar day1 = new GregorianCalendar(2005, 1, 25);
		 tt.getApptRange(appts, day, day1);
		 tt.getApptRange(appts, day1, day);

		 tt.deleteAppt(appts, appt1);
		 tt.deleteAppt(null, null);
		 tt.deleteAppt(appts, null);
		 tt.deleteAppt(appts, appt3);
		 //tt.getApptRange(appts, day1, day);
	 }
	 @Test
	  public void test02()  throws Throwable  {

	 }
//add more unit tests as you needed
}
