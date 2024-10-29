package realpackage;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RealClockPanel extends JPanel {
	
	private RealClockPanel timeP;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.white);
		
		g.setColor(Color.green);
		g.fillRect(10, 10, 150, 75);
		
		}

	public static void main(String[] args) {
		JFrame window = new JFrame("Time Display");
		window.setBounds(0, 0, 1200, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RealClockPanel timeP = new RealClockPanel();
		Container c = window.getContentPane();
		c.add(timeP);
		window.setVisible(true);
	}
	
}