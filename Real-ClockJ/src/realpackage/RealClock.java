package realpackage;

import java.util.*;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	double TimeMillis = System.currentTimeMillis();

	double TimeSecs = TimeMillis/1000;
	double TimeMins = TimeSecs/60;
	double TimeHour = TimeMins/60;

	public String hour() {

		String hour = toString();
		return hour;
	
	}
	
	public String min() {
		
		String minute = toString();
		return minute;
		
	}
	
	public String sec() {
		
		String second = toString();
		return second;
		
	}
}