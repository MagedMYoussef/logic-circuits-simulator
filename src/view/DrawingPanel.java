package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

	public DrawingPanel() {
		super();
		setPreferredSize(new Dimension(800,800));
	}

	public void paint(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 2000, 1200);

		Graphics2D canvas = (Graphics2D) g;

		OrShape orgate = new OrShape(100, 100, new Dimension(70, 50), 1);
		XorShape xorgate = new XorShape(300, 100, new Dimension(70, 50), 1);

		orgate.drawComponent(canvas);
		xorgate.drawComponent(canvas);

	}
}
