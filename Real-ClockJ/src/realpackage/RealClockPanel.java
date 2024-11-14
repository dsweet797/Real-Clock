package realpackage;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.Timer;

public class RealClockPanel extends JPanel {
	
	private RealClockPanel timeP;
	
	public void paintComponent(Graphics g) {
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
		g.drawString(phour, xCenter-10, yCenter+20);
		
		String pmin;
		pmin = time.min();
		g.drawString(pmin, xCenter-10, yCenter+10);
		
		String psec;
		psec = time.sec();
		g.drawString(psec, xCenter-10, yCenter);
		
///		g.drawString(null, xCenter - 100, yCenter - 75);
	}

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