package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.LinkedList;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 1000 * 5; /* Timeout at 5 seconds */
	private static final int NUM_TESTS=100;
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 TimeTable tt = new TimeTable();
		 LinkedList<Appt> appts = null;
		 Appt selectedAppt = null;
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 int numAppts = 10;

		 
		 long randomseed = System.currentTimeMillis(); //10
		 Random random = new Random(randomseed);
		 GregorianCalendar firstDay;
		 GregorianCalendar lastDay;
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
	//			System.out.println(" Seed:"+randomseed );
				appts = null;
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 1, 2000);
				 firstDay = new GregorianCalendar(startYear, startMonth, startDay);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 startYear=ValuesGenerator.getRandomIntBetween(random, 2001, 2019);
				 lastDay = new GregorianCalendar(startYear, startMonth, startDay);
				int apptsAreNull = ValuesGenerator.getRandomIntBetween(random, 0, 1);
				if (apptsAreNull == 1){
					appts = new LinkedList<Appt>();
					for (int x = 0; x < numAppts; x++){
						 int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 23);
						 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 60);
						 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 31);
						 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
						 startYear=ValuesGenerator.getRandomIntBetween(random, 1, 2019);
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
						 appts.add(appt);
					}
				}
				
				int apptIsNull = ValuesGenerator.getRandomIntBetween(random, 0, 1);
				if (apptIsNull == 1){
					selectedAppt = appts.get(ValuesGenerator.getRandomIntBetween(random, 0, numAppts - 1));
				}
			for (int i = 0; i < 5; i++) {
					tt.deleteAppt(appts, selectedAppt);
					if (appts != null){
						tt.getApptRange(appts, firstDay, lastDay);
					}
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
