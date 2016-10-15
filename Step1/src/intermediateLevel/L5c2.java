package intermediateLevel;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class L5c2 extends JFrame {
	
	private JButton reg;
	private JButton cus;
	
	public L5c2(){
		super("Title");
		setLayout(new FlowLayout());
		
		reg = new JButton("Regular");
		add(reg);
		
		Icon a = new ImageIcon(getClass().getResource("a.ico"));
		Icon b = new ImageIcon(getClass().getResource("a.ico"));
		
		cus = new JButton("Custom", a);
		cus.setRolloverIcon(b);
		add(cus);
		
		handle Han = new handle();
		reg.addActionListener(Han);
		cus.addActionListener(Han);	
	}
	
	private class handle implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s",event.getActionCommand()));
		}
	}
}