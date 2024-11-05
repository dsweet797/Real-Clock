package realpackage;

///TimeZone TimeZ = TimeZone.getTimeZone("America/Los_Angeles");

public class RealClock {
	
	float TimeMillis = System.currentTimeMillis();

	float TimeSecs = TimeMillis/1000;
	float TimeMins = TimeSecs/60;
	float TimeHour = TimeMins/60;
	
	String base;
	
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