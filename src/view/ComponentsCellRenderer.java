package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import view.LogicComponentsPanel.componentsElement;

public class ComponentsCellRenderer implements TreeCellRenderer {

	private JLabel elementLabel;
	private DefaultTreeCellRenderer categoryBranch;
	private Color elementforeground;
	private Color elementbackground;

	public ComponentsCellRenderer() {
		elementLabel = new JLabel();
		categoryBranch = new DefaultTreeCellRenderer();
		elementLabel.setOpaque(true);
	}	

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {

		if (leaf) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
			LogicComponentsPanel.componentsElement element = (componentsElement) node
					.getUserObject();

			// Customizing label icon, text and font
			elementLabel.setIcon(element.getIcon());
			elementLabel.setText(element.getType());
			elementLabel.setFont(new Font("Serif", Font.PLAIN, 12));
			
			if (selected) {
				elementLabel.setForeground(new Color(255, 255, 255));
				elementLabel.setBackground(new Color(51, 153, 255));

			} else {
				elementLabel.setForeground(elementforeground);
				elementLabel.setBackground(elementbackground);
			}

			return elementLabel;

		} else {
			return categoryBranch.getTreeCellRendererComponent(tree, value,
					selected, expanded, leaf, row, hasFocus);
		}
	}

}
