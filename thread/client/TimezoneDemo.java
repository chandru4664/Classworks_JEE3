package com.htc.thread.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneDemo {
	
	
	public static void main(String[] args) {
		
	
TimeZone tz=TimeZone.getTimeZone("US/Central");
//String timeformat="hh:mm:ss.SSS a ZZZZ";

String dateFormat="MMMM dd,yyyy ";

//Calendar calendar=Calendar.getInstance(tz);

Date d=new Date();
DateFormat df=new SimpleDateFormat(dateFormat);
//df.setTimeZone(calendar.getTimeZone());
df.setTimeZone(tz);

String curdate=df.format(d);
/*String curtime=df.format(calendar.getTime());
System.out.println(curtime);
*/


System.out.println(curdate);



	}
}
