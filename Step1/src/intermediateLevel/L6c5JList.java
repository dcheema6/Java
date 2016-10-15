package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class L6c5JList extends JFrame {
	@SuppressWarnings("rawtypes")
	private JList list;
	private Color[] color = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	private static String[] name = {"Blue","Green","Yellow","Orange","Red"};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public L6c5JList(){
		super("Color List");
		setLayout(new FlowLayout());
		
		list = new JList(name);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));//JScrollPane lets us put a scroll bar
		
		list.addListSelectionListener(
			new ListSelectionListener(){
				public void valueChanged(ListSelectionEvent event){
					 getContentPane().setBackground(color[list.getSelectedIndex()]);
				}
			}
		);
	}
}
