package realpackage;

import java.util.*;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	long TimeMillis = System.currentTimeMillis();

	long TimeSecs = TimeMillis/1000;
	long TimeMins = TimeSecs/60;
	long TimeHour = TimeMins/60;
	
	String hour = TimeHour+"";
	String mins = TimeMins+"";
	String secs = TimeSecs+"";

	public String hour() {

		return hour;
	
	}
	
	public String min() {
		
		return mins;
		
	}
	
	public String sec() {
		
		return secs;
		
	}
}