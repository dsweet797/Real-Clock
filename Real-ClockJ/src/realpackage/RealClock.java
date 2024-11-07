package realpackage;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	double TimeMillis = System.currentTimeMillis();

	double TimeSecs = TimeMillis/1000;
	double TimeMins = TimeSecs/60;
	double TimeHour = TimeMins/60;
	
	String base = C;
	
	public String hour() {

		String hour = String.format(base, TimeHour);
		return hour;
	
	}
	
	public String min() {
		
		String minute = String.format(base, TimeMins);
		return minute;
		
	}
	
	public String sec() {
		
		String second = String.format(base, TimeSecs);
		return second;
		
	}
}