package realpackage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RealClockDisplay<field> extends JPanel {
	
	private field Panel;
	
	private RealClockDisplay() { 
		super();
		Panel = (field) new RealClockDisplay<Object>();
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color. GREEN);
		g.fillRect(0, 0, 20, 20);
		System.out.println("LOL");
	}
	
	
	
	
	
}