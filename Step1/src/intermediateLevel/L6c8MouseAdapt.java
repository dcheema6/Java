package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c8MouseAdapt extends JFrame {
	private String str;
	private JLabel stat;
	
	public L6c8MouseAdapt(){
		super("Adapter Class");
		
		stat = new JLabel("Default Status");
		add(stat, BorderLayout.SOUTH);
		addMouseListener(new MClass());
	}
	private class MClass extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			str = String.format("You clicked %d times", e.getClickCount());
			if(e.isMetaDown()) str += " with right Mouse Buton";
			else if(e.isAltDown()) str += " with middle Mouse button";
			else str += " with left Mouse Button";
			stat.setText(str);
		}
	}
}
