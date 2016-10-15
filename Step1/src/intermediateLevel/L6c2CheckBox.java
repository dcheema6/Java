package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c2CheckBox extends JFrame {
	
	private JTextField tf;
	private JCheckBox Bold;
	private JCheckBox Italic;
	
	public L6c2CheckBox () {
		super("CheckBox Program");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Davinderpal Cheema the Great Programmer?(USE CAPITAL LETTERS)",40);
		tf.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		add(tf);
		
		Bold = new JCheckBox("Bold");
		Italic = new JCheckBox("Italic");
		add(Bold);
		add(Italic);
		
		Best List = new Best();
		Listener act = new Listener();
		Bold.addItemListener(act);//have to use .addActionListener(List) if using my way
		Italic.addItemListener(act);	
		tf.addActionListener(List);
	}	
	private class Best implements ActionListener {
	//	private int numB = 0;
	//	private int numI = 0;
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == tf){
				String str = event.getActionCommand();
				if (str.equals("NO")){//to compare strings this the syntax to use
				    Icon S = new ImageIcon(getClass().getResource("shit.png"));
					JOptionPane.showMessageDialog(null, "YOU ARE A PEICE OF SHIT","Sucker",JOptionPane.PLAIN_MESSAGE,S);
				}
				else if (str.equals("YES")){
					Icon A = new ImageIcon(getClass().getResource("awesome.jpg"));
					JOptionPane.showMessageDialog(null, "You Are", "My Nigga", JOptionPane.PLAIN_MESSAGE, A);
				}
			}
		/*    if(event.getSource() == Bold && numB %2 == 0) numB++;
		    else if(event.getSource() == Italic && numI %2 == 0) numI++;
		    else{
			    tf.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			    if(event.getSource() == Bold) numB++;
     	        else numI++;
			}
		    if(numB %2 != 0 && numI %2 != 0) tf.setFont(new Font("Trebuchet MS" ,Font.BOLD + Font.ITALIC , 16));
		    else if(numB%2!=0) tf.setFont(new Font("Trebuchet MS" ,Font.BOLD , 16));
		    else if(numI%2!=0) tf.setFont(new Font("Trebuchet MS" ,Font.ITALIC , 16));;*/
		}
	} //My way using integers as always
	//Below is Easier way
	private class Listener implements ItemListener {
		public void itemStateChanged(ItemEvent event){
			Font F = null;
			if(Bold.isSelected() && Italic.isSelected()) F = new Font("Trebuchet MS", Font.BOLD + Font.ITALIC, 16);
			else if(Bold.isSelected()) F=new Font("Trebuchet MS", Font.BOLD, 16);
			else if(Italic.isSelected()) F=new Font("Trebuchet MS", Font.ITALIC, 16);
			else F=new Font("Trebuchet MS", Font.PLAIN, 16);
			tf.setFont(F);
		}
	}
	
}
