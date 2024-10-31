package realpackage;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

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