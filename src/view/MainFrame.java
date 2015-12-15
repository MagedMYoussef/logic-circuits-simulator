package view; 

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private LogicComponentsPanel componentsPanel;
	private DrawingPanel drawingPanel;
	
	public MainFrame() {
		super("Logic Simulator");

		setLayout(new BorderLayout());

		componentsPanel = new LogicComponentsPanel();
		drawingPanel = new DrawingPanel();
		
		add(componentsPanel, BorderLayout.LINE_START);
		add(drawingPanel, BorderLayout.CENTER);
		
		setResizable(true);
		setSize(1200, 800);
		
		pack();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
