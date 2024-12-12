package realpackage;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RealClockPanel extends JPanel {
	
	public void drawTime(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.white);
		
		int xWidth = getWidth();
		int yHeight = getHeight();
		
		int xCenter = xWidth/2;
		int yCenter = yHeight/2;
		
		g.setColor(Color.black);
		g.drawRect(xCenter - 200, yCenter - 125, 400, 250);
			
		RealClock time;
		time = new RealClock();
			
		String phour;
		phour = time.hour();
			
		String pmin;
		pmin = time.min();
			
		String psec;
		psec = time.sec();
			
		g.drawString(phour + ":" + pmin + ":" + psec, xCenter-10, yCenter+5);	
		}
	
	//public static void main1(String[] args) {
	//    final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
	//    executorService.scheduleAtFixedRate(RealClockPanel::drawTime, 0, 1, TimeUnit.SECONDS);
	//}

	public static void main(String[] args) {
		JFrame window = new JFrame("Time Display");
		window.setBounds(0, 0, 800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RealClockPanel timeP = new RealClockPanel();
		Container c = window.getContentPane();
		c.add(timeP);
		window.setVisible(true);
		window.setResizable(false);
	}
	
}