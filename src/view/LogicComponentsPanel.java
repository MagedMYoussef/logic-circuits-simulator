package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class LogicComponentsPanel extends JPanel {

	// JTree to hold the Logic Components
	private JTree componentsTree;
	private ComponentsCellRenderer componentRenderer;
	
	// The constructor
	public LogicComponentsPanel() {

		setBackground(Color.black);
		componentRenderer = new ComponentsCellRenderer();
		
		setPreferredSize(new Dimension(300,800));

		DefaultMutableTreeNode logicComponents = new DefaultMutableTreeNode(
				"Logic Components");

		createNodes(logicComponents);

		componentsTree = new JTree(logicComponents);
		componentsTree.setCellRenderer(componentRenderer);

		// Adding the tree to a scroll pane
		JScrollPane componentsScrollPane = new JScrollPane(componentsTree);

		setLayout(new BorderLayout());

		add(componentsScrollPane, BorderLayout.CENTER);
	}

	private void createNodes(DefaultMutableTreeNode logicComponents) {
		// Creates references to branches and nodes in order to set them later
		DefaultMutableTreeNode element = null;

		/***** FIRST CATEGORY *****/
		// Creating the first category and Adding it to the root branch
		// "logicComponents"
		DefaultMutableTreeNode wiring = new DefaultMutableTreeNode(
				"Wiring and Connections");
		logicComponents.add(wiring);

		componentsElement[] elements = new componentsElement[] {
				new componentsElement("Wire one",
						createIcon("/images/wiring.gif")),
				new componentsElement("Wire Two",
						createIcon("/images/wiring.gif")),
				};

		for (int i = 0; i < elements.length; i++) {
			element = new DefaultMutableTreeNode(elements[i]);
			wiring.add(element);
		}

		/***** SECOND CATEGORY *****/
		// Creating the second category and Adding it to the root branch
		// "logicComponents"
		DefaultMutableTreeNode gates = new DefaultMutableTreeNode("Gates");
		logicComponents.add(gates);

		elements = new componentsElement[] {
				new componentsElement("NOT Gate",
						createIcon("/images/notGate.gif")),
				new componentsElement("AND Gate",
						createIcon("/images/andGate.gif")),
				new componentsElement("OR Gate",
						createIcon("/images/orGate.gif")),
				new componentsElement("XOR Gate",
						createIcon("/images/xorGate.gif")),
				new componentsElement("NAND Gate",
						createIcon("/images/nandGate.gif")),
				new componentsElement("NOR Gate",
						createIcon("/images/norGate.gif")),
				new componentsElement("XNOR Gate",
						createIcon("/images/xnorGate.gif")), };

		for (int i = 0; i < elements.length; i++) {
			element = new DefaultMutableTreeNode(elements[i]);
			gates.add(element);
		}

		/***** THIRD CATEGORY *****/
		// Creating the third category and Adding it to the root branch
		// "logicComponents"
		DefaultMutableTreeNode compositeShapes = new DefaultMutableTreeNode(
				"Composite Shapes");
		logicComponents.add(compositeShapes);

		elements = new componentsElement[] {
				new componentsElement("Mux", createIcon("/images/multiplexer.gif")),
				new componentsElement("Dec", createIcon("/images/decoder.gif")), };

		for (int i = 0; i < elements.length; i++) {
			element = new DefaultMutableTreeNode(elements[i]);
			compositeShapes.add(element);
		}

		/***** FOURTH CATEGORY *****/
		// Creating the third category and Adding it to the root branch
		// "logicComponents"
		DefaultMutableTreeNode inout = new DefaultMutableTreeNode(
				"Inputs & Outputs");
		logicComponents.add(inout);

		elements = new componentsElement[] {
				new componentsElement("Input",
						createIcon("/images/input.gif")),
				new componentsElement("Output 0",
						createIcon("/images/logicalZero.gif")),
				new componentsElement("Output 1",
						createIcon("/images/logicalOne.gif")), };

		for (int i = 0; i < elements.length; i++) {
			element = new DefaultMutableTreeNode(elements[i]);
			inout.add(element);
		}

	}

	// For holding the details of the every component
	public class componentsElement {
		private String type;
		private ImageIcon icon;

		componentsElement(String type, ImageIcon icon) {
			this.type = type;
			this.icon = icon;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public ImageIcon getIcon() {
			return icon;
		}

		public void setIcon(ImageIcon icon) {
			this.icon = icon;
		}

	}

	// A Simple function to get the icon in the specified url
	public static ImageIcon createIcon(String path) {
		URL url = System.class.getResource(path);

		if (url == null) {
			System.err.println("Unable to load image: " + path);
		}

		ImageIcon icon = new ImageIcon(url);

		return icon;
	}
}
