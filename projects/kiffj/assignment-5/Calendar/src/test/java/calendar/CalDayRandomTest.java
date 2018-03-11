package calendar;


import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import java.util.GregorianCalendar;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 1000 * 5; /* Timeout at 5 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
				long randomseed =System.currentTimeMillis(); //10
		 Random random = new Random(randomseed);
		 GregorianCalendar day = new GregorianCalendar(2000, 1, 25);
		 CalDay calDay1 = new CalDay(day);
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
	//			System.out.println(" Seed:"+randomseed );
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 26);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 62);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 33);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, -1, 2019);
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
			for (int i = 0; i < NUM_TESTS; i++) {
					calDay1.addAppt(appt);
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
		 
	 }


	
}
