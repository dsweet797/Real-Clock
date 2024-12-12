package realpackage;

import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	String hour;
	String mins;
	String secs;
	
	int timesecs;
	int timemins;
	int timehour;

	Calendar date = Calendar.getInstance();
	
	public String hour() {

		timehour = date.get(Calendar.HOUR);
		hour = "" + timehour;
		return hour;
	
	}
	
	public String min() {
		
		timemins = date.get(Calendar.MINUTE);
		mins = "" + timemins;
		return mins;
		
	}
	
	public String sec() {
		
		timesecs = date.get(Calendar.SECOND);
		secs = "" + timesecs;
		return secs;
		
	}
}