package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c4DropDownList extends JFrame {
	
	@SuppressWarnings("rawtypes")
	private JComboBox list;
	private Icon [] pic = {new ImageIcon(getClass().getResource("a.png")), new ImageIcon(getClass().getResource("b.png")), new ImageIcon(getClass().getResource("c.png")), new ImageIcon(getClass().getResource("shit.png"))};
	private static String [] names = {"Tomb Raider","Mirrors Edge","Britney Spears", "Shit"};
	private JLabel lab;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public L6c4DropDownList(){
		super("Drop Down List");
		setLayout(new FlowLayout());
		
		list = new JComboBox(names);
		
		list.addItemListener(//Instead of making separate class we area just making a anonymous class
			new ItemListener(){
			    public void itemStateChanged(ItemEvent event)
			    {
				    lab.setIcon(pic[list.getSelectedIndex()]);
			    }
		    }
		);
		add(list);
		lab = new JLabel(pic[0]);
		add(lab);
	}
	
}
