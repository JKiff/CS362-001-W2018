package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);

		 // Can't test for invalid month because doing so causes an error in CalondarUtil.java
		 Appt appt0 = new Appt(13, 1, 1, 1 , 2000, title, description);
		 Appt appt1 = new Appt(-1, -1, 0, 1 , startYear, title, description);
		 Appt appt2 = new Appt(0, -1, 0, 1 , startYear, title, description);
		 Appt appt3 = new Appt(0, 0, 0, 1 , startYear, title, description);
		 Appt appt4 = new Appt(0, 0, 1, 1 , startYear, title, description);
		 Appt appt5 = new Appt(12, 1, 1, 1 , startYear, title, description);
		 Appt appt6 = new Appt(25, -1, 0, 1 , startYear, title, description);
		 Appt appt7 = new Appt(12, 70, 0, 1 , startYear, title, description);
		 Appt appt8 = new Appt(0, 0, 100, 1 , startYear, title, description);
		 Appt appt9 = new Appt(0, 1, 1, 1, startYear, title, description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 appt.setTitle(null);
		 appt.setTitle("thingy");
		 appt.setStartHour(1);
		 appt.setStartDay(1);
		 appt.setStartYear(2000);
		 appt.setStartMonth(1);
		 appt.setStartMinute(1);
		 appt.setDescription(null);
		 appt.setDescription("thingythingy");
		 appt.getRecurNumber();
		 appt.getRecurBy();
		 appt.getRecurDays();
		 appt.getRecurNumber();
		 appt.getRecurIncrement();
		 appt.toString();
		 appt1.toString();
		 appt0.toString();
		 appt5.toString();

		 appt.compareTo(appt1);

		 int[] array = new int[1];
		 array[0]=1;
		 appt.setRecurrence(array, 1, 1, 1);
		 appt.isRecurring();
		 appt.setRecurrence(null, 1, 1, 0);

		 appt.isRecurring();
	 }

	 @Test
	  public void test02()  throws Throwable  {

	 }
//add more unit tests as you needed

}
