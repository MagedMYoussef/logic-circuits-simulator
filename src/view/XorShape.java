package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class XorShape extends ComponentShape {

	public XorShape(int id) {
		super(id);
	}

	public XorShape(int x, int y, Dimension dim, int id) {
		super(x, y, dim, id);
	}

	public void drawComponent(Graphics2D g2) {
		super.drawComponent();
		g2.setColor(Color.red);

		g2.drawLine(xPosition, yPosition + 5, xPosition + 24, yPosition + 5); // first line
		g2.drawLine(xPosition, yPosition + 45, xPosition + 24, yPosition + 45); // second line

		g2.drawArc(xPosition + 5, yPosition, 20, 50, -90, 180); // 1st right arc
		g2.drawArc(xPosition + 10, yPosition, 20, 50, -90, 180); // 2nd right
																	// arc
		g2.drawArc(xPosition - 30, yPosition, 100, 50, -90, 180); // 3rd right
																	// arc

		g2.drawLine(xPosition + 70, yPosition + 25, xPosition + 80,
				yPosition + 25); // right most line

		g2.fillOval(xPosition + 80, yPosition + 23, 4, 4); // right dot

		g2.fillOval(xPosition, yPosition + 3, 4, 4); // top left dot

		g2.fillOval(xPosition, yPosition + 43, 4, 4); // bottom left dot
	}

}
