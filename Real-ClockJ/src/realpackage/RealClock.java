package realpackage;

import java.util.*;
import javax.swing.Timer;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	String hour;
	String mins;
	String secs;
	
	public RealClock() {
		
	Timer tick;
	
	
	long timemillis = System.currentTimeMillis();

	long elapsedmillis = System.currentTimeMillis() - timemillis;
	long elapsedsecs = elapsedmillis / 1000;
	long timesecs = elapsedsecs % 60;
	long elapsedmins = elapsedsecs / 60;
	long timemins = elapsedmins % 60;
	long elapsedhour = elapsedmins / 60;
	long timehour = elapsedhour % 60;
	
	hour = timehour+"";
	mins = timemins+"";
	secs = timesecs+"";
	
	}
	
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