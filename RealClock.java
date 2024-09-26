package realpackage;

public class RealClock {

	public static void main(String[]args) {
		
		int TimeMillis;
		int TimeSecs;
		int TimeMins;
		int TimeHours;
	
	TimeMillis = (int) System.currentTimeMillis();
	
	TimeSecs = TimeMillis/1000;
	TimeMins = TimeSecs/60;
	TimeHours = TimeMins/60;
	System.out.println(TimeHours);
	}
}