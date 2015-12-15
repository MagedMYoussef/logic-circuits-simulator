package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Shape;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class ComponentShape extends JLabel {
	// this will specify the location and dimensions of the shape
	protected int xPosition;
	protected int yPosition;
	protected Dimension componentDimension;
	protected int componentID;
	
	public ComponentShape(int id) {
		setLayout(new BorderLayout());
		this.xPosition = 100;
		this.yPosition = 100;
		this.componentDimension = new Dimension(70,50);
		this.componentID = id;
	}
	
	public ComponentShape(int x, int y, Dimension dim, int id) {
		this.xPosition = x;
		this.yPosition = y;
		this.componentDimension = dim;
		this.componentID = id;
	}
	
	// functions to be implemented by specific shapes
	protected void drawComponent() {

	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public Dimension getComponentDimension() {
		return componentDimension;
	}

	public void setComponentDimension(Dimension componentDimension) {
		this.componentDimension = componentDimension;
	}

	public int getComponentID() {
		return componentID;
	}

	public void setComponentID(int componentID) {
		this.componentID = componentID;
	}
	
}
